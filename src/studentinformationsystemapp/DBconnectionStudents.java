/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinformationsystemapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Al Azad
 */
public class DBconnectionStudents {
      
     public static Connection GetConnection()
    {
        
        try 
        {
             Connection conn = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn =   DriverManager.getConnection("jdbc:mysql://localhost/studentinformation","root",""); 
            return conn;
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(DBconnectionStudents.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
