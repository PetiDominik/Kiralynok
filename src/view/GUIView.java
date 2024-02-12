/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JMenuItem;

/**
 *
 * @author Dominik
 */
public class GUIView extends javax.swing.JFrame {

    /**
     * Creates new form GUIView
     */
    public GUIView() {
        initComponents();
        txtAElonezet.setLineWrap(true);
        
        slideKiralynoCount.setValue(8);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAElonezet = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnElhelyez = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        spinKiralynoCount = new javax.swing.JSpinner();
        slideKiralynoCount = new javax.swing.JSlider();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        spinSorUres = new javax.swing.JSpinner();
        btnSorOszlop = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        spinOszlopUres = new javax.swing.JSpinner();
        txtSorUresE = new javax.swing.JTextField();
        txtOszlopUresE = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUresSorDb = new javax.swing.JTextField();
        txtUresOszlopDb = new javax.swing.JTextField();
        btnUresDb = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuItemFileMentes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Királynők");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Előnézet"));
        jPanel1.setToolTipText("");

        jScrollPane1.setEnabled(false);

        txtAElonezet.setColumns(20);
        txtAElonezet.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtAElonezet.setRows(5);
        txtAElonezet.setEnabled(false);
        txtAElonezet.setMaximumSize(new java.awt.Dimension(200, 200));
        txtAElonezet.setMinimumSize(new java.awt.Dimension(200, 200));
        txtAElonezet.setPreferredSize(new java.awt.Dimension(200, 200));
        jScrollPane1.setViewportView(txtAElonezet);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setToolTipText("");

        btnElhelyez.setText("Elhelyez");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Királynők száma"));

        spinKiralynoCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinKiralynoCountStateChanged(evt);
            }
        });

        slideKiralynoCount.setMaximum(64);
        slideKiralynoCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slideKiralynoCountStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slideKiralynoCount, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spinKiralynoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slideKiralynoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinKiralynoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnElhelyez, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnElhelyez)
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Királynő elh.", jPanel2);

        jLabel1.setText("sor");

        spinSorUres.setValue(1);
        spinSorUres.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinSorUresStateChanged(evt);
            }
        });

        btnSorOszlop.setText("Vizsgál");

        jLabel2.setText("oszlop");

        spinOszlopUres.setValue(1);
        spinOszlopUres.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinOszlopUresStateChanged(evt);
            }
        });

        txtSorUresE.setEditable(false);
        txtSorUresE.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSorUresE.setText("?");

        txtOszlopUresE.setEditable(false);
        txtOszlopUresE.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOszlopUresE.setText("?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSorOszlop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(spinOszlopUres, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtOszlopUresE, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(spinSorUres, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSorUresE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinSorUres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtSorUresE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spinOszlopUres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOszlopUresE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnSorOszlop)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Üres", jPanel3);

        jLabel3.setText("sor");

        jLabel4.setText("oszlop");

        txtUresSorDb.setEditable(false);
        txtUresSorDb.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtUresOszlopDb.setEditable(false);
        txtUresOszlopDb.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnUresDb.setText("Számol");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUresDb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUresSorDb, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(txtUresOszlopDb, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUresSorDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUresOszlopDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUresDb)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Üres DB", jPanel5);

        jMenu2.setText("File");

        menuItemFileMentes.setText("Ment");
        jMenu2.add(menuItemFileMentes);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void spinKiralynoCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinKiralynoCountStateChanged
        int value = (int) spinKiralynoCount.getValue();
        int max = slideKiralynoCount.getMaximum();

        if (value > max) {
            value = 0;
        } else if (value < 0) {
            value = max;
        }
        spinKiralynoCount.setValue(value);

        slideKiralynoCount.setValue(value);
    }//GEN-LAST:event_spinKiralynoCountStateChanged

    private void slideKiralynoCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slideKiralynoCountStateChanged
        int value = slideKiralynoCount.getValue();
        spinKiralynoCount.setValue(value);
    }//GEN-LAST:event_slideKiralynoCountStateChanged

    private void spinSorUresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinSorUresStateChanged
        int value = (int) spinSorUres.getValue();
        if (value < 1) {
            value = 8;
        } else if (value > 8) {
            value = 1;
        }
        
        spinSorUres.setValue(value);
    }//GEN-LAST:event_spinSorUresStateChanged

    private void spinOszlopUresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinOszlopUresStateChanged
        int value = (int) spinOszlopUres.getValue();
        if (value < 1) {
            value = 8;
        } else if (value > 8) {
            value = 1;
        }
        
        spinOszlopUres.setValue(value);
    }//GEN-LAST:event_spinOszlopUresStateChanged

    
    public void megjelenit(char[][] T) {
        String terkoz = "   ";
        String str = terkoz;
        
        for (char[] cs : T) {
            for (char c : cs) {
                str += "%c%s".formatted(c, terkoz);
            }
            str += "\n%s".formatted(terkoz) ;
        }

        txtAElonezet.setText(str);
    }
    
    public JButton getBtnElhelyez() {
        return this.btnElhelyez;
    }
    
    public JButton getBtnSorOszlop() {
        return this.btnSorOszlop;
    }
    
    public JButton getBtnUresDb() {
        return this.btnUresDb;
    }
    
    public JMenuItem getmenuItemFileMentes() {
        return this.menuItemFileMentes;
    }
    
    public int getKiralynoCount() {
        return this.slideKiralynoCount.getValue();
    }
    
    public int getVizsgalSor() {
        return (int) this.spinSorUres.getValue() - 1;
    }
    
    public int getVizsgalOszlop() {
        return (int) this.spinOszlopUres.getValue() - 1;
    }
    
    public void setVizslagSorEredmeny(String str) {
        this.txtSorUresE.setText(str);
    }
    
    public void setVizslagOszlopEredmeny(String str) {
        this.txtOszlopUresE.setText(str);
    }
    
    public void setSorDbEredmeny(String str) {
        this.txtUresSorDb.setText(str);
    }
    
    public void setOszlopDbEredmeny(String str) {
        this.txtUresOszlopDb.setText(str);
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
            java.util.logging.Logger.getLogger(GUIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUIView().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElhelyez;
    private javax.swing.JButton btnSorOszlop;
    private javax.swing.JButton btnUresDb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem menuItemFileMentes;
    private javax.swing.JSlider slideKiralynoCount;
    private javax.swing.JSpinner spinKiralynoCount;
    private javax.swing.JSpinner spinOszlopUres;
    private javax.swing.JSpinner spinSorUres;
    private javax.swing.JTextArea txtAElonezet;
    private javax.swing.JTextField txtOszlopUresE;
    private javax.swing.JTextField txtSorUresE;
    private javax.swing.JTextField txtUresOszlopDb;
    private javax.swing.JTextField txtUresSorDb;
    // End of variables declaration//GEN-END:variables
}
