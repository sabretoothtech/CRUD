/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author YAXMA
 */

public class Conexion {
  Connection conn= null;
public static Connection ConnecrDb(){
    
    try{
    Class.forName("org.sqlite.JDBC");
    Connection conn =DriverManager.getConnection("jdbc:sqlite:CRUD.db");
    
    return conn;
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
       return null;
       
       }
    
    }
    
}  

