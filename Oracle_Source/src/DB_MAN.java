/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author devfo
 */

import java.sql.*;
import java.io.*;

public class DB_MAN {
    String strDriver = "oracle.jdbc.driver.OracleDriver";
    //String strURL = "jdbc:oracle:thin:@10.70.41.80:1521";
    String strURL = "jdbc:oracle:thin:@localhost:1521";
    String strUser = "INHATC";
    String strPWD = "inha1958";
    
    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
    
    public void dbOpen() throws IOException {
        HG_ErrorMessage();
        
        try {
            Class.forName(strDriver);
            DB_con = DriverManager.getConnection(strURL, strUser, strPWD);
            DB_stmt = DB_con.createStatement();
        }
        catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
            System.out.println("SQLException : " + e.toString());
        }
    }
    
    public void dbClose() throws IOException {
        try {
            DB_stmt.close();
            DB_con.close();
        }
        catch(Exception e) {
            System.out.println("SQLException : " + e.toString());
        }
    }
    
    public void HG_ErrorMessage() throws UnsupportedEncodingException {
        try {
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
