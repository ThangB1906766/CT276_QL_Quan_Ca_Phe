/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import java.awt.Color;
import javax.swing.JPasswordField;
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
}
