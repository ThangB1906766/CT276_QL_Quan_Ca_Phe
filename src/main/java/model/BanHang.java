/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class BanHang {
    private String tenBan, tenDoDung;
    private float giaDoDung, thanhTien;
    private int soLuong;

    public BanHang() {
    }

    public BanHang(String tenBan) {
        this.tenBan = tenBan;
    }

    public BanHang(String tenBan, float thanhTien) {
        this.tenBan = tenBan;
        this.thanhTien = thanhTien;
    }

    public BanHang(String tenBan, String tenDoDung, int soLuong, float giaDoDung, float thanhTien) {
        this.tenBan = tenBan;
        this.tenDoDung = tenDoDung;
        this.giaDoDung = giaDoDung;
        this.thanhTien = thanhTien;
        this.soLuong = soLuong;
    }

    public BanHang(String tenDoDung, int soLuong, float giaDoDung) {
        this.tenDoDung = tenDoDung;
        this.giaDoDung = giaDoDung;
        this.soLuong = soLuong;
    }
    
    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getTenDoDung() {
        return tenDoDung;
    }

    public void setTenDoDung(String tenDoDung) {
        this.tenDoDung = tenDoDung;
    }

    public float getGiaDoDung() {
        return giaDoDung;
    }

    public void setGiaDoDung(float giaDoDung) {
        this.giaDoDung = giaDoDung;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public float ThanhTien(){
        return (float)soLuong*giaDoDung;
    }
    
    public String Xuat(){
        return String.format("%-25s %d %f %f\n", tenDoDung , soLuong, giaDoDung, ThanhTien());
    }
}
