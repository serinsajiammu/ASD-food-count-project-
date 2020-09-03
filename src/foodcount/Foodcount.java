/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author serin
 */
public class Foodcount {

    /**
     * @param args the command line arguments
     */
    
   static final String url="jdbc:mysql://localhost:3306/foodcount";
   static final String user="root";
   static final String pass="root";
    public static void main(String[] args) {
        // TODO code application logic here
        
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn=DriverManager.getConnection(url,user,pass);
          new home().setVisible(true);
          
           System.out.println("Sucess");
       }catch(Exception e){System.out.println(e);}
    }
    
}





