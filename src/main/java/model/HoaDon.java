/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.nimbusds.oauth2.sdk.util.date.SimpleDate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Arrays;

/**
 *
 * @author admin
 */
public class HoaDon {

    private String idHoaDon;
    private Date ngayLap;
    private BanHang[] dsBanHang;

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public BanHang[] getDsBanHang() {
        return dsBanHang;
    }

    public void setDsBanHang(BanHang[] dsBanHang) {
        this.dsBanHang = dsBanHang;
    }

    public HoaDon() {
        idHoaDon = "";
        ngayLap = new Date();
        dsBanHang = new BanHang[0];

    }

    public HoaDon(String idHoaDon, Date ngayLap, BanHang[] dsBanHang) {
        this.idHoaDon = idHoaDon;
        this.ngayLap = ngayLap;
        this.dsBanHang = dsBanHang;
    }

    public void ThemHang(BanHang bh) {
        dsBanHang = Arrays.copyOf(dsBanHang, dsBanHang.length + 1); // Coppy mảng cũ sang mảng mới kích cỡ +1
        dsBanHang[dsBanHang.length - 1] = bh; // Gán phần tử cuối dùng mảng = bh truyền vào
    }

   public float GiaTriHoaDon() {
        float giaTri = 0;
        for (BanHang banHang : dsBanHang) {
            giaTri += banHang.ThanhTien(); // Có thể có lỗi
        }
        return giaTri;
    }

    public String XuatDSHangHoa() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-25s %8s %12s %12s\n", "Tên hàng", "Số lượng", "Đơn giá", "Thành tiền"));
        for (BanHang banHang : dsBanHang) {
            sb.append(banHang.Xuat());
        }
        return sb.toString();
    }

    public String XuatHoaDon() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t Hoa Don Ban Hang \n");
        sb.append(String.format("So HD: %s\n", idHoaDon));
        sb.append(String.format("Ngay lap HD: %s\n", df.format(ngayLap)));
        sb.append("\t\t Chi Tiet Hang Hoa \n");
        sb.append(String.format("%s\n", XuatDSHangHoa()));
        sb.append(String.format("\t\t\t Tri Gia Hoa Don = %f", GiaTriHoaDon()));
        return sb.toString();
        
    }
}
