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
public class Test {
    public static void main(String[] args) {
        BanHang bh = new BanHang();
        bh.setTenDoDung("Cà phê");
        bh.setSoLuong(1);
        bh.setGiaDoDung(15000);
        System.out.println(bh.Xuat());
        
        BanHang bh2 = new BanHang("Cà phê sữa", 2, 20000);
         System.out.println(bh2.Xuat());
         
         HoaDon hd = new HoaDon();
         hd.setIdHoaDon("HD01");
         hd.setNgayLap(new java.util.Date());
         hd.ThemHang(bh);
         hd.ThemHang(bh2);
         System.out.println(hd.XuatDSHangHoa());
         System.out.println(hd.XuatHoaDon());
    }
}
