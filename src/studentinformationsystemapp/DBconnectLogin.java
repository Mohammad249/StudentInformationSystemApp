/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentinformationsystemapp;

/**
 *
 * @author Al Azad
 */
import java.sql.*;
import javax.swing.*;
public class DBconnectLogin {
    
     Connection conn = null;
    
    public static Connection ConnecrDb()
    {
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/LoginDB","root","");
                // JOptionPane.showMessageDialog(null,"Connection Establist");
                    return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
  
}
