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

/**
 *
 * @author admin
 */

/*
    Ngày 20/08/2022
    Kiểm tra form đăng nhập
*/
public class NguoiDungDAO {
     public NguoiDung KiemTraDangNhap(String tenDangNhap, String matKhau) throws Exception{ // throws Exception không bắt ngoại lệ thư viện
         String sql = "select tenDangNhap, matKhau, vaiTro from NguoiDung "
                 + " where tenDangNhap=? and matKhau = ?";
         try(
                 Connection con = DatabaseHelper.opConnection();
                 PreparedStatement pstmt = con.prepareStatement(sql);
                 
             ){
             pstmt.setString(1, tenDangNhap);
             pstmt.setString(2, matKhau);
              
             try(ResultSet rs = pstmt.executeQuery();){
                 if(rs.next()){
                     NguoiDung nd = new NguoiDung();
                     nd.setTenDangNhap(tenDangNhap);
                     nd.setVaiTro(rs.getString("vaiTro"));
                     return nd;
                 }
             }
         }
         return null;
     }
}
