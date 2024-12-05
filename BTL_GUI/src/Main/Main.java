/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controller.HocVienController;
import Model.HocVienDAO;
import View.HocVienView;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
         // Tạo đối tượng giao diện
        HocVienView view = new HocVienView();

        // Tạo đối tượng model (DAO)
        HocVienDAO model = new HocVienDAO();

        // Tạo đối tượng controller
        HocVienController controller = new HocVienController(view, model);

        // Hiển thị giao diện
        view.setVisible(true);
    }
}
