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
import model.NhanVien;

/**
 *
 * @author admin
 */
public class BanDAO implements DAOinterface<Ban> {

    @Override
    public int Insert(Ban t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int ketQua = 0;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "INSERT INTO Ban(tenBan,trangThai, ghiChu) "
                    + " VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getTenBan());
            pst.setString(2, t.getTrangThai());
            pst.setString(3, t.getGhiChu());

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
    public int Update(Ban t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    int ketQua = 0;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "UPDATE Ban "
                    + " SET ghiChu=?, trangThai=? WHERE tenBan=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(3, t.getTenBan());
            pst.setString(2, t.getTrangThai());
            pst.setString(1, t.getGhiChu());

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
    public int Delete(Ban t) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    int ketQua = 0;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "DELETE Ban "
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
    public ArrayList<Ban> selectAll() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     ArrayList<Ban> list = new ArrayList<>();
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "SELECT * FROM Ban ";
            PreparedStatement pst = con.prepareStatement(sql);

            // B3: Thực thi sql
            ResultSet rs = pst.executeQuery();
            // B4: Xử lý dữ liệu
            System.out.println("Ban da thuc thi " + sql);

            while (rs.next()) {
                int idBan = rs.getInt("idBan");
                 String tenBan = rs.getString("tenBan");
                  String trangThai = rs.getString("trangThai");
                   String ghiChu = rs.getString("ghiChu");
                
                Ban ban = new Ban(idBan, tenBan, trangThai, ghiChu);
                list.add(ban);

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
    public Ban selectById(Ban t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     Ban ban = null;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "SELECT * FROM Ban WHERE tenBan = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getTenBan());
            // B3: Thực thi sql
            ResultSet rs = pst.executeQuery();
            // B4: Xử lý dữ liệu
            System.out.println("Ban da thuc thi " + sql);

            while (rs.next()) {
               
                 String tenBan = rs.getString("tenBan");
                 
                   String ghiChu = rs.getString("ghiChu");
                
                    ban = new Ban(tenBan ,ghiChu);
               
            }

            //  System.out.println("Có " + ketQua + " ket qua bi thay doi!!");
            // B5: Đóng csdl
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ban;
    }

    @Override
    public ArrayList<Ban> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
