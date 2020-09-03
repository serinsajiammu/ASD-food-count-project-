/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcount;


import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author varsha
 */
public class Mysqlconnect {
    static final String url="jdbc:mysql://localhost:3306/foodcount";
   static final String user="root";
   static final String pass="root";
   public  Connection conn;
    Mysqlconnect() {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
         conn =DriverManager.getConnection(url,user,pass);
      
          
           System.out.println("Success");
       }catch(Exception e){System.out.println(e);}
    }
    public ResultSet getResultset(String Query){
         
        ResultSet rs=null;
        try{
            if(!conn.isClosed()){
                 
                Statement stnt=conn.createStatement();
                rs=stnt.executeQuery(Query);
                return rs;
            }else{
                System.err.println("2");
            }
        }
        catch(Exception e)
        {System.err.print(e+"");}
         return rs;
    }

    ResultSet getResultSet(String select__from_records) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }}