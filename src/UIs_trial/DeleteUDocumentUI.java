/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIs_trial;

import trreeclass.BinaryHeap;
import trreeclass.List;
import trreeclass.List_Node;
import trreeclass.Object_Document;
import trreeclass.Usuario;

/**
 *
 * @author Dell
 */
public class DeleteUDocumentUI extends javax.swing.JFrame {

    private String path;
    private List usuarios;
    private System_Usuarios SU;
    private BinaryHeap bh;
    private TimerUI time;
    /**
     * Creates new form DeleteUDocumentUI
     */
    public DeleteUDocumentUI() {
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
        Title6 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        DeleteUDocumentUNameTF = new javax.swing.JTextField();
        lab3 = new javax.swing.JLabel();
        DeleteUDocumentNameTF = new javax.swing.JTextField();
        DeleteUDocumentButt = new javax.swing.JButton();
        BackToOSButt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        Title6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Title6.setForeground(new java.awt.Color(255, 255, 255));
        Title6.setText("Eliminar documento de usuario");
        getContentPane().add(Title6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 460, 70));

        lab1.setText("Por favor introduzca los datos requeridos en cada línea de texto:");
        getContentPane().add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 710, 40));

        lab2.setForeground(new java.awt.Color(255, 255, 255));
        lab2.setText("Nombre del usuario:");
        getContentPane().add(lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 350, 40));
        getContentPane().add(DeleteUDocumentUNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 540, 50));

        lab3.setForeground(new java.awt.Color(255, 255, 255));
        lab3.setText("Nombre del documento:");
        getContentPane().add(lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 530, 40));
        getContentPane().add(DeleteUDocumentNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 540, 50));

        DeleteUDocumentButt.setBackground(new java.awt.Color(255, 153, 153));
        DeleteUDocumentButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteUDocumentButt.setText("Eliminar documento");
        DeleteUDocumentButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUDocumentButtActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteUDocumentButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 250, 70));

        BackToOSButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BackToOSButt.setText("Volver");
        BackToOSButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToOSButtActionPerformed(evt);
            }
        });
        getContentPane().add(BackToOSButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 110, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIs_trial/BackGroundDeleteUDocument.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteUDocumentButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUDocumentButtActionPerformed
        String usuario = DeleteUDocumentUNameTF.getText();
        String nombre = DeleteUDocumentNameTF.getText();
        List_Node pAux = getUsuarios().getHead();
        int cont = 0;
        while (pAux!=null){
            if ((((Usuario) pAux.getElement()).getNombre()).equalsIgnoreCase(usuario)){
                List_Node pAux2 = ((Usuario) pAux.getElement()).getDocumentos().getHead();
                while(pAux2!=null){
                    if(((Object_Document) pAux2.getElement()).getNombre().equalsIgnoreCase(nombre)){
                        break;
                    }
                    cont++;
                    pAux2=pAux2.getNext();
                }
                ((Usuario) pAux.getElement()).getDocumentos().DeleteAtIndex(cont);
            }
            pAux=pAux.getNext();
        }
    }//GEN-LAST:event_DeleteUDocumentButtActionPerformed

    private void BackToOSButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToOSButtActionPerformed
        this.setVisible(false);
        OperativeSistemUI ventana = new OperativeSistemUI();
        ventana.setPath(getPath());
        ventana.setUsuarios(getUsuarios());
        ventana.setSU(getSU());
        ventana.setBh(getBh());
        ventana.setTime(getTime());
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackToOSButtActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteUDocumentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUDocumentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUDocumentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUDocumentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUDocumentUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToOSButt;
    private javax.swing.JButton DeleteUDocumentButt;
    private javax.swing.JTextField DeleteUDocumentNameTF;
    private javax.swing.JTextField DeleteUDocumentUNameTF;
    private javax.swing.JLabel Title6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
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

    public TimerUI getTime() {
        return time;
    }

    public void setTime(TimerUI time) {
        this.time = time;
    }

    
}
