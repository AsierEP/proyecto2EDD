/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
/**
 *
 * @author Dell
 */
public class ArchivesOperationsUI extends javax.swing.JFrame {
    private Timer myTimer;
    public int segundos = 0;
    /**
     * Creates new form ArchivesOperationsUI
     */
    public ArchivesOperationsUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        myTimer = new Timer(1000, (ActionEvent e) -> {
            StartTimer();
        });
        myTimer.start();
        
    }
    private void StartTimer(){
        UpdateTime();
        
        
    }
    
    private void UpdateTime(){
        segundos++;
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
        Title4 = new javax.swing.JLabel();
        AddArchiveTF = new javax.swing.JTextField();
        Lab1 = new javax.swing.JLabel();
        RemoveArchiveTF = new javax.swing.JTextField();
        Lab2 = new javax.swing.JLabel();
        Lab3 = new javax.swing.JLabel();
        SendArchiveTF = new javax.swing.JTextField();
        AddArchiveButt = new javax.swing.JButton();
        RemoveArchiveButt = new javax.swing.JButton();
        SendArchiveButt = new javax.swing.JButton();
        BackToSOButt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        Title4.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        Title4.setForeground(new java.awt.Color(255, 255, 255));
        Title4.setText("Operaciones de archivos");
        getContentPane().add(Title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 310, 40));
        getContentPane().add(AddArchiveTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 580, 50));

        Lab1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Lab1.setForeground(new java.awt.Color(255, 255, 255));
        Lab1.setText("Introducir el nombre del archivo, nombre del usuario, prioridad del archivo,  tamaño del archivo y tipo del archivo:");
        getContentPane().add(Lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 740, 40));
        getContentPane().add(RemoveArchiveTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 580, 50));

        Lab2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Lab2.setForeground(new java.awt.Color(255, 255, 255));
        Lab2.setText("Introducir el nombre del archivo, tenga en cuenta que este archivo no puede haber sido enviado a la cola de impresión:");
        getContentPane().add(Lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 780, 30));

        Lab3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Lab3.setForeground(new java.awt.Color(255, 255, 255));
        Lab3.setText("Introducir el nombre del documento para que este sea enviado a la cola de impresión:");
        getContentPane().add(Lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 740, 30));
        getContentPane().add(SendArchiveTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 580, 50));

        AddArchiveButt.setBackground(new java.awt.Color(102, 255, 102));
        AddArchiveButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddArchiveButt.setText("Añadir documento");
        AddArchiveButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddArchiveButtActionPerformed(evt);
            }
        });
        getContentPane().add(AddArchiveButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 240, 50));

        RemoveArchiveButt.setBackground(new java.awt.Color(255, 102, 102));
        RemoveArchiveButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RemoveArchiveButt.setText("Eliminar documento");
        RemoveArchiveButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveArchiveButtActionPerformed(evt);
            }
        });
        getContentPane().add(RemoveArchiveButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 240, 50));

        SendArchiveButt.setBackground(new java.awt.Color(255, 255, 153));
        SendArchiveButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SendArchiveButt.setText("Enviar documento");
        SendArchiveButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendArchiveButtActionPerformed(evt);
            }
        });
        getContentPane().add(SendArchiveButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 230, 50));

        BackToSOButt.setBackground(new java.awt.Color(51, 255, 255));
        BackToSOButt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BackToSOButt.setText("Volver a SO");
        BackToSOButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToSOButtActionPerformed(evt);
            }
        });
        getContentPane().add(BackToSOButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 160, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIs/BackgroundArchiveOperations.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddArchiveButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddArchiveButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddArchiveButtActionPerformed

    private void RemoveArchiveButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveArchiveButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveArchiveButtActionPerformed

    private void SendArchiveButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendArchiveButtActionPerformed
        //
    }//GEN-LAST:event_SendArchiveButtActionPerformed

    private void BackToSOButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToSOButtActionPerformed
        this.setVisible(false);
        OperativeSistemUI ventanaso = new OperativeSistemUI();
        ventanaso.setVisible(true);
    }//GEN-LAST:event_BackToSOButtActionPerformed

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
            java.util.logging.Logger.getLogger(ArchivesOperationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArchivesOperationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArchivesOperationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArchivesOperationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArchivesOperationsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddArchiveButt;
    private javax.swing.JTextField AddArchiveTF;
    private javax.swing.JButton BackToSOButt;
    private javax.swing.JLabel Lab1;
    private javax.swing.JLabel Lab2;
    private javax.swing.JLabel Lab3;
    private javax.swing.JButton RemoveArchiveButt;
    private javax.swing.JTextField RemoveArchiveTF;
    private javax.swing.JButton SendArchiveButt;
    private javax.swing.JTextField SendArchiveTF;
    private javax.swing.JLabel Title4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
