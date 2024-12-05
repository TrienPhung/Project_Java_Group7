/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ACER
 */
public class HocVien {

    private String maHv;
    private String tenHv;
    private String gioiTinh;
    private int tuoi;
    private String email;
    private String quequan;
    private float diemTB;

    public HocVien() {
    }

    public HocVien(String maHv, String tenHv, String gioiTinh, int tuoi, String email, String quequan, float diemTB) {
        this.maHv = maHv;
        this.tenHv = tenHv;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.email = email;
        this.quequan = quequan;
        this.diemTB = diemTB;
    }
    
    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getMaHv() {
        return maHv;
    }

    public void setMaHv(String maHv) {
        this.maHv = maHv;
    }

    public String getTenHv() {
        return tenHv;
    }

    public void setTenHv(String tenHv) {
        this.tenHv = tenHv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}
