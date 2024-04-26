/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dti
 */
public class ConnectionFactory {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String DATABASE_URL="";
    
    public static Connection createConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
        return con;
    }
}
