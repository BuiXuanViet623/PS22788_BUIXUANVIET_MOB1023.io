/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps22788_buixuanviet_assigntment;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class EmployeeForm extends javax.swing.JFrame {

    ArrayList<Employee> list = new ArrayList<>();
    public static int index = 0;
    private static final String CheckEmail = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    /**
     * Creates new form giaoDien_Assigntment
     */
    public EmployeeForm() {
        initComponents();
        setLocationRelativeTo(null); // hiển thị ra giữa màn hình 
        JOptionPane.showMessageDialog(this, "Xin Chào Mọi Người Đến Với Chương Trình Quản Lí Nhân Viên");

        Clook t1 = new Clook(btnClock);
        t1.start();
        btnClock.setEnabled(true);
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
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblHoVaTEn = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        lblTuoi = new javax.swing.JLabel();
        txtTuoi = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblLuong = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        lblRecover = new javax.swing.JLabel();
        btnClock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("QUẢN LÍ NHÂN VIÊN");

        lblMaNV.setText("MÃ NHÂN VIÊN");

        lblHoVaTEn.setText("HỌ VÀ TÊN");

        lblTuoi.setText("TUỔI");

        lblEmail.setText("EMAIL");

        lblLuong.setText("LƯƠNG");

        btnFind.setText("FIND");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnOpen.setText("OPEN");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setText("<<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        lblRecover.setForeground(new java.awt.Color(204, 0, 51));
        lblRecover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRecoverMouseClicked(evt);
            }
        });

        btnClock.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnClock.setForeground(new java.awt.Color(204, 0, 51));
        btnClock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblHoVaTEn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMaNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblLuong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtHoVaTen)
                                            .addGap(106, 106, 106))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtLuong, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(btnFirst)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btnPrevious)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btnNext)))
                                            .addGap(18, 18, 18)
                                            .addComponent(btnlast)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblRecover, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClock, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNV)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHoVaTEn)
                    .addComponent(btnNew)
                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTuoi)
                        .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(btnFind))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLuong)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOpen)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFirst)
                            .addComponent(btnPrevious)
                            .addComponent(btnNext)
                            .addComponent(btnlast)
                            .addComponent(lblRecover))
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        findNhanVien();
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (checkFrom()) {
            if (btnSave.getText().equalsIgnoreCase("save")) {
                checkMa();
                addEmployee();
                fillToTable();
            } else {
                btnSave.setText("SAVE");
                updateEmployee();
                fillToTable();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        clearForm();

    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        removeEmployee();
        fillToTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        // TODO add your handling code here:
        showDetali(index);
        btnSave.setText("UPDATE");
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        try {

            OppenFile();
        } catch (IOException ex) {
            Logger.getLogger(EmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        fillToTable();
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        try {
            writeFile();
        } catch (IOException ex) {
            Logger.getLogger(EmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        exit();
    }//GEN-LAST:event_btnExitActionPerformed
    // nút
    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        index = tblNhanVien.getEditingRow();
        tblNhanVien.setRowSelectionInterval(0, 0);
        showDetali(index);
        lblRecover.setText("Record: " + (index + 2) + " " + "of" + " " + list.size());
//        btnFirst.setEnabled(false);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void lblRecoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecoverMouseClicked
        // TODO add your handling code here:
//        text();
    }//GEN-LAST:event_lblRecoverMouseClicked

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        index = tblNhanVien.getSelectedRow();
        index--;
        if (index < 0) {
            index = list.size() - 1;
        }
        tblNhanVien.setRowSelectionInterval(index, index);
        showDetali(index);
        lblRecover.setText("Record: " + (index + 1) + " " + "of" + " " + list.size());
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        index = tblNhanVien.getSelectedRow();
        index++;
        if (index > list.size() - 1) {
            index = 0;
        }
        tblNhanVien.setRowSelectionInterval(index, index);
        showDetali(index);
        lblRecover.setText("Record: " + (index + 1) + " " + "of" + " " + list.size());
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        // TODO add your handling code here:
        index = list.size() - 1;
        tblNhanVien.setRowSelectionInterval(index, index);
        showDetali(index);
        lblRecover.setText("Record: " + (index + 1) + " " + "of" + " " + list.size());
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnClockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClockActionPerformed
        // TODO add your handling code here:
        Clook t1 = new Clook(btnClock);
        t1.start();
        btnClock.setEnabled(true);
    }//GEN-LAST:event_btnClockActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClock;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnlast;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHoVaTEn;
    private javax.swing.JLabel lblLuong;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblRecover;
    private javax.swing.JLabel lblTuoi;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables

    // hàm thêm nhân viên
    public void addEmployee() {
        Employee nv = new Employee(); // duyệt mảng
        nv.ma = txtMaNV.getText(); // thêm mã nhân viên
        nv.name = txtHoVaTen.getText(); // thêm họ và tên 
        nv.tuoi = Double.parseDouble(txtTuoi.getText()); // ép kiểu String thành kiểu double 
        nv.email = txtEmail.getText(); // thêm email
        nv.luong = Double.parseDouble(txtLuong.getText()); // ép kiểu String thành kiểu double
        list.add(nv);// thêm vào Arraylisst
        fillToTable();// đổ dữ liệu được nhập xuống table 
    }

    // hàm cập nhật nhân viên 
    public void updateEmployee() {
        int index = tblNhanVien.getSelectedRow(); // chọn vị trí hiện tại khi click vào hàng
        Employee nv = new Employee(); // tạo hàm mảng 

        nv.ma = txtMaNV.getText(); // 
        nv.name = txtHoVaTen.getText();
        nv.tuoi = Double.parseDouble(txtTuoi.getText());
        nv.email = txtEmail.getText();
        nv.luong = Double.parseDouble(txtLuong.getText());
        list.set(index, nv);
    }

    // hàm xóa hết những thông tin trên form 
    public void clearForm() {
        txtMaNV.setText("");
        txtHoVaTen.setText("");
        txtTuoi.setText("");
        txtEmail.setText("");
        txtLuong.setText("");
    }

    // đỗ dữ liệu xuống bảng table 
    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);

        for (Employee nv : list) {
            Object[] row = new Object[]{nv.ma, nv.name, nv.tuoi, nv.email, nv.luong};
            model.addRow(row);
        }

    }

    // xóa nhân viên 
    public void removeEmployee() {
        int index = tblNhanVien.getSelectedRow();
        list.remove(index);
    }

    // hàm trả thông tin lên form 
    public void showDetali(int index) {
        index = tblNhanVien.getSelectedRow();
        Employee nv = list.get(index);
        txtMaNV.setText(nv.ma);
        txtHoVaTen.setText(nv.name);
        txtTuoi.setText(String.valueOf(nv.tuoi));
        txtEmail.setText(nv.email);
        txtLuong.setText(String.valueOf(nv.luong));
        lblRecover.setText("Record: " + (index + 1) + " " + "of" + " " + list.size());
        
    }

    // hàm tìm kiếm nhân viên theo mã 
    public void findNhanVien() {
        String MaNv = JOptionPane.showInputDialog("Vui Lòng Nhập Mã Nhân Viên Cần Tìm"); // nhập mã nhân viên cần timf
        if (find(MaNv)) { // nếu mã nhập vào mà trùng với mã 
            JOptionPane.showMessageDialog(this, "NHÂN VIÊN ĐÃ ĐƯỢC TÌM THẤY", "THONG BAO", JOptionPane.INFORMATION_MESSAGE); // thông báo 
            tblNhanVien.setRowSelectionInterval(index, index); // highlight dòng nhân viên đã được tìm thấy 
            showDetali(index); // đỗ dữ liệu lên form tại vị trí nhân viên đã được tìm thấy 
        } else {
            JOptionPane.showMessageDialog(this, "Không Tìm Thấy Nhân Viên Cần Tìm"); // nếu không tìm thấy nhân viên thì thông báo cho người dùng 
        }
    }

    private boolean find(String str) {

        for (Employee e : list) {
            String check = String.valueOf(e.getMa()); // chuyển sang thành chuỗi 
            if (check.equalsIgnoreCase(str)) {
                index = list.indexOf(e);
                return true;
            }
        }
        return false;
    }

    public String text() {
        return "Recoverd: " + (index + 1) + "of" + list.size();
    }

    //thoat chuong trinh
    public void exit() {
        System.exit(0);
    }

    //chép file 
    public void writeFile() throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Assingtment\\Employee.txt"); // ghi dữ liệu vào file
        ObjectOutputStream oos = new ObjectOutputStream(fos); // ghi đối tượng
        oos.writeObject(list); // đọc dữ liệu ở arraylist
        oos.close(); // đóng luồn
        fos.close();// đóng luồn
    }

    // mở file
    public void OppenFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Assingtment\\Employee.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        list = (ArrayList<Employee>) ois.readObject();
    }
// hàm hiển thị thời gian

    public void run() {
        while (true) {
            try {
                Date now = new Date();
                SimpleDateFormat formater = new SimpleDateFormat();
                formater.applyPattern("hh:mm:ss:aa");
                String time = formater.format(now);
                btnClock.setText(time);
                Thread.sleep(1000);
            } catch (Exception e) {
                break;
            }
        }

    }
// hàm kiểm tra lỗi

    public boolean checkFrom() {

        if (txtHoVaTen.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Họ Và Tên Không Được Để Trống");
            txtHoVaTen.setBackground(Color.yellow);
            return false;
        } else {
            txtHoVaTen.setBackground(Color.white);

        }

        if (txtTuoi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tuổi Viên Không Được Để Trống");
            txtTuoi.setBackground(Color.yellow);
            return false;
        } else {
            txtTuoi.setBackground(Color.white);
        }
        
        try {
            txtTuoi.setBackground(Color.white);
            Double.parseDouble(txtTuoi.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tuối Sai Định Dạng_Vui Lòng Nhập Số");
            txtTuoi.setBackground(Color.yellow);
            return false;
        }
        if (Double.parseDouble(txtTuoi.getText()) < 16 || Double.parseDouble(txtTuoi.getText()) > 55) {
            JOptionPane.showMessageDialog(this, "Tuối Trong Phạm Vi 16 đến 55 Tuổi");
            txtTuoi.setBackground(Color.yellow);
            return false;
        } else {
            txtTuoi.setBackground(Color.white);
        }

        if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Email Không Được Để Trống");
            txtEmail.setBackground(Color.yellow);
            return false;

        } else {
            txtEmail.setBackground(Color.white);
        }
        Matcher matcher = Pattern.compile(CheckEmail).matcher(txtEmail.getText());
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(this, "Bạn Nhập Sai Cú Pháp Email");
            txtEmail.setBackground(Color.yellow);
            return false;
        } else {
            txtEmail.setBackground(Color.white);
        }

        if (txtLuong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Lương Không Được Để Trống");
            txtLuong.setBackground(Color.yellow);
            return false;

        } else {
            txtLuong.setBackground(Color.white);
        }
        try {

            Double.parseDouble(txtLuong.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Lương Sai Định Dạng_Vui Lòng Nhập Số");
            txtLuong.setBackground(Color.yellow);
            return false;
        }
        if (Double.parseDouble(txtLuong.getText()) < 5000) {
            JOptionPane.showMessageDialog(this, "Lương Quá Thấp");
            txtLuong.setBackground(Color.yellow);
            return false;
        } else {
            txtLuong.setBackground(Color.white);
        }
        JOptionPane.showMessageDialog(this, "Chúc Mừng Bạn Đã Đăng Nhập Chính Xác Thông Tin Nhân Viên");

        return true;

    }

    public boolean checkMa() {
        if (txtMaNV.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã Nhân Viên Không Được Để Trống");
            txtMaNV.setBackground(Color.yellow);
            return false;
        } else {
            txtMaNV.setBackground(Color.white);
        }
        return true;
    }

}