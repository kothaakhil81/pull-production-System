package aurobindo.pharma;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author k.chinnA
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection con;
    public static Connection ConnecrDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://192.168.43.39:3306/pharmacy","root","1884");
                    return con;
                    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
