/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIs;

/**
 *
 * @author Dell
 */
public class OperativeSistemUI extends javax.swing.JFrame {

    /**
     * Creates new form OperativeSistemUI
     */
    public OperativeSistemUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        UsersOpButt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAUsers = new javax.swing.JTextArea();
        Lab1 = new javax.swing.JLabel();
        Lab2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAColaSecuencia = new javax.swing.JTextArea();
        Lab3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TAColaArbol = new javax.swing.JTextArea();
        Lab4 = new javax.swing.JLabel();
        ArchivesOpButt = new javax.swing.JButton();
        LiberarImpresoraButt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        Title2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setText("Sistema Operativo");
        getContentPane().add(Title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 250, 40));

        UsersOpButt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UsersOpButt.setText("Operaciones con usuarios");
        UsersOpButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsersOpButtActionPerformed(evt);
            }
        });
        getContentPane().add(UsersOpButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 220, 50));

        TAUsers.setColumns(20);
        TAUsers.setRows(5);
        jScrollPane1.setViewportView(TAUsers);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 290, 400));

        Lab1.setForeground(new java.awt.Color(255, 255, 255));
        Lab1.setText("Nombre de usuario, archivos, enviados o no");
        getContentPane().add(Lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 280, -1));

        Lab2.setForeground(new java.awt.Color(255, 255, 255));
        Lab2.setText("a la cola de impresión:");
        getContentPane().add(Lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 220, -1));

        TAColaSecuencia.setColumns(20);
        TAColaSecuencia.setRows(5);
        jScrollPane2.setViewportView(TAColaSecuencia);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 300, 400));

        Lab3.setForeground(new java.awt.Color(255, 255, 255));
        Lab3.setText("Cola de impresión como simple secuencia:");
        getContentPane().add(Lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 260, 30));

        TAColaArbol.setColumns(20);
        TAColaArbol.setRows(5);
        jScrollPane3.setViewportView(TAColaArbol);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 290, 400));

        Lab4.setForeground(new java.awt.Color(255, 255, 255));
        Lab4.setText("Cola de impresión como representación de árbol:");
        getContentPane().add(Lab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 290, -1));

        ArchivesOpButt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ArchivesOpButt.setText("Operaciones con archivos");
        ArchivesOpButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivesOpButtActionPerformed(evt);
            }
        });
        getContentPane().add(ArchivesOpButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 240, 50));

        LiberarImpresoraButt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LiberarImpresoraButt.setText("Liberar impresora");
        LiberarImpresoraButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LiberarImpresoraButtActionPerformed(evt);
            }
        });
        getContentPane().add(LiberarImpresoraButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 270, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIs/BackgroundSistemaOperativo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsersOpButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsersOpButtActionPerformed
        // Visualización de UsersOperations
        this.setVisible(false);
        UsersOperationsUI ventanausersop = new UsersOperationsUI();
        ventanausersop.setVisible(true);
        
        
    }//GEN-LAST:event_UsersOpButtActionPerformed

    private void ArchivesOpButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivesOpButtActionPerformed
        // Visualización de ArchivesOperations
        this.setVisible(false);
        ArchivesOperationsUI ventanaarchivesop = new ArchivesOperationsUI();
        ventanaarchivesop.setVisible(true);
    }//GEN-LAST:event_ArchivesOpButtActionPerformed

    private void LiberarImpresoraButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LiberarImpresoraButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LiberarImpresoraButtActionPerformed

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
    private javax.swing.JButton ArchivesOpButt;
    private javax.swing.JLabel Lab1;
    private javax.swing.JLabel Lab2;
    private javax.swing.JLabel Lab3;
    private javax.swing.JLabel Lab4;
    private javax.swing.JButton LiberarImpresoraButt;
    private javax.swing.JTextArea TAColaArbol;
    private javax.swing.JTextArea TAColaSecuencia;
    private javax.swing.JTextArea TAUsers;
    private javax.swing.JLabel Title2;
    private javax.swing.JButton UsersOpButt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
