/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Ban {
    private String tenBan, trangThai, ghiChu;
    private int idBan;
    public Ban() {
    }

    public Ban(String tenBan) {
        this.tenBan = tenBan;
    }

    public Ban(String tenBan, String ghiChu) {
        this.tenBan = tenBan;
        this.ghiChu = ghiChu;
    }

    public Ban(int idBan, String tenBan, String trangThai, String ghiChu) {
        this.tenBan = tenBan;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
        this.idBan = idBan;
    }

    public int getIdBan() {
        return idBan;
    }

    public void setIdBan(int idBan) {
        this.idBan = idBan;
    }
    
    
    
    public Ban(String tenBan, String trangThai, String ghiChu) {
        this.tenBan = tenBan;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
}
