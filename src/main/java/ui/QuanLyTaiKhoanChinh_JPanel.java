/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author admin
 */
public class QuanLyTaiKhoanChinh_JPanel extends javax.swing.JPanel {
    private CapNhatTaiKhoan_JPanel btn_tool_capNhatTaiKhoan;
    private DoiMatKhau_JPanel btn_tool_doiMatKhau;
    /**
     * Creates new form QuanLyTaiKhoan_JPanel
     */
    public QuanLyTaiKhoanChinh_JPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btn_quanLyTaiKhoan = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btn_doiMatKhau = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        tabp_quanLyTaiKhoan = new javax.swing.JTabbedPane();

        jToolBar1.setRollover(true);

        btn_quanLyTaiKhoan.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btn_quanLyTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Question-Help-icon-16.png"))); // NOI18N
        btn_quanLyTaiKhoan.setText("Quản lý tài khoản");
        btn_quanLyTaiKhoan.setFocusable(false);
        btn_quanLyTaiKhoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_quanLyTaiKhoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_quanLyTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quanLyTaiKhoanActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_quanLyTaiKhoan);
        jToolBar1.add(jSeparator1);

        btn_doiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btn_doiMatKhau.setText("Đổi mật khẩu");
        btn_doiMatKhau.setFocusable(false);
        btn_doiMatKhau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_doiMatKhau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_doiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doiMatKhauActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_doiMatKhau);
        jToolBar1.add(jSeparator2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabp_quanLyTaiKhoan)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabp_quanLyTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    /*
        Ngày 24/09/2022 Cập nhật tài khoản
    */
    private void btn_quanLyTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quanLyTaiKhoanActionPerformed
        if(btn_tool_capNhatTaiKhoan==null){
            btn_tool_capNhatTaiKhoan = new CapNhatTaiKhoan_JPanel();
            tabp_quanLyTaiKhoan.addTab("Cập nhật tài khoản", btn_tool_capNhatTaiKhoan);
        }
        tabp_quanLyTaiKhoan.setSelectedComponent(btn_tool_capNhatTaiKhoan);
    }//GEN-LAST:event_btn_quanLyTaiKhoanActionPerformed
    /*
        Ngày 24/09/2022 Cập nhật tài khoản
    */
    private void btn_doiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doiMatKhauActionPerformed
        if(btn_tool_doiMatKhau==null){
            btn_tool_doiMatKhau = new DoiMatKhau_JPanel();
            tabp_quanLyTaiKhoan.addTab("Đổi mật khẩu", btn_tool_doiMatKhau);
        }
        tabp_quanLyTaiKhoan.setSelectedComponent(btn_tool_doiMatKhau);
    }//GEN-LAST:event_btn_doiMatKhauActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_doiMatKhau;
    private javax.swing.JButton btn_quanLyTaiKhoan;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTabbedPane tabp_quanLyTaiKhoan;
    // End of variables declaration//GEN-END:variables
}