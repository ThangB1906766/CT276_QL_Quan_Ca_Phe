/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author admin
 */
public class DoDung {
    private String idDoDung, tenDoDung;
    private float giaDoDung;
    private Date ngayKhuyenMai, ngayKetThuc;

    public DoDung() {
    }

    public DoDung(String idDoDung, String tenDoDung) {
        this.idDoDung = idDoDung;
        this.tenDoDung = tenDoDung;
    }

    public DoDung(String idDoDung) {
        this.idDoDung = idDoDung;
    }

    public DoDung(String idDoDung, String tenDoDung, float giaDoDung, Date ngayKhuyenMai, Date ngayKetThuc) {
        this.idDoDung = idDoDung;
        this.tenDoDung = tenDoDung;
        this.giaDoDung = giaDoDung;
        this.ngayKhuyenMai = ngayKhuyenMai;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getIdDoDung() {
        return idDoDung;
    }

    public void setIdDoDung(String idDoDung) {
        this.idDoDung = idDoDung;
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

    public Date getNgayKhuyenMai() {
        return ngayKhuyenMai;
    }

    public void setNgayKhuyenMai(Date ngayKhuyenMai) {
        this.ngayKhuyenMai = ngayKhuyenMai;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
    
}
