/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIs_trial;

import javax.swing.JOptionPane;
import trreeclass.BinaryHeap;
import trreeclass.List;
import trreeclass.List_Node;
import trreeclass.Object_Document;
import trreeclass.Usuario;

/**
 *
 * @author Dell
 */
public class AddDocumentUI extends javax.swing.JFrame {

    private String path;
    private List usuarios;
    private System_Usuarios SU;
    private BinaryHeap bh;
    private TimerUI time;
    /**
     * Creates new form AddDocumentUI
     */
    public AddDocumentUI() {
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
        Title5 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        AddDocumentUNameTF = new javax.swing.JTextField();
        lab3 = new javax.swing.JLabel();
        AddDocumentNameTF = new javax.swing.JTextField();
        lab4 = new javax.swing.JLabel();
        AddDocumentSizeTF = new javax.swing.JTextField();
        lab5 = new javax.swing.JLabel();
        AddDocumentTypeTF = new javax.swing.JTextField();
        AddDocumentButt = new javax.swing.JButton();
        BackToOSButt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        Title5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Title5.setForeground(new java.awt.Color(255, 255, 255));
        Title5.setText("Añadir documento");
        getContentPane().add(Title5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 450, 60));

        lab1.setForeground(new java.awt.Color(255, 255, 255));
        lab1.setText("Por favor introduzca los datos que se piden en cada línea de texto:");
        getContentPane().add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 870, 30));

        lab2.setForeground(new java.awt.Color(255, 255, 255));
        lab2.setText("Nombre de usuario:");
        getContentPane().add(lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 270, 20));
        getContentPane().add(AddDocumentUNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 610, 40));

        lab3.setForeground(new java.awt.Color(255, 255, 255));
        lab3.setText("Nombre del documento:");
        getContentPane().add(lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 160, 30));
        getContentPane().add(AddDocumentNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 610, 40));

        lab4.setForeground(new java.awt.Color(255, 255, 255));
        lab4.setText("Tamaño del documento:");
        getContentPane().add(lab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 190, 30));
        getContentPane().add(AddDocumentSizeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 600, 40));

        lab5.setForeground(new java.awt.Color(255, 255, 255));
        lab5.setText("Tipo del documento:");
        getContentPane().add(lab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 410, 30));
        getContentPane().add(AddDocumentTypeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 600, 40));

        AddDocumentButt.setBackground(new java.awt.Color(153, 255, 153));
        AddDocumentButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddDocumentButt.setText("Añadir documento");
        AddDocumentButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDocumentButtActionPerformed(evt);
            }
        });
        getContentPane().add(AddDocumentButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 350, 60));

        BackToOSButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BackToOSButt.setText("Volver");
        BackToOSButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToOSButtActionPerformed(evt);
            }
        });
        getContentPane().add(BackToOSButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIs_trial/BackGroundAddDocument.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddDocumentButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDocumentButtActionPerformed
        String user = AddDocumentUNameTF.getText();
        String nombre = AddDocumentNameTF.getText();
        String tipo = AddDocumentTypeTF.getText();
        String tamaño = AddDocumentSizeTF.getText();
        int tamaño1=Integer.parseInt(tamaño);
        List_Node pAux = getUsuarios().getHead();
        Object_Document doc = new Object_Document(nombre,tipo,tamaño1);
        while (pAux!=null){
            if ((((Usuario) pAux.getElement()).getNombre()).equalsIgnoreCase(user)){
                ((Usuario) pAux.getElement()).getDocumentos().AddEnd(doc);
                System.out.println("hola");
                break;
            }
            pAux=pAux.getNext();
        }
        getSU().setUsuarioslist(usuarios);
        JOptionPane.showMessageDialog(null, "Documento añadido exitosamente");
        
    }//GEN-LAST:event_AddDocumentButtActionPerformed

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
            java.util.logging.Logger.getLogger(AddDocumentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDocumentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDocumentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDocumentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDocumentUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDocumentButt;
    private javax.swing.JTextField AddDocumentNameTF;
    private javax.swing.JTextField AddDocumentSizeTF;
    private javax.swing.JTextField AddDocumentTypeTF;
    private javax.swing.JTextField AddDocumentUNameTF;
    private javax.swing.JButton BackToOSButt;
    private javax.swing.JLabel Title5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel lab5;
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
