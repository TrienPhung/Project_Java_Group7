/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ACER
 */
public class JDBC_MySql {
    private static final String url = "jdbc:mysql://localhost:3306/qlhocvien";
    private static final String user = "root";
    private static final String password = "Trien1112003#";
    private static Connection conn;
    public static Connection CSDL() throws SQLException{
        Connection con = DriverManager.getConnection(url, user, password);
        return con;
    }

    public JDBC_MySql() throws SQLException {
       this.conn = DriverManager.getConnection(url, user, password);
    }

    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        JDBC_MySql.conn = conn;
    }
    
}
