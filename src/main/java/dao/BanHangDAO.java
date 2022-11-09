/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helpers.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Ban;
import model.BanHang;

/**
 *
 * @author admin
 */
public class BanHangDAO implements DAOinterface<BanHang> {

    @Override
    public int Insert(BanHang t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int ketQua = 0;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "INSERT INTO BanHang(tenBan ,tenDoDung ,soLuong ,giaDoDung ,thanhTien) "
                    + " VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, t.getTenBan());
            pst.setString(2, t.getTenDoDung());
            pst.setInt(3, t.getSoLuong());
            pst.setFloat(4, t.getGiaDoDung());
            pst.setFloat(5, t.getThanhTien());
           

            // B3: Thực thi sql
            ketQua = pst.executeUpdate();
            // B4: Xử lý dữ liệu
            System.out.println("Ban da thuc thi " + sql);
            System.out.println("Có " + ketQua + " ket qua bi thay doi!!");
            // B5: Đóng csdl
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int Update(BanHang t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
        int ketQua = 0;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "UPDATE Ban SET trangThai=? WHERE tenBan=?";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "Đã đặt");
            pst.setString(2, t.getTenBan());


            // B3: Thực thi sql
            ketQua = pst.executeUpdate();
            // B4: Xử lý dữ liệu
            System.out.println("Ban da thuc thi " + sql);
            System.out.println("Có " + ketQua + " ket qua bi thay doi!!");
            // B5: Đóng csdl
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
        
    }
        /*
        Ngày 08/10/2022 Sử dụng cho chức năng sau khi thanh toán
        thì cập nhật trạng thái bàn đã đặt thành Còn trống
    */
        public int Update_2(BanHang t) { 
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
        int ketQua = 0;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "UPDATE Ban SET trangThai=? WHERE tenBan=?";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "Còn trống");
            pst.setString(2, t.getTenBan());


            // B3: Thực thi sql
            ketQua = pst.executeUpdate();
            // B4: Xử lý dữ liệu
            System.out.println("Ban da thuc thi " + sql);
            System.out.println("Có " + ketQua + " ket qua bi thay doi!!");
            // B5: Đóng csdl
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
        
    }

    @Override
    public int Delete(BanHang t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    int ketQua = 0;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "DELETE BanHang "
                    + " WHERE tenBan=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getTenBan());


            // B3: Thực thi sql
            ketQua = pst.executeUpdate();
            // B4: Xử lý dữ liệu
            System.out.println("Ban da thuc thi " + sql);
            System.out.println("Có " + ketQua + " ket qua bi thay doi!!");
            // B5: Đóng csdl
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<BanHang> selectAll() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ArrayList<BanHang> list = new ArrayList<>();
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "SELECT * FROM BanHang ";
            PreparedStatement pst = con.prepareStatement(sql);

            // B3: Thực thi sql
            ResultSet rs = pst.executeQuery();
            // B4: Xử lý dữ liệu
            System.out.println("Ban da thuc thi " + sql);

            while (rs.next()) {
                String tenBan = rs.getString("tenBan");
                String tenDoDung = rs.getString("tenDoDung");
                int soLuong = rs.getInt("soLuong");
                float giaDoDung = rs.getFloat("giaDoDung");
                float thanhTien = rs.getFloat("thanhTien");

                BanHang banHang = new BanHang(tenBan, tenDoDung, soLuong, giaDoDung, thanhTien);
                list.add(banHang);

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
    public BanHang selectById(BanHang t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         BanHang banHang = null;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "SELECT * FROM BanHang WHERE tenBan=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getTenBan());
            // B3: Thực thi sql
            ResultSet rs = pst.executeQuery();
            // B4: Xử lý dữ liệu
            System.out.println("Ban da thuc thi " + sql);

            while (rs.next()) {
                String tenBan = rs.getString("tenBan");
               
                float thanhTien = rs.getFloat("thanhTien");

                banHang = new BanHang(tenBan, thanhTien);
                

            }

            //  System.out.println("Có " + ketQua + " ket qua bi thay doi!!");
            // B5: Đóng csdl
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return banHang;
    }

    @Override
    public ArrayList<BanHang> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
