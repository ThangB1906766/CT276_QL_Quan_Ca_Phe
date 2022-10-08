/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/*
    Ngày 23/09/2022 Tạo class nhân viên để lưu các thông tin nhân viên tron csdl
 */
public class NhanVien {
    private String idNhanVien, hoVaTen, email, soDienThoai, diaChi;
    private int gioiTinh;

    public NhanVien() {
    }

    public NhanVien(String idNhanVien, String hoVaTen, String email, String soDienThoai, int gioiTinh, String diaChi) {
        this.idNhanVien = idNhanVien;
        this.hoVaTen = hoVaTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public NhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }
    
}
