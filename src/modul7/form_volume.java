/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;

import javax.swing.JOptionPane;

/**
 *
 * @author Luviana
 */
public class form_volume extends javax.swing.JFrame {

    /**
     * Creates new form form_volume
     */
    public form_volume() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPanjang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLebar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTinggi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnHitung1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtSisi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnHitung2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtJari = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnHitung3 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Program Pencari Volume Bangun Ruang");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 340, 30);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Masukkan Panjang ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 40, 130, 30);

        txtPanjang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtPanjang);
        txtPanjang.setBounds(130, 40, 160, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("cm");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(298, 43, 75, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Masukkan Lebar ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(11, 81, 110, 30);

        txtLebar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtLebar);
        txtLebar.setBounds(130, 80, 160, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("cm");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 80, 75, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Masukkan Tinggi ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 120, 120, 30);

        txtTinggi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtTinggi);
        txtTinggi.setBounds(130, 120, 160, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("cm");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 120, 75, 30);

        btnHitung1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnHitung1.setText("Hitung");
        btnHitung1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitung1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHitung1);
        btnHitung1.setBounds(120, 200, 75, 30);

        jTabbedPane1.addTab("Balok", jPanel1);

        jPanel2.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Masukkan Panjang Sisi");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 40, 330, 30);

        txtSisi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(txtSisi);
        txtSisi.setBounds(60, 90, 160, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setText("cm");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(230, 90, 75, 30);

        btnHitung2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnHitung2.setText("Hitung");
        btnHitung2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitung2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnHitung2);
        btnHitung2.setBounds(120, 190, 75, 30);

        jTabbedPane1.addTab("Kubus", jPanel2);

        jPanel3.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Masukkan Panjang Jari-jari");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(0, 40, 330, 30);

        txtJari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtJari);
        txtJari.setBounds(60, 90, 160, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setText("cm");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(230, 90, 75, 30);

        btnHitung3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnHitung3.setText("Hitung");
        btnHitung3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitung3ActionPerformed(evt);
            }
        });
        jPanel3.add(btnHitung3);
        btnHitung3.setBounds(120, 190, 75, 30);

        jTabbedPane1.addTab("Bola", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 40, 340, 300);

        setBounds(0, 0, 351, 371);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitung1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitung1ActionPerformed
        // TODO add your handling code here:
        
        int panjang, lebar, tinggi;
        panjang = Integer.parseInt(txtPanjang.getText());
        lebar = Integer.parseInt(txtLebar.getText());
        tinggi = Integer.parseInt(txtTinggi.getText());
        int volume = panjang * lebar * tinggi;
        
        try{
            JOptionPane.showMessageDialog(null, "Volume Balok Adalah : " + volume, "Volume",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e, "Gagal", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnHitung1ActionPerformed

    private void btnHitung2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitung2ActionPerformed
        // TODO add your handling code here:
        
        int sisi = Integer.parseInt(txtSisi.getText());
        int volume = sisi * sisi * sisi;
        
        try{
            JOptionPane.showMessageDialog(null, "Volume Kubus Adalah : " + volume, "Volume",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e, "Gagal", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnHitung2ActionPerformed

    private void btnHitung3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitung3ActionPerformed
        // TODO add your handling code here:
        
        float jari = Integer.parseInt(txtJari.getText());
        float volume = (float) (4/3 * 3.14 * jari * jari * jari);
        try{
            JOptionPane.showMessageDialog(null, "Volume Bola Adalah : " + volume, "Volume",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e, "Gagal", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnHitung3ActionPerformed

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
            java.util.logging.Logger.getLogger(form_volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_volume().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung1;
    private javax.swing.JButton btnHitung2;
    private javax.swing.JButton btnHitung3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtJari;
    private javax.swing.JTextField txtLebar;
    private javax.swing.JTextField txtPanjang;
    private javax.swing.JTextField txtSisi;
    private javax.swing.JTextField txtTinggi;
    // End of variables declaration//GEN-END:variables
}
