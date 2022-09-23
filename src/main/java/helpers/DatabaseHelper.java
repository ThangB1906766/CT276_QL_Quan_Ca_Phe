/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import java.sql.Connection;
import java.sql.DriverManager;

/*
    Ngày 22/09/2022 Tạo kết nối csdl
    + Nạp driver
    + Tạo URL kết nối csdl "QL_Quan_Ca_Phe"
    + Tạo username, password tùy thuộc vào máy chủ
    + Gọi thực hiện getConnection mở kết nối csdl với pass (đăng ký với DiverManager)
    + Trả về đối tượng con sau khi kết nối đến csdl
 */
public class DatabaseHelper {

    public static Connection openConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost;database=QL_Quan_Ca_Phe;"
                + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";

        String username = "demo";
        String password = "14332";

        java.sql.Connection con = DriverManager.getConnection(connectionUrl, username, password);

        //System.out.println("Ðã ket noi---------------dasdsa-------------------------------asdsad");
        // Ngắt kết nối csdl sau khi làm việc csdl
        // con.close();
        return con;
    }
}
