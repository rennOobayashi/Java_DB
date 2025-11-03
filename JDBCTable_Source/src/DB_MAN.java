
import java.io.*;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author devfo
 */
public class DB_MAN {
 String strDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
    String strURL = "jdbc:odbc:Automobile64";
    
    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
    
    public void dbOpen() throws IOException {
        HG_ErrorMessage();
        
        try {
            Class.forName(strDriver);
            DB_con = DriverManager.getConnection(strURL);
            DB_stmt = DB_con.createStatement();
        }
        catch (Exception e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLException: " + e.toString());
            e.printStackTrace();
        }
    }
    
    public void dbClose() throws IOException {
        try {
            DB_stmt.close();
            DB_con.close();
        }
        catch (Exception e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }
    
    public void HG_ErrorMessage() throws UnsupportedEncodingException {
        try {
            System.out.println(new java.io.PrintStream(System.out, true, "UTF-8"));
        }
        catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }   
}
