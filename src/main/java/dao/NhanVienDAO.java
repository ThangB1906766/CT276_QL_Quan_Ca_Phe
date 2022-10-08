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
import java.util.List;
import model.NhanVien;

/*
    Ngày 23/09/2022 Class NhanVienDao cài đặt DAOinterface để thực hiện các câu lệnh sql
 */
public class NhanVienDAO implements DAOinterface<NhanVien> {

    public static NhanVienDAO getInstance() {
        return new NhanVienDAO();
    }

    @Override
    public int Insert(NhanVien t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int ketQua = 0;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "INSERT INTO NhanVien(idNhanVien, hoVaTen, email, soDienThoai, gioiTinh, diaChi) "
                    + " VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getIdNhanVien());
            pst.setString(2, t.getHoVaTen());
            pst.setString(3, t.getEmail());
            pst.setString(4, t.getSoDienThoai());
            pst.setInt(5, t.getGioiTinh());
            pst.setString(6, t.getDiaChi());
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
    public int Update(NhanVien t) {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int ketQua = 0;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "UPDATE NhanVien "
                    + " SET hoVaTen = ?, email = ?, soDienThoai = ?, gioiTinh = ?, diaChi = ? "
                    + " WHERE idNhanVien = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(6, t.getIdNhanVien());
            pst.setString(1, t.getHoVaTen());
            pst.setString(2, t.getEmail());
            pst.setString(3, t.getSoDienThoai());
            pst.setInt(4, t.getGioiTinh());
            pst.setString(5, t.getDiaChi());
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
    public int Delete(NhanVien t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int ketQua = 0;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "DELETE NhanVien "
                    + " WHERE idNhanVien = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getIdNhanVien());

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
    public ArrayList<NhanVien> selectAll() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "SELECT * FROM NhanVien ";
            PreparedStatement pst = con.prepareStatement(sql);

            // B3: Thực thi sql
            ResultSet rs = pst.executeQuery();
            // B4: Xử lý dữ liệu
            System.out.println("Ban da thuc thi " + sql);

            while (rs.next()) {
                String idNhanVien = rs.getString("idNhanVien");
                String hoVaTen = rs.getString("hoVaTen");
                String email = rs.getString("email");
                String soDienThoai = rs.getString("soDienThoai");
                int gioiTinh = rs.getInt("gioiTinh");
                String diaChi = rs.getString("diaChi");
                
                NhanVien nv = new NhanVien(idNhanVien, hoVaTen, email, soDienThoai, gioiTinh, diaChi);
                list.add(nv);

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
    public NhanVien selectById(NhanVien t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        NhanVien nv = null;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "SELECT * FROM NhanVien WHERE idNhanVien = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getIdNhanVien());
            // B3: Thực thi sql
            ResultSet rs = pst.executeQuery();
            // B4: Xử lý dữ liệu
            System.out.println("Ban da thuc thi " + sql);

            while (rs.next()) {
                String idNhanVien = rs.getString("idNhanVien");
                String hoVaTen = rs.getString("hoVaTen");
                String email = rs.getString("email");
                String soDienThoai = rs.getString("soDienThoai");
                int gioiTinh = rs.getInt("gioiTinh");
                String diaChi = rs.getString("diaChi");
                
                nv = new NhanVien(idNhanVien, hoVaTen, email, soDienThoai, gioiTinh, diaChi);
            }

            //  System.out.println("Có " + ketQua + " ket qua bi thay doi!!");
            // B5: Đóng csdl
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }

    @Override
    public ArrayList<NhanVien> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
