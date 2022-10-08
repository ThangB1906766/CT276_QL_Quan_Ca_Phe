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
import model.Ban;
import model.DoDung;

/**
 *
 * @author admin
 */
public class DoDungDAO implements DAOinterface<DoDung> {

    public static DoDungDAO getInstance() {
        return new DoDungDAO();
    }

    @Override
    public int Insert(DoDung t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int ketQua = 0;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "INSERT INTO DoDung(idDoDung, tenDoDung, giaDoDung, ngayKhuyenMai, ngayKetThuc) "
                    + " VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getIdDoDung());
            pst.setString(2, t.getTenDoDung());
            pst.setFloat(3, t.getGiaDoDung());
            pst.setDate(4, t.getNgayKhuyenMai());
            pst.setDate(5, t.getNgayKetThuc());

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
    public int Update(DoDung t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int ketQua = 0;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql1 = "INSERT INTO DoDung(idDoDung, tenDoDung, giaDoDung, ngayKhuyenMai, ngayKetThuc) "
                    + " VALUES (?, ?, ?, ?, ?)";
            String sql = "UPDATE DoDung "
                    + " SET tenDoDung=?, giaDoDung=?, ngayKhuyenMai=?, ngayKetThuc=? "
                    + " WHERE idDodung=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(5, t.getIdDoDung());
            pst.setString(1, t.getTenDoDung());
            pst.setFloat(2, t.getGiaDoDung());
            pst.setDate(3, t.getNgayKhuyenMai());
            pst.setDate(4, t.getNgayKetThuc());

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
    public int Delete(DoDung t) {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int ketQua = 0;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "DELETE DoDung "
                    + " WHERE idDoDung=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getIdDoDung());

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
    public ArrayList<DoDung> selectAll() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ArrayList<DoDung> list = new ArrayList<>();
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "SELECT * FROM DoDung ";
            PreparedStatement pst = con.prepareStatement(sql);

            // B3: Thực thi sql
            ResultSet rs = pst.executeQuery();
            // B4: Xử lý dữ liệu
            System.out.println("Ban da thuc thi " + sql);

            while (rs.next()) {

                String idDoDung = rs.getString("idDoDung");
                String tenDoDung = rs.getString("tenDoDung");
                Float giaDoDung = rs.getFloat("giaDoDung");
                Date ngayKM = rs.getDate("ngayKhuyenMai");
                Date ngayKT = rs.getDate("ngayKetThuc");

                DoDung dd = new DoDung(idDoDung, tenDoDung, giaDoDung, ngayKM, ngayKT);

                list.add(dd);

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
    public DoDung selectById(DoDung t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DoDung doDung = null;
        try {
            // B1: Tạo kết nối
            Connection con = DatabaseHelper.openConnection();
            // B2: Tạo đối tượng pst + lệnh sql
            String sql = "SELECT * FROM DoDung WHERE idDoDung=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getIdDoDung());
            // B3: Thực thi sql
            ResultSet rs = pst.executeQuery();
            // B4: Xử lý dữ liệu
            System.out.println("Ban da thuc thi " + sql);

            while (rs.next()) {

                String idDoDung = rs.getString("idDoDung");
                String tenDoDung = rs.getString("tenDoDung");
                Float giaDoDung = rs.getFloat("giaDoDung");
                Date ngayKM = rs.getDate("ngayKhuyenMai");
                Date ngayKT = rs.getDate("ngayKetThuc");

                doDung = new DoDung(idDoDung, tenDoDung, giaDoDung, ngayKM, ngayKT);

            }

            //  System.out.println("Có " + ketQua + " ket qua bi thay doi!!");
            // B5: Đóng csdl
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doDung;
    }

    @Override
    public ArrayList<DoDung> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
