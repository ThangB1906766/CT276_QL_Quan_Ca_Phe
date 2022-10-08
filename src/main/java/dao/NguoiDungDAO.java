/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helpers.DatabaseHelper;
import java.sql.Connection;
import model.NguoiDung;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author admin
 */

/*
    DAO = Data access object (đối tượng truy xuất dữ liệu)
    Ngày 20/08/2022
    Cho phép thực hiện các chức năng trong bản "NguoiDung" trong csdl
    Kiểm tra form đăng nhập bao gồm tenDangNhap, matKhau
        + Tạo câu lệnh truy vấn
        + Tạo đối tượng Connection con (dùng lớp DatabaseHelper)
        + 
 */
public class NguoiDungDAO implements DAOinterface<NguoiDung> {

    public NguoiDung KiemTraDangNhap(String tenDangNhap, String matKhau) throws Exception { // throws Exception không bắt ngoại lệ thư viện
        String sql = "select tenDangNhap, matKhau, vaiTro from NguoiDung "
                + " where tenDangNhap=? and matKhau = ?";
        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, tenDangNhap);
            pstmt.setString(2, matKhau);

            try ( ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(tenDangNhap);
                    nd.setVaiTro(rs.getString("vaiTro"));
                    return nd;
                }
            }
        }
        return null;
    }

    @Override
    public int Insert(NguoiDung t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int ketQua = 0;
        try {
            // Bước 1 Tạo kết nối 
            Connection con = DatabaseHelper.openConnection();
            // Bước 2 Tạo đối tượng statement
            String sql = "INSERT INTO NguoiDung (tenDangNhap, matKhau)"
                    + " VALUES (?, ?)";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getTenDangNhap());
            pst.setString(2, t.getMatKhau());
            // Bước 3 Thực thi lệnh sql   
            ketQua = pst.executeUpdate();

            // Bước 4
            System.out.println("Ban da thuc thi " + sql);
            System.out.println("Có " + ketQua + " bi thay doi!!");

            // Bước 5 Ngắt kết nối
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua; // trả về số dòng bị thay đổi
    }

    public static NguoiDungDAO getInstance() {
        return new NguoiDungDAO();
    }

    @Override
    public int Update(NguoiDung t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int Delete(NguoiDung t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NguoiDung selectById(NguoiDung t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
    }

    @Override
    public ArrayList<NguoiDung> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<NguoiDung> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
