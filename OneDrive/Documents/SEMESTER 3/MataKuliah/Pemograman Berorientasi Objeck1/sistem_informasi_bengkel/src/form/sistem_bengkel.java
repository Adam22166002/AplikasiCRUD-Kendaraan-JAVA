package form;

import config.koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class sistem_bengkel extends javax.swing.JFrame {
    
    private Connection conn;
    public sistem_bengkel() {
        initComponents();
        conn = koneksi.getConnection();
        getData();
        populateMerekComboBox();
        nonAktifButton();
    }
    
    private void getData() {
        DefaultTableModel model = (DefaultTableModel) tbl_kendaraan.getModel();
        model.setRowCount(0); // Kosongkan tabel sebelum menambahkan data baru

        try {
            String sql = "SELECT * FROM kendaraan"; // Pastikan nama tabel yang benar
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                // Ambil data dari ResultSet
                int id = rs.getInt("id_kendaraan");
                String merek = rs.getString("merek");
                String modelKendaraan = rs.getString("model");
                int tahun = rs.getInt("tahun");

                // Tambahkan data ke dalam model tabel
                model.addRow(new Object[]{id, merek, modelKendaraan, tahun});
            }

            // Tutup statement dan result set setelah digunakan
            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Tampilkan kesalahan jika terjadi
            Logger.getLogger(sistem_bengkel.class.getName()).log(Level.SEVERE, null, e);
        }
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_kendaraan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t_idkendaraan = new javax.swing.JTextField();
        t_model = new javax.swing.JTextField();
        t_tahun = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t_cari = new javax.swing.JTextField();
        t_merek = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 204, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tbl_kendaraan.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        tbl_kendaraan.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        tbl_kendaraan.setForeground(new java.awt.Color(102, 102, 102));
        tbl_kendaraan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Kendaraan", "Merek", "Model", "Tahun"
            }
        ));
        tbl_kendaraan.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_kendaraan.setRowHeight(30);
        tbl_kendaraan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_kendaraanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_kendaraan);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("ID kendaraan:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText(" Model:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("INPUTAN KENDARAAN");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Merek:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Tahun:");

        t_idkendaraan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t_idkendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_idkendaraanActionPerformed(evt);
            }
        });

        t_model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_modelActionPerformed(evt);
            }
        });

        btn_tambah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(204, 204, 204));
        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(204, 204, 204));
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_keluar.setBackground(new java.awt.Color(204, 204, 204));
        btn_keluar.setText("KELUAR");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Data Kendaraan");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Aplikasi CRUD Data Kendaraan Pemograman Berorientasi Objek 2");

        t_cari.setText("  Pencarian..");
        t_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_cariMouseClicked(evt);
            }
        });
        t_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cariActionPerformed(evt);
            }
        });
        t_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cariKeyTyped(evt);
            }
        });

        t_merek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_merekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(351, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t_model, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t_idkendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_keluar)
                                        .addGap(74, 74, 74)
                                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(t_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(t_cari)))))
                        .addGap(361, 361, 361))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(t_merek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(693, 693, 693))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_idkendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_merek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_model, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_keluar)
                    .addComponent(btn_tambah)
                    .addComponent(btn_edit)
                    .addComponent(btn_hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_idkendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_idkendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_idkendaraanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int selectedRow = tbl_kendaraan.getSelectedRow();
        if (selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih Baris yang akan di hapus");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus data ini?","konfirmasi",JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            String id_kendaraan = tbl_kendaraan.getValueAt(selectedRow, 0).toString();
            
            try {
                String sql = "DELETE FROM kendaraan WHERE id_kendaraan=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, id_kendaraan);
                
                int rowsDeleted = st.executeUpdate(); 
                if (rowsDeleted > 0) {
                  JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                  resetFrom();
                  getData();
                  nonAktifButton();
                  btn_tambah.setEnabled(true);
                  btn_keluar.setEnabled(true);
                }
                st.close();
                
            } catch (Exception e) {
               Logger.getLogger(sistem_bengkel.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        resetFrom();
        getData();
        nonAktifButton();
        btn_tambah.setEnabled(true);
        btn_keluar.setEnabled(true);
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        String idkendaraan = t_idkendaraan.getText();
        String merek = (String) t_merek.getSelectedItem();
        String model = t_model.getText();
        String tahun = t_tahun.getText();
        
        if(idkendaraan.isEmpty() || merek.isEmpty() || model.isEmpty() || tahun.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            String sql = "INSERT INTO kendaraan (id_kendaraan, merek, model, tahun) VALUES (?, ?, ?, ?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, idkendaraan);
            st.setString(2, merek);
            st.setString(3, model);
            st.setString(4, tahun);

            
            int rowInserted = st.executeUpdate();
            if(rowInserted > 0) {
                JOptionPane.showMessageDialog(this,"Data Kendaraan Berhasil Ditambahkan");
                resetFrom();
                getData();
                nonAktifButton();
            }else {
            JOptionPane.showMessageDialog(this, "Gagal menambahkan data", "Error", JOptionPane.ERROR_MESSAGE);
        }   
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal menambahkan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(sistem_bengkel.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void t_modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_modelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_modelActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // Menutup form saat ini
    dispose();

    // Menampilkan form lain
    aplikasi_bengkel aplikasi_bengkel = new aplikasi_bengkel();
    aplikasi_bengkel.setVisible(true);
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        int selectedRow = tbl_kendaraan.getSelectedRow();
        if (selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih Baris yang akan di edit");
            return;
        }
        
        String id_kendaraan = tbl_kendaraan.getValueAt(selectedRow, 0).toString();
        String merek = (String) t_merek.getSelectedItem();
        String model = t_model.getText();
        String tahun = t_tahun.getText();
        
        if(id_kendaraan.isEmpty() || merek.isEmpty() || model.isEmpty() || tahun.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            String sql = "UPDATE kendaraan SET merek=?, model=?, tahun=? WHERE id_kendaraan=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, merek);
            st.setString(2, model);
            st.setString(3, tahun);
            st.setString(4, id_kendaraan);
            
            int rowUpdated = st.executeUpdate();
            if(rowUpdated > 0) {
                JOptionPane.showMessageDialog(this,"Data Kendaraan Berhasil Di edit");
                resetFrom();
                getData();
                btn_tambah.setEnabled(true);
                btn_keluar.setEnabled(true);
                nonAktifButton();
            }
            st.close();
        } catch (Exception e) {
            Logger.getLogger(sistem_bengkel.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void tbl_kendaraanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_kendaraanMouseClicked
        int selectedRow = tbl_kendaraan.getSelectedRow();
        if(selectedRow != -1){
            String id_kendaraan = tbl_kendaraan.getValueAt(selectedRow,0).toString();
            String merek = tbl_kendaraan.getValueAt(selectedRow,1).toString();
            String model = tbl_kendaraan.getValueAt(selectedRow,2).toString();
            String tahun = tbl_kendaraan.getValueAt(selectedRow,3).toString();
            
            t_idkendaraan.setText(id_kendaraan);
            t_merek.setSelectedItem(merek);
            t_model.setText(model);
            t_tahun.setText(tahun);
        }
            btn_tambah.setEnabled(false);
            btn_keluar.setEnabled(false);
            btn_edit.setEnabled(true);
            btn_hapus.setEnabled(true);
    }//GEN-LAST:event_tbl_kendaraanMouseClicked

    private void t_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_cariActionPerformed

    private void t_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyTyped
        DefaultTableModel model = (DefaultTableModel) tbl_kendaraan.getModel();
        model.setRowCount(0);
        
        String cari = t_cari.getText();

        try {
            String sql = "SELECT * FROM kendaraan WHERE merek LIKE ? OR model LIKE ? OR tahun LIKE ? "; 
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,"%"+ cari + "%");
            st.setString(2,"%"+ cari + "%");
            st.setString(3,"%"+ cari + "%");
            
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_kendaraan");
                String merek = rs.getString("merek");
                String modelKendaraan = rs.getString("model");
                int tahun = rs.getInt("tahun");

                model.addRow(new Object[]{id, merek, modelKendaraan, tahun});
            }

            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.getLogger(sistem_bengkel.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_t_cariKeyTyped

    private void t_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_cariMouseClicked
        t_cari.setText("");
    }//GEN-LAST:event_t_cariMouseClicked
    private ArrayList<Integer> merekIds = new ArrayList<>();
    private void populateMerekComboBox() {
    try {
        // Membuat koneksi ke database (pastikan koneksi sudah diatur sebelumnya)
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistem-informasi-bengkel", "root", "");

        // Membuat statement SQL untuk mengambil data merek dari tabel merek
        String query = "SELECT id_merek, nama_merek FROM merek_kendaraan";
        PreparedStatement statement = connection.prepareStatement(query);

        // Mengeksekusi query dan mendapatkan hasilnya
        ResultSet resultSet = statement.executeQuery();

        // Mengosongkan JComboBox sebelum menambahkan data baru
        t_merek.removeAllItems(); // Menghapus semua item yang ada di JComboBox

        // Memuat data merek ke dalam JComboBox
        while (resultSet.next()) {
            int idMerek = resultSet.getInt("id_merek");
            String namaMerek = resultSet.getString("nama_merek");
            // Menambahkan nama merek ke dalam JComboBox
            t_merek.addItem(namaMerek);
            // Menyimpan ID merek ke dalam ArrayList
            merekIds.add(idMerek);
        }


        // Menutup koneksi dan statement
        resultSet.close();
        statement.close();
        connection.close();

    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
    private void t_merekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_merekActionPerformed
        if (merekIds.isEmpty()) {
        // Handle the case where merekIds is empty (e.g., show an error message)
        return;
    }

    // Get the selected index and ID as usual (assuming the fix above is not implemented)
    int selectedIndex = t_merek.getSelectedIndex();
    int selectedMerekId = merekIds.get(selectedIndex);
    }//GEN-LAST:event_t_merekActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sistem_bengkel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sistem_bengkel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sistem_bengkel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sistem_bengkel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sistem_bengkel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTextField t_idkendaraan;
    private javax.swing.JComboBox<String> t_merek;
    private javax.swing.JTextField t_model;
    private javax.swing.JTextField t_tahun;
    private javax.swing.JTable tbl_kendaraan;
    // End of variables declaration//GEN-END:variables

    private void resetFrom() {
    t_idkendaraan.setText("");
    t_merek.setSelectedIndex(0); // Memilih item pertama di JComboBox
    t_model.setText("");
    t_tahun.setText("");
}


    private void nonAktifButton() {
        btn_edit.setEnabled(false);
        btn_hapus.setEnabled(false);
    }
}
