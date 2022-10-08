/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */

/*
    Ngày 20/08/2022
    Chức năng: Kiểm tra dữ liệu nhập vào
    
 */
public class KiemTraDuLieuNhapVao {

    /*
       Chức năng: kiểm tra dữ liệu nhập vào có rỗng không nếu có đưa vào StringBuilder
     */
    public static void KiemTraRong(JTextField filed, StringBuilder sb, String thongBaoLoi) {
        if (filed.getText().equals("")) {
            sb.append(thongBaoLoi).append("\n");
            filed.setBackground(Color.red);
            filed.requestFocus(); // Trỏ về trường đang lỗi
        } else {
            filed.setBackground(Color.WHITE);
        }
    }

    /*
       Chức năng: kiểm tra password có rỗng hay không
     */
    public static void KiemTraMatKhauRong(JPasswordField filed, StringBuilder sb, String thongBaoLoi) {
        String password = new String(filed.getPassword());
        if (password.equals("")) {
            sb.append(thongBaoLoi).append("\n");
            filed.setBackground(Color.red);
            filed.requestFocus(); // Trỏ về trường đang lỗi
        } else {
            filed.setBackground(Color.WHITE);
        }
    }

    public static void KiemTraRong(JTextArea txt_diaChi, StringBuilder sb, String địa_chỉ_nhân_viên_không_được_để_trống) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     if (txt_diaChi.getText().equals("")) {
            sb.append(địa_chỉ_nhân_viên_không_được_để_trống).append("\n");
            txt_diaChi.setBackground(Color.red);
            txt_diaChi.requestFocus(); // Trỏ về trường đang lỗi
        } else {
            txt_diaChi.setBackground(Color.WHITE);
        }
    }
}
