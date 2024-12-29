/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import View.Login;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
         Login login = new Login();
         login.setVisible(true);
    }
}
