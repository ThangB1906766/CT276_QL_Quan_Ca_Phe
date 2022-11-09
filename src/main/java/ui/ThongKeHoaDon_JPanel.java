/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import dao.BanHangDAO;
import dao.HoaDonV2DAO;
import helpers.ThongBao;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.BanHang;
import model.HoaDonV2;

/**
 *
 * @author admin
 */
public class ThongKeHoaDon_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeHoaDon_JPanel
     */
    public ThongKeHoaDon_JPanel() {
        initComponents();
        TaoBang();
        TaiDuLieuLenBang_ThongKe();
    }
    private DefaultTableModel tblmodel;
    private GiaoDienChinh_JFrame giaoDienChinh;
     private void TaoBang() {
        tblmodel = new DefaultTableModel();
        tblmodel.setColumnIdentifiers(new String[]{"STT", "Nhân viên", "Tên bàn", "Tổng tiền", "Ngày thanh toán", });
        tbl_thongKe.setModel(tblmodel);
    }
     private void TaiDuLieuLenBang_ThongKe() {
        try {

            HoaDonV2DAO hoaDonDAO = new HoaDonV2DAO();
            List<HoaDonV2> list = hoaDonDAO.selectAll(); // Trả về all nhân viên trong csdl
            tblmodel.setRowCount(0); // Xóa dữ liệu hiện đang trên bảng
            for (HoaDonV2 hoaDon : list) {
                tblmodel.addRow(new Object[]{
                    hoaDon.getMaHoaDon(), hoaDon.getTenDangNhap(), hoaDon.getTenBan(), hoaDon.getThanhTien(), 
                    hoaDon.getNgayLap()
                });
            }
            tblmodel.fireTableDataChanged(); // Cập nhật lại hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_thongKe = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thống Kê Hóa Đơn");

        tbl_thongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_thongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_thongKeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_thongKe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_thongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_thongKeMouseClicked
        // TODO add your handling code here:
        TaiDuLieuLenBang_ThongKe();
    }//GEN-LAST:event_tbl_thongKeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_thongKe;
    // End of variables declaration//GEN-END:variables
}