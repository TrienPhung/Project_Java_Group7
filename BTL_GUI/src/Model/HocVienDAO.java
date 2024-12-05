/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import JDBC.JDBC_MySql;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class HocVienDAO {//Model - Database Access Object

    private final Connection connection;

    public HocVienDAO() throws SQLException, ClassNotFoundException {
        this.connection = JDBC_MySql.CSDL();
    }

    public List<HocVien> getAllHocVien() throws SQLException {
        List<HocVien> list = new ArrayList<>();
        String sql = "SELECT * FROM HocVien";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            HocVien hv = new HocVien(
                    rs.getString("maHv"),
                    rs.getString("tenHv"),
                    rs.getString("gioiTinh"),
                    rs.getInt("tuoi"),
                    rs.getString("email"),
                    rs.getString("quequan"),
                    rs.getFloat("diemTB")
            );
            list.add(hv);
        }
        return list;
    }

    // Thêm học viên
    public boolean addHocVien(HocVien hv) throws SQLException {
        String sql = "INSERT INTO HocVien(maHv, tenHv, gioiTinh,tuoi, email,quequan,diemTB) VALUES (?, ?, ?, ?, ?, ?,?);";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, hv.getMaHv());
        statement.setString(2, hv.getTenHv());
        statement.setString(3, hv.getGioiTinh());
        statement.setInt(4, hv.getTuoi());
        statement.setString(5, hv.getEmail());
        statement.setString(6, hv.getQuequan());
        statement.setFloat(7, hv.getDiemTB());
        return statement.executeUpdate() > 0;
    }

    // Sửa học viên
    public boolean updateHocVien(HocVien hv) throws SQLException {
        String sql = "UPDATE HocVien SET tenHv = ?, gioiTinh = ?, tuoi = ?, email = ?, diemTB = ?, quequan = ? WHERE maHv = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, hv.getTenHv());
        statement.setString(2, hv.getGioiTinh());
        statement.setInt(3, hv.getTuoi());    
        statement.setString(4, hv.getEmail());
        statement.setFloat(5, hv.getDiemTB());
        statement.setString(6, hv.getQuequan());
        statement.setString(7, hv.getMaHv());
        return statement.executeUpdate() > 0;
    }

    // Xóa học viên
    public boolean deleteHocVien(String maDelete) throws SQLException {
        String sql = "DELETE FROM HocVien WHERE maHv = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, maDelete);
        return statement.executeUpdate() > 0;
    }

    // Tìm kiếm học viên
    public List<HocVien> searchHocVien(String keyword) throws SQLException {
        String searchKeyword = "%" + keyword.toLowerCase() + "%";
        String sql = "SELECT * FROM HocVien WHERE LOWER(tenhv) LIKE ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, searchKeyword);
        ResultSet rs = statement.executeQuery();
        List<HocVien> list = new ArrayList<>();
        while (rs.next()) {
            HocVien hv = new HocVien(
                    rs.getString("maHv"),
                    rs.getString("tenHv"),
                    rs.getString("gioiTinh"),
                    rs.getInt("tuoi"),
                    rs.getString("email"),
                    rs.getString("quequan"),
                    rs.getFloat("diemTB")
            );
            list.add(hv);
        }
        return list;
    }
     // Chèn học viên vào danh sách tại vị trí cụ thể
    public void insertHocVienAt(List<HocVien> list, HocVien hocVien, int position) {
        if (position < 0 || position > list.size()) {
            System.out.println("Vị trí không hợp lệ!");
            return;
        }
        list.add(position, hocVien); // Thêm học viên tại vị trí
    }
}
