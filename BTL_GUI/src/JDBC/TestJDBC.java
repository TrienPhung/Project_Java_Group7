/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author ACER
 */
public class TestJDBC {
    public static void main(String[] args){
        try {
            Connection con = JDBC_MySql.CSDL();
            if(con != null){
                System.out.println("Thanh cong");
            }else{
                System.out.println("That bai");
            }
        } catch (SQLException ex) {
            System.out.println("That bai");
            Logger.getLogger(TestJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
