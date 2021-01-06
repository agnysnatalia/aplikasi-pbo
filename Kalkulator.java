

import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Kalkulator extends javax.swing.JDialog {
    private String tmp = "";
    private int pilih;
    private float a1,a2,hasil;
    
    public Kalkulator(java.awt.Frame parent, boolean modal) {
        super(parent, "KALKULATOR PBO");
        initComponents();
        setLocationRelativeTo(null);
        txtTampil.setHorizontalAlignment(JTextField.CENTER);
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        txtTampil = new javax.swing.JTextField();
        btnSatu = new javax.swing.JButton();
        btnDua = new javax.swing.JButton();
        btnTiga = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnEmpat = new javax.swing.JButton();
        btnLima = new javax.swing.JButton();
        btnEnam = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnTujuh = new javax.swing.JButton();
        btnDelapan = new javax.swing.JButton();
        btnSembilan = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnNol = new javax.swing.JButton();
        btnKoma = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnPlusMinus = new javax.swing.JButton();
        btnSamaDengan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtTampil.setFont(new java.awt.Font("Tahoma", 1, 18)); 

        btnSatu.setText("1");
        btnSatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatuActionPerformed(evt);
            }
        });

        btnDua.setText("2");
        btnDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuaActionPerformed(evt);
            }
        });

        btnTiga.setText("3");
        btnTiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTigaActionPerformed(evt);
            }
        });

        btnEmpat.setText("4");
        btnEmpat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpatActionPerformed(evt);
            }
        });

        btnLima.setText("5");
        btnLima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimaActionPerformed(evt);
            }
        });

        btnEnam.setText("6");
        btnEnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnamActionPerformed(evt);
            }
        });

        btnTujuh.setText("7");
        btnTujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTujuhActionPerformed(evt);
            }
        });

        btnDelapan.setText("8");
        btnDelapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelapanActionPerformed(evt);
            }
        });

        btnSembilan.setText("9");
        btnSembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSembilanActionPerformed(evt);
            }
        });

        btnNol.setText("0");
        btnNol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNolActionPerformed(evt);
            }
        });

        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        btnKali.setText("x");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });

        btnBagi.setText(":");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });

        btnKoma.setText(",");
        btnKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKomaActionPerformed(evt);
            }
        });

        btnBersih.setText("c");
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });

        btnPlusMinus.setText("+/-");
        btnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinusActionPerformed(evt);
            }
        });

        btnSamaDengan.setText("=");
        btnSamaDengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamaDenganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTampil, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnSatu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDua)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnTiga)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnTambah))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEmpat)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLima)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEnam)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnKurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnPlusMinus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnNol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnTujuh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelapan)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSembilan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKali))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBersih)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBagi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnSamaDengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTampil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSatu)
                    .addComponent(btnDua)
                    .addComponent(btnTiga)
                    .addComponent(btnTambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmpat)
                    .addComponent(btnLima)
                    .addComponent(btnEnam)
                    .addComponent(btnKurang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTujuh)
                    .addComponent(btnDelapan)
                    .addComponent(btnSembilan)
                    .addComponent(btnKali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNol)
                    .addComponent(btnKoma)
                    .addComponent(btnBersih)
                    .addComponent(btnBagi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlusMinus)
                    .addComponent(btnSamaDengan))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnSatuActionPerformed(java.awt.event.ActionEvent evt) {
        tmp += "1";
        txtTampil.setText(tmp);
    }

    private void btnDuaActionPerformed(java.awt.event.ActionEvent evt) {
        tmp += "2";
        txtTampil.setText(tmp);
    }

    private void btnTigaActionPerformed(java.awt.event.ActionEvent evt) {
        tmp += "3";
        txtTampil.setText(tmp);
    }

    private void btnEmpatActionPerformed(java.awt.event.ActionEvent evt) {
        tmp += "4";
        txtTampil.setText(tmp);
    }

    private void btnLimaActionPerformed(java.awt.event.ActionEvent evt) {
        tmp += "5";
        txtTampil.setText(tmp);
    }

    private void btnEnamActionPerformed(java.awt.event.ActionEvent evt) {
        tmp += "6";
        txtTampil.setText(tmp);
    }

    private void btnTujuhActionPerformed(java.awt.event.ActionEvent evt) {
        tmp += "7";
        txtTampil.setText(tmp);
    }

    private void btnDelapanActionPerformed(java.awt.event.ActionEvent evt) {
        tmp += "8";
        txtTampil.setText(tmp);
    }

    private void btnSembilanActionPerformed(java.awt.event.ActionEvent evt) {
        tmp += "9";
        txtTampil.setText(tmp);
    }

    private void btnNolActionPerformed(java.awt.event.ActionEvent evt) {
        tmp += "0";
        txtTampil.setText(tmp);
    }

    private void btnKomaActionPerformed(java.awt.event.ActionEvent evt) {
        tmp += ".";
        txtTampil.setText(tmp);
    }

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {
        tmp = "";
        a1=0;
        a2=0;
        hasil=0;
        txtTampil.setText("");
    }

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {
        a1 = Float.valueOf(tmp);
        pilih = 1;
        tmp = "";
        txtTampil.setText("+");
    }

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {
        a1 = Float.valueOf(tmp);
        pilih = 2;
        tmp = "";
        txtTampil.setText("-");
    }

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {
        a1 = Float.valueOf(tmp);
        pilih = 3;
        tmp = "";
        txtTampil.setText("x");
    }

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {
        a1 = Float.valueOf(tmp);
        pilih = 4;
        tmp = "";
        txtTampil.setText(":");
    }

    private void btnSamaDenganActionPerformed(java.awt.event.ActionEvent evt) {
        switch(pilih){
            case 1:
                a2 = Float.valueOf(tmp);
                hasil = (float) a1 + a2;
                tmp = String.valueOf(hasil);
                txtTampil.setText(tmp);
                break;
            case 2:
                a2 = Float.valueOf(tmp);
                hasil = (float) a1 - a2;
                tmp = String.valueOf(hasil);
                txtTampil.setText(tmp);
                break;
            case 3:
                a2 = Float.valueOf(tmp);
                hasil = (float) a1 * a2;
                tmp = String.valueOf(hasil);
                txtTampil.setText(tmp);
                break;
            case 4:
                a2 = Float.valueOf(tmp);
                hasil = (float) a1 / a2;
                tmp = String.valueOf(hasil);
                txtTampil.setText(tmp);
                break;
        }
        tmp = "";
        a1 = 0;
        a2 = 0;
    }//GEN-LAST:event_btnSamaDenganActionPerformed

    private void btnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMinusActionPerformed
        if (hasil == 0) {
            JOptionPane.showMessageDialog(this, "Maaf hasil belum ada oprasi aritmatik yang terjadi");
        } else {
            hasil *= -1;
            txtTampil.setText(String.valueOf(hasil));
        }
    }//GEN-LAST:event_btnPlusMinusActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Kalkulator dialog = new Kalkulator(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnDelapan;
    private javax.swing.JButton btnDua;
    private javax.swing.JButton btnEmpat;
    private javax.swing.JButton btnEnam;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKoma;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnLima;
    private javax.swing.JButton btnNol;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnSamaDengan;
    private javax.swing.JButton btnSatu;
    private javax.swing.JButton btnSembilan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTiga;
    private javax.swing.JButton btnTujuh;
    private javax.swing.JTextField txtTampil;
    // End of variables declaration//GEN-END:variables
}
