/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.HocVien;
import Model.HocVienDAO;
import View.HocVienView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class HocVienController {

    private HocVienView view;
    private HocVienDAO model;

    public HocVienController(HocVienView view, HocVienDAO model) {
        this.view = view;
        this.model = model;

        // Load dữ liệu vào bảng khi khởi động
        //loadTableData();
        // Xử lý sự kiện nút Hiển thị
        view.getBtnShow().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadTableData();
            }
        });
        // Xử lý sự kiện nút Thêm
        view.getBtnAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addHocVien();
            }
        });
        // Xử lý sự kiện nút Chèn
        view.getBtnChen().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertHocVien();
            }
        });

        // Xử lý sự kiện nút Sửa
        view.getBtnUpdate().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateHocVien();
            }
        });

        // Xử lý sự kiện nút Xóa
        view.getBtnDelete().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteHocVien();
            }
        });

        // Xử lý sự kiện nút Tìm kiếm
        view.getBtnSearch().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchHocVien();
            }
        });
        // Xử lý sự kiện nút Thoát
        view.getBtnExit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // Xử lý sự kiện nút Reset
        view.getBtnReset().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTxtMaHocVien().setText("");
                view.getTxtTenHocVien().setText("");
                view.getBtnGroupGender().clearSelection();
                view.getTxtTuoi().setText("");
                view.getTxtEmail().setText("");
                view.getTxtComboBoxAddress().setSelectedIndex(0);
                view.getTxtDiemTB().setText("");
                view.getTxtTimKiemTen().setText("");
            }
        });
        // Xử lý sự kiện khi ấn chuột
        view.getjTable().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = view.getjTable().getSelectedRow();
                //Lay gia tri cac cot trong hang vua chon
                String maHocVien = view.getjTable().getValueAt(row, 0).toString();
                String tenHocVien = view.getjTable().getValueAt(row, 1).toString();
                String gioiTinhHV = view.getjTable().getValueAt(row, 2).toString();
                String tuoi = view.getjTable().getValueAt(row, 3).toString();
                String email = view.getjTable().getValueAt(row, 4).toString();
                String queQuan = view.getjTable().getValueAt(row, 5).toString();
                String diemTB = view.getjTable().getValueAt(row, 6).toString();

                //Dua gia tri vua chon len TextFiled
                view.getTxtMaHocVien().setText(maHocVien);
                view.getTxtTenHocVien().setText(tenHocVien);
                if (view.getTxtNam().getText().equals(gioiTinhHV)) {
                    view.getTxtNam().setSelected(true);
                } else if (view.getTxtNu().getText().equals(gioiTinhHV)) {
                    view.getTxtNu().setSelected(true);
                } else {
                    view.getBtnGroupGender().clearSelection();
                }
                view.getTxtTuoi().setText(tuoi);
                view.getTxtEmail().setText(email);
                if (queQuan.equals("")) {
                    view.getTxtComboBoxAddress().setSelectedIndex(0);
                } else {
                    view.getTxtComboBoxAddress().setSelectedItem(queQuan);
                }
                view.getTxtDiemTB().setText(diemTB);
            }

        });
    }

    // Thêm học viên
    private void addHocVien() {
        try {
            String maHocVien = view.getTxtMaHocVien().getText();
            String tenHocVien = view.getTxtTenHocVien().getText();
            String gioiTinhHV = view.getTxtNam().isSelected() ? "Nam" : view.getTxtNu().isSelected() ? "Nu" : "";
            int tuoi;
            String email = view.getTxtEmail().getText();
            String queQuan = view.getTxtComboBoxAddress().getSelectedItem().toString();
            if (queQuan.equals(view.getTxtComboBoxAddress().getItemAt(0))) {
                queQuan = "";
            }
            float diemTB;
            if (maHocVien.equals("") || tenHocVien.equals("")) {
                JOptionPane.showMessageDialog(view, "Vui lòng nhập dữ liệu");
                return;
            }
            try {
                tuoi = Integer.parseInt(view.getTxtTuoi().getText());
                if (tuoi < 1 || tuoi > 100) {
                    JOptionPane.showMessageDialog(view, "Tuổi không hợp lệ");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(view, "Kiểm tra lại tuổi");
                return;
            }
            try {
                diemTB = Float.parseFloat(view.getTxtDiemTB().getText());
                if (diemTB < 0 || diemTB > 10) {
                    JOptionPane.showMessageDialog(view, "Điểm thi không hợp lệ");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(view, "Kiểm tra lại điểm");
                return;
            }
            HocVien hv = new HocVien(maHocVien, tenHocVien, gioiTinhHV, tuoi, email, queQuan, diemTB);
            if (model.addHocVien(hv)) {
                JOptionPane.showMessageDialog(view, "Thêm học viên thành công!");
                loadTableData(); // Tải lại dữ liệu bảng
            } else {
                JOptionPane.showMessageDialog(view, "Thêm học viên thất bại!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, "Lỗi: " + ex.getMessage());
        }
    }

    // Chèn học viên
    private void insertHocVien() {
        try {
            String maHocVien = view.getTxtMaHocVien().getText();
            String tenHocVien = view.getTxtTenHocVien().getText();
            String gioiTinhHV = view.getTxtNam().isSelected() ? "Nam" : view.getTxtNu().isSelected() ? "Nu" : "";
            int tuoi;
            String email = view.getTxtEmail().getText();
            String queQuan = view.getTxtComboBoxAddress().getSelectedItem().toString();
            if (queQuan.equals(view.getTxtComboBoxAddress().getItemAt(0))) {
                queQuan = "";
            }
            float diemTB;
            if (maHocVien.equals("") || tenHocVien.equals("")) {
                JOptionPane.showMessageDialog(view, "Vui lòng nhập dữ liệu");
                return;
            }
            try {
                tuoi = Integer.parseInt(view.getTxtTuoi().getText());
                if (tuoi < 1 || tuoi > 100) {
                    JOptionPane.showMessageDialog(view, "Tuổi không hợp lệ");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(view, "Kiểm tra lại tuổi");
                return;
            }
            try {
                diemTB = Float.parseFloat(view.getTxtDiemTB().getText());
                if (diemTB < 0 || diemTB > 10) {
                    JOptionPane.showMessageDialog(view, "Điểm thi không hợp lệ");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(view, "Kiểm tra lại điểm");
                return;
            }
            HocVien newHocVien = new HocVien(maHocVien, tenHocVien, gioiTinhHV, tuoi, email, queQuan, diemTB);
            // Lấy vị trí muốn chèn
            int position = Integer.parseInt(view.getTxtPosition().getText());
            // Lấy danh sách học viên hiện tại
            List<HocVien> hocVienList = model.getAllHocVien();
            if (position < 0 || position > hocVienList.size()) {
                JOptionPane.showMessageDialog(view, "Vị trí không hợp lệ!");
                return;
            } else {
                // Chèn học viên vào danh sách tại vị trí chỉ định
                model.insertHocVienAt(hocVienList, newHocVien, position);
                loadTableData(); // Tải lại dữ liệu bảng
                JOptionPane.showMessageDialog(view, "Chèn học viên thành công!");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, "Lỗi: " + ex.getMessage());
        }
    }

    // Sửa học viên
    private void updateHocVien() {
        try {
            String maHocVien = view.getTxtMaHocVien().getText();
            String tenHocVien = view.getTxtTenHocVien().getText();
            String gioiTinhHV = view.getTxtNam().isSelected() ? "Nam" : view.getTxtNu().isSelected() ? "Nu" : "";
            int tuoi;
            String email = view.getTxtEmail().getText();
            String queQuan = view.getTxtComboBoxAddress().getSelectedItem().toString();
            if (queQuan.equals(view.getTxtComboBoxAddress().getItemAt(0))) {
                queQuan = "";
            }
            float diemTB;

            if (maHocVien.equals("") || tenHocVien.equals("")) {
                JOptionPane.showMessageDialog(view, "Vui lòng nhập dữ liệu");
                return;
            }
            try {
                tuoi = Integer.parseInt(view.getTxtTuoi().getText());
                if (tuoi < 1 || tuoi > 100) {
                    JOptionPane.showMessageDialog(view, "Tuổi không hợp lệ");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(view, "Kiểm tra lại tuổi");
                return;
            }
            try {
                diemTB = Float.parseFloat(view.getTxtDiemTB().getText());
                if (diemTB < 0 || diemTB > 10) {
                    JOptionPane.showMessageDialog(view, "Điểm thi không hợp lệ");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(view, "Kiểm tra lại điểm");
                return;
            }
            HocVien hv = new HocVien(maHocVien, tenHocVien, gioiTinhHV, tuoi, email, queQuan, diemTB);
            if (model.updateHocVien(hv)) {
                JOptionPane.showMessageDialog(view, "Sửa học viên thành công!");
                loadTableData(); // Tải lại dữ liệu bảng
            } else {
                JOptionPane.showMessageDialog(view, "Sửa học viên thất bại!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, "Lỗi: " + ex.getMessage());
        }
    }

    // Xóa học viên
    private void deleteHocVien() {
        try {
            String maDelete = view.getTxtMaHocVien().getText();
            if (maDelete.equals("")) {
                JOptionPane.showMessageDialog(view, "Vui lòng Click chuột vào bản ghi hoặc nhập mã học viên để xóa!");
                return;
            }
            if (model.deleteHocVien(maDelete)) {
                JOptionPane.showMessageDialog(view, "Xóa học viên thành công!");
                loadTableData(); // Tải lại dữ liệu bảng
            } else {
                JOptionPane.showMessageDialog(view, "Xóa học viên thất bại!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, "Lỗi: " + ex.getMessage());
        }
    }

    // Tìm kiếm học viên
    private void searchHocVien() {
        try {
            String keyword = view.getTxtTimKiemTen().getText().trim();
            if (keyword.isEmpty()) {
                JOptionPane.showMessageDialog(view, "Vui lòng nhập mã học viên!");
                return;
            }
            List<HocVien> list = model.searchHocVien(keyword);
            DefaultTableModel tableModel = (DefaultTableModel) view.getjTable().getModel();
            tableModel.setRowCount(0); // Xóa dữ liệu cũ
            if (!list.isEmpty()) {
                JOptionPane.showMessageDialog(view, "Tìm kiếm học viên thành công!");
                for (HocVien hv : list) {
                    tableModel.addRow(new Object[]{
                        hv.getMaHv(),
                        hv.getTenHv(),
                        hv.getGioiTinh(),
                        hv.getTuoi(),
                        hv.getEmail(),
                        hv.getQuequan(),
                        hv.getDiemTB()
                    });
                }
                view.getjTable().setModel(tableModel);
            } else {
                JOptionPane.showMessageDialog(view, "Không tìm thấy học viên!");

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, "Lỗi: " + ex.getMessage());
        }
    }

    // Load dữ liệu từ database lên JTable
    private void loadTableData() {
        try {
            List<HocVien> list = model.getAllHocVien();
            DefaultTableModel tableModel = (DefaultTableModel) view.getjTable().getModel();
            tableModel.setRowCount(0); // Xóa dữ liệu cũ
            for (HocVien hv : list) {
                tableModel.addRow(new Object[]{
                    hv.getMaHv(),
                    hv.getTenHv(),
                    hv.getGioiTinh(),
                    hv.getTuoi(),
                    hv.getEmail(),
                    hv.getQuequan(),
                    hv.getDiemTB()
                });
            }
            view.getjTable().setModel(tableModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
