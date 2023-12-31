/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIs_trial;

import javax.swing.JOptionPane;
import trreeclass.BinaryHeap;
import trreeclass.Graphstream_BH;
import trreeclass.List;
import trreeclass.Node_Document;

/**
 *
 * @author Dell
 */
public class OperativeSistemUI extends javax.swing.JFrame {
    private String path;
    private List usuarios;
    private System_Usuarios SU;
    private BinaryHeap bh;
    private TimerUI time;
    /**
     * Creates new form OperativeSistemUI
     */
    public OperativeSistemUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title2 = new javax.swing.JLabel();
        AddUserButt = new javax.swing.JButton();
        DeleteUserButt = new javax.swing.JButton();
        AddDocumentButt = new javax.swing.JButton();
        DeleteUDocumentButt = new javax.swing.JButton();
        Free_PrinterButt = new javax.swing.JButton();
        SendDocumentButt = new javax.swing.JButton();
        DeleteBHDocumentButt = new javax.swing.JButton();
        ShowBHButt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        Title2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setText("Sistema operativo");
        getContentPane().add(Title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 430, 80));

        AddUserButt.setBackground(new java.awt.Color(153, 153, 255));
        AddUserButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddUserButt.setText("Añadir usuario");
        AddUserButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserButtActionPerformed(evt);
            }
        });
        getContentPane().add(AddUserButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 310, 80));

        DeleteUserButt.setBackground(new java.awt.Color(153, 153, 255));
        DeleteUserButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteUserButt.setText("Eliminar usuario");
        DeleteUserButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserButtActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteUserButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 310, 80));

        AddDocumentButt.setBackground(new java.awt.Color(255, 255, 153));
        AddDocumentButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddDocumentButt.setText("Añadir documento");
        AddDocumentButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDocumentButtActionPerformed(evt);
            }
        });
        getContentPane().add(AddDocumentButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 290, 80));

        DeleteUDocumentButt.setBackground(new java.awt.Color(255, 255, 153));
        DeleteUDocumentButt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteUDocumentButt.setText("Eliminar documento de usuario");
        DeleteUDocumentButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUDocumentButtActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteUDocumentButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 290, 80));

        Free_PrinterButt.setBackground(new java.awt.Color(153, 255, 204));
        Free_PrinterButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Free_PrinterButt.setText("Liberar impresora");
        Free_PrinterButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Free_PrinterButtActionPerformed(evt);
            }
        });
        getContentPane().add(Free_PrinterButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 290, 80));

        SendDocumentButt.setBackground(new java.awt.Color(255, 255, 153));
        SendDocumentButt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SendDocumentButt.setText("Enviar documento a imprimir");
        SendDocumentButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendDocumentButtActionPerformed(evt);
            }
        });
        getContentPane().add(SendDocumentButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 290, 70));

        DeleteBHDocumentButt.setBackground(new java.awt.Color(255, 255, 153));
        DeleteBHDocumentButt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteBHDocumentButt.setText("Eliminar documento de la cola");
        DeleteBHDocumentButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBHDocumentButtActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteBHDocumentButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 250, 70));

        ShowBHButt.setBackground(new java.awt.Color(153, 255, 204));
        ShowBHButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ShowBHButt.setText("Ver cola de impresión");
        ShowBHButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowBHButtActionPerformed(evt);
            }
        });
        getContentPane().add(ShowBHButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 250, 80));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Por favor seleccione la opcón que desea realizar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 290, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIs_trial/BackgroundSistemaOperativo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddUserButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserButtActionPerformed
        this.setVisible(false);
        AddUserUI ventanaAU = new AddUserUI();
        ventanaAU.setPath(getPath());
        ventanaAU.setUsuarios(getUsuarios());
        ventanaAU.setSU(getSU());
        ventanaAU.setBh(getBh());
        ventanaAU.setTime(getTime());
        ventanaAU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddUserButtActionPerformed

    private void DeleteUserButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserButtActionPerformed
        this.setVisible(false);
        DeleteUserUI ventanaDU = new DeleteUserUI();
        ventanaDU.setPath(getPath());
        ventanaDU.setUsuarios(getUsuarios());
        ventanaDU.setSU(getSU());
        ventanaDU.setBh(getBh());
        ventanaDU.setTime(getTime());
        ventanaDU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DeleteUserButtActionPerformed

    private void AddDocumentButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDocumentButtActionPerformed
        this.setVisible(false);
        AddDocumentUI ventanaAD = new AddDocumentUI();
        ventanaAD.setPath(getPath());
        ventanaAD.setUsuarios(getUsuarios());
        ventanaAD.setSU(getSU());
        ventanaAD.setBh(getBh());
        ventanaAD.setTime(getTime());
        ventanaAD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddDocumentButtActionPerformed

    private void DeleteUDocumentButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUDocumentButtActionPerformed
        this.setVisible(false);
        DeleteUDocumentUI ventanaDUD = new DeleteUDocumentUI();
        ventanaDUD.setPath(getPath());
        ventanaDUD.setUsuarios(getUsuarios());
        ventanaDUD.setSU(getSU());
        ventanaDUD.setBh(getBh());
        ventanaDUD.setTime(getTime());
        ventanaDUD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DeleteUDocumentButtActionPerformed

    private void Free_PrinterButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Free_PrinterButtActionPerformed
        Node_Document d = getBh().deleteMin();
        System.out.println(d);
        JOptionPane.showMessageDialog(null,"Nombre: "+d.getNombre()+"\n"+"Tipo: "+d.getTipo()+"\n"+"Segundos: "+d.getSegundos()+"\n"+"Tamaño: "+d.getSize()+"\n"+"Prioriridad: "+d.isPrio());
        System.out.println(getBh().getRoot());
    }//GEN-LAST:event_Free_PrinterButtActionPerformed

    private void SendDocumentButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendDocumentButtActionPerformed
        this.setVisible(false);
        SendDocumentUI ventanaSD = new SendDocumentUI();
        ventanaSD.setPath(getPath());
        ventanaSD.setUsuarios(getUsuarios());
        ventanaSD.setSU(getSU());
        ventanaSD.setBh(getBh());
        ventanaSD.setTime(getTime());
        ventanaSD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SendDocumentButtActionPerformed

    private void DeleteBHDocumentButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBHDocumentButtActionPerformed
        this.setVisible(false);
        DeleteDocumentUI ventanaDD = new DeleteDocumentUI();
        ventanaDD.setPath(getPath());
        ventanaDD.setUsuarios(getUsuarios());
        ventanaDD.setSU(getSU());
        ventanaDD.setBh(getBh());
        ventanaDD.setTime(getTime());
        ventanaDD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DeleteBHDocumentButtActionPerformed

    private void ShowBHButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowBHButtActionPerformed
        Graphstream_BH Gbh = new Graphstream_BH(getBh());
        Gbh.ShowTree();
    }//GEN-LAST:event_ShowBHButtActionPerformed

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
            java.util.logging.Logger.getLogger(OperativeSistemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperativeSistemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperativeSistemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperativeSistemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperativeSistemUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDocumentButt;
    private javax.swing.JButton AddUserButt;
    private javax.swing.JButton DeleteBHDocumentButt;
    private javax.swing.JButton DeleteUDocumentButt;
    private javax.swing.JButton DeleteUserButt;
    private javax.swing.JButton Free_PrinterButt;
    private javax.swing.JButton SendDocumentButt;
    private javax.swing.JButton ShowBHButt;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List usuarios) {
        this.usuarios = usuarios;
    }

    public TimerUI getTime() {
        return time;
    }

    public void setTime(TimerUI time) {
        this.time = time;
    }

    public System_Usuarios getSU() {
        return SU;
    }

    public void setSU(System_Usuarios SU) {
        this.SU = SU;
    }

    public BinaryHeap getBh() {
        return bh;
    }

    public void setBh(BinaryHeap bh) {
        this.bh = bh;
    }

    
}
