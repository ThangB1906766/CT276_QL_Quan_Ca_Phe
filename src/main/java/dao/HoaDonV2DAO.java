/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helpers.DatabaseHelper;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.BanHang;
import model.HoaDonV2;

/**
 *
 * @author admin
 */
public class HoaDonV2DAO implements DAOinterface<HoaDonV2> {

    @Override
    public int Insert(HoaDonV2 t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int ketQua = 0;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "INSERT INTO HoaDon(tenDangNhap, tenBan ,tenDoDung ,soLuong ,giaDoDung ,thanhTien, ngayLap) "
                    + " VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, t.getTenDangNhap());
            pst.setString(2, t.getTenBan());
            pst.setString(3, t.getTenDoDung());
            pst.setInt(4, t.getSoLuong());
            pst.setFloat(5, t.getGiaDoDung());
            pst.setFloat(6, t.getThanhTien());
            pst.setDate(7, t.getNgayLap());

            // B3: Thực thi sql
            ketQua = pst.executeUpdate();
            // B4: Xử lý dữ liệu
            System.out.println("Ban da thuc thi " + sql);
            System.out.println("Có " + ketQua + " ket qua bi thay doi!!");
            // B5: Đóng csdl
            con.close();
        } catch (Exception e) {
            System.out.println("Lỗi sql rồi");
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int Update(HoaDonV2 t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int Delete(HoaDonV2 t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HoaDonV2> selectAll() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ArrayList<HoaDonV2> list = new ArrayList<>();
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "SELECT * FROM HoaDon ";
            PreparedStatement pst = con.prepareStatement(sql);

            // B3: Thực thi sql
            ResultSet rs = pst.executeQuery();
            // B4: Xử lý dữ liệu
            System.out.println("Ban da thuc thi " + sql);

            while (rs.next()) {
                int maHoaDon = rs.getInt("maHoaDon");
                String tenDangNhap = rs.getString("tenDangNhap");
                String tenBan = rs.getString("tenBan");
                float thanhTien = rs.getFloat("thanhTien");
                Date ngayLap = rs.getDate("ngayLap");
                HoaDonV2 hd = new HoaDonV2(maHoaDon, tenDangNhap, tenBan, thanhTien, ngayLap);
                list.add(hd);

            }

            //  System.out.println("Có " + ketQua + " ket qua bi thay doi!!");
            // B5: Đóng csdl
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public HoaDonV2 selectById(HoaDonV2 t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HoaDonV2> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
