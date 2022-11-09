/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

/**
 *
 * @author admin
 */
public class HoaDonV2 {

    private String tenDangNhap, tenBan, tenDoDung;
    private int maHoaDon, soLuong;
    private float giaDoDung, thanhTien;
    private Date ngayLap;
    private String gioLap;

    public HoaDonV2() {
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getGioLap() {
        return gioLap;
    }

    public void setGioLap(String gioLap) {
        this.gioLap = gioLap;
    }

    public HoaDonV2(String tenDangNhap, String tenBan, String tenDoDung, int soLuong, float giaTriDoDung, float thanhTien, Date ngayLap) {

        this.tenDangNhap = tenDangNhap;
        this.tenBan = tenBan;
        this.tenDoDung = tenDoDung;
        this.soLuong = soLuong;
        this.giaDoDung = giaTriDoDung;
        this.thanhTien = thanhTien;
        this.ngayLap = ngayLap;
    }


    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
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

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public HoaDonV2(int maHoaDon, String tenDangNhap, String tenBan, float thanhTien, Date ngayLap) {
        this.maHoaDon = maHoaDon;
        this.tenDangNhap = tenDangNhap;
        this.tenBan = tenBan;
        this.thanhTien = thanhTien;
        this.ngayLap = ngayLap;
    }
    

    public String XuatHoaDon() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t Hoa Don Ban Hang \n");
        sb.append(String.format("Mã hóa đơn: %d\n", maHoaDon));
        sb.append(String.format("Người lập hóa đơn: %s\n", tenDangNhap));
        sb.append(String.format("Bàn: %s\n", tenBan));
        sb.append(String.format("Tên đồ dùng: %s\n", tenDoDung));
        sb.append(String.format("Số lượng: %d\n", soLuong));
        sb.append(String.format("Giá đồ dùng: %f\n", giaDoDung));
        sb.append(String.format("Thành tiên: %f\n", thanhTien));
        sb.append(String.format("Ngay lap HD: %s\n", df.format(ngayLap)));
        //sb.append("\t\t Chi Tiet Hang Hoa \n");
        //sb.append(String.format("%s\n", XuatDSHangHoa()));
        //sb.append(String.format("\t\t\t Tri Gia Hoa Don = %f", GiaTriHoaDon()));
        return sb.toString();

    }

}
