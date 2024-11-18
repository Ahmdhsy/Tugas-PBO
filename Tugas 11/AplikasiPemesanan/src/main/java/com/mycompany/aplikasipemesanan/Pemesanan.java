/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.aplikasipemesanan;

import javax.swing.JOptionPane;

public class Pemesanan extends javax.swing.JFrame {

    public Pemesanan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Judul = new javax.swing.JLabel();
        DivDataCustomer = new javax.swing.JPanel();
        vNama = new javax.swing.JLabel();
        vAlamat = new javax.swing.JLabel();
        vTelepon = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        no = new javax.swing.JTextField();
        DivMenu = new javax.swing.JPanel();
        item1 = new javax.swing.JCheckBox();
        item2 = new javax.swing.JCheckBox();
        item3 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        harga_item = new javax.swing.JLabel();
        tambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil_akhir = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Judul.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        Judul.setText("Warkop Ciwaruga");

        DivDataCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Customer"));

        vNama.setText("Nama");

        vAlamat.setText("Alamat");

        vTelepon.setText("Telepon");

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });

        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DivDataCustomerLayout = new javax.swing.GroupLayout(DivDataCustomer);
        DivDataCustomer.setLayout(DivDataCustomerLayout);
        DivDataCustomerLayout.setHorizontalGroup(
            DivDataCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivDataCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DivDataCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vAlamat)
                    .addComponent(vTelepon)
                    .addComponent(vNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DivDataCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alamat, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(nama)
                    .addComponent(no))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        DivDataCustomerLayout.setVerticalGroup(
            DivDataCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivDataCustomerLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(DivDataCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vNama)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DivDataCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vAlamat)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DivDataCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vTelepon)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        DivMenu.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));

        item1.setText("Nasi Rames");
        item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1ActionPerformed(evt);
            }
        });

        item2.setText("Mie Tektek");
        item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2ActionPerformed(evt);
            }
        });

        item3.setText("Nasi Goreng");
        item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DivMenuLayout = new javax.swing.GroupLayout(DivMenu);
        DivMenu.setLayout(DivMenuLayout);
        DivMenuLayout.setHorizontalGroup(
            DivMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DivMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item1)
                    .addComponent(item2)
                    .addComponent(item3))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        DivMenuLayout.setVerticalGroup(
            DivMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivMenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(item1)
                .addGap(18, 18, 18)
                .addComponent(item2)
                .addGap(18, 18, 18)
                .addComponent(item3)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Bayar"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Rp.");

        harga_item.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        harga_item.setText("0");

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(harga_item)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tambah)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(harga_item)
                    .addComponent(tambah))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        hasil_akhir.setColumns(20);
        hasil_akhir.setRows(5);
        jScrollPane1.setViewportView(hasil_akhir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DivDataCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DivMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(Judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Judul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DivDataCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DivMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noActionPerformed

    private void item1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1ActionPerformed
         updateTotalPrice();
    }//GEN-LAST:event_item1ActionPerformed

    private void item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2ActionPerformed
         updateTotalPrice();
    }//GEN-LAST:event_item2ActionPerformed

    private void item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3ActionPerformed
         updateTotalPrice();
    }//GEN-LAST:event_item3ActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        double totalPrice = 0;
            StringBuilder orderDetails = new StringBuilder();

            // Get customer details
            String customerName = nama.getText();
            String customerAddress = alamat.getText();
            String customerPhone = no.getText();

            // Append customer details to the order
            orderDetails.append("Customer Name: ").append(customerName).append("\n");
            orderDetails.append("Address: ").append(customerAddress).append("\n");
            orderDetails.append("Phone: ").append(customerPhone).append("\n");

            // Check which items are selected and add to total
            if (item1.isSelected()) {
                orderDetails.append("Seblak: Rp. 15,000\n");
                totalPrice += 15000; // price for Seblak
            }
            if (item2.isSelected()) {
                orderDetails.append("Mie Tektek: Rp. 20,000\n");
                totalPrice += 20000; // price for Mie Tektek
            }
            if (item3.isSelected()) {
                orderDetails.append("Nasi Goreng: Rp. 25,000\n");
                totalPrice += 25000; // price for Nasi Goreng
            }

            // Append total price to the order details
            orderDetails.append("Total Price: Rp. ").append(String.format("%,.0f", totalPrice)).append("\n");

            // Display the total price in harga_item
            harga_item.setText(String.valueOf(totalPrice));

            // Append the new order details to the result text area without overwriting existing data
            hasil_akhir.append(orderDetails.toString());
            hasil_akhir.append("\n------------------------------------\n");
    }//GEN-LAST:event_tambahActionPerformed

    private void updateTotalPrice() {
    double totalPrice = 0;

        // Cek item yang dipilih dan tambahkan harga ke total
        if (item1.isSelected()) {
            totalPrice += 15000; // harga Seblak
        }
        if (item2.isSelected()) {
            totalPrice += 20000; // harga Mie Tektek
        }
        if (item3.isSelected()) {
            totalPrice += 25000; // harga Nasi Goreng
        }

        // Update label harga_item dengan total harga
        harga_item.setText(String.valueOf(totalPrice)); 
    }
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
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DivDataCustomer;
    private javax.swing.JPanel DivMenu;
    private javax.swing.JLabel Judul;
    private javax.swing.JTextField alamat;
    private javax.swing.JLabel harga_item;
    private javax.swing.JTextArea hasil_akhir;
    private javax.swing.JCheckBox item1;
    private javax.swing.JCheckBox item2;
    private javax.swing.JCheckBox item3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no;
    private javax.swing.JButton tambah;
    private javax.swing.JLabel vAlamat;
    private javax.swing.JLabel vNama;
    private javax.swing.JLabel vTelepon;
    // End of variables declaration//GEN-END:variables
}
