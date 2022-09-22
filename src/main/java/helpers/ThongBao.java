/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */

/*
    Ngày 20/08/2022
    Dùng để hiện thị các thông báo
*/

public class ThongBao {

    public static void ThongBao(Component lopCha, String noiDung, String tieuDe) {
        JOptionPane.showMessageDialog(lopCha, noiDung, tieuDe, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void ThongBaoLoi(Component lopCha, String noiDung, String tieuDe) {
        JOptionPane.showMessageDialog(lopCha, noiDung, tieuDe, JOptionPane.ERROR_MESSAGE);
    }

    public static int ThongBaoXacNhan(Component lopCha, String noiDung, String tieuDe) {
        int luaChon = JOptionPane.showConfirmDialog(lopCha, noiDung, tieuDe, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return luaChon;
    }

}
