/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIs_trial;

import CSV.CSV;
import java.util.Enumeration;
import javax.swing.AbstractButton;
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
public class SendDocumentUI extends javax.swing.JFrame {

    private String path;
    private List usuarios;
    private System_Usuarios SU;
    private BinaryHeap bh;
    private TimerUI time;
    /**
     * Creates new form SendDocumentUI
     */
    public SendDocumentUI() {
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

        PriorityBG = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Title7 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        SendDocumentUNameTF = new javax.swing.JTextField();
        lab3 = new javax.swing.JLabel();
        SendDocumentNameTF = new javax.swing.JTextField();
        lab4 = new javax.swing.JLabel();
        YPrio = new javax.swing.JRadioButton();
        NPrio = new javax.swing.JRadioButton();
        SendDocumentButt = new javax.swing.JButton();
        BackToOSButt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        Title7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Title7.setForeground(new java.awt.Color(255, 255, 255));
        Title7.setText("Enviar documento a la cola");
        getContentPane().add(Title7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 340, 40));

        lab1.setForeground(new java.awt.Color(255, 255, 255));
        lab1.setText("Por favor introduzca los datos que se piden en cada línea de texto");
        getContentPane().add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 740, 30));

        lab2.setForeground(new java.awt.Color(255, 255, 255));
        lab2.setText("Nombre del usuario:");
        getContentPane().add(lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 540, 20));
        getContentPane().add(SendDocumentUNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 540, 40));

        lab3.setForeground(new java.awt.Color(255, 255, 255));
        lab3.setText("Nombre del documento:");
        getContentPane().add(lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 480, 30));
        getContentPane().add(SendDocumentNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 540, 40));

        lab4.setForeground(new java.awt.Color(255, 255, 255));
        lab4.setText("¿El documento es prioritario?");
        getContentPane().add(lab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 160, 40));

        YPrio.setText("SI");
        getContentPane().add(YPrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        NPrio.setText("NO");
        getContentPane().add(NPrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        SendDocumentButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SendDocumentButt.setText("Enviar documento");
        SendDocumentButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendDocumentButtActionPerformed(evt);
            }
        });
        getContentPane().add(SendDocumentButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 310, 60));

        BackToOSButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BackToOSButt.setText("Volver");
        BackToOSButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToOSButtActionPerformed(evt);
            }
        });
        getContentPane().add(BackToOSButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIs_trial/BackGroundSendDocument.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SendDocumentButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendDocumentButtActionPerformed
        CSV C2 = new CSV();
            if (SendDocumentUNameTF.getText().equalsIgnoreCase("")){
           JOptionPane.showMessageDialog(null, "Por favor ingrese un nombre valido");
           }
            else if(!C2.ObtenerStr(getPath()).contains(SendDocumentUNameTF.getText())){
                JOptionPane.showMessageDialog(null, "El usuario no existe");
                SendDocumentUNameTF.setText("");
            }
            else if(SendDocumentNameTF.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre del documento");
                SendDocumentNameTF.setText("");
            }
        else{
            String nombre_user = SendDocumentUNameTF.getText();
            String nombre_docu = SendDocumentNameTF.getText();
            List_Node pointer = getUsuarios().getHead();
            Usuario user = (Usuario) pointer.getElement();
            String choice = "";
            boolean prio = true;
            
            for (Enumeration buttons = PriorityBG.getElements(); buttons.hasMoreElements();) {
                AbstractButton button = (AbstractButton) buttons.nextElement();
                if (button.isSelected()) {
                    choice = button.getText();
                    break;
                }
            }
            if(choice.equalsIgnoreCase("No")){
                prio = false;
            }
            while(pointer != null){
            if(((Usuario)pointer.getElement()).getNombre().equalsIgnoreCase(nombre_user)){
                user = (Usuario) pointer.getElement();
                break;
            }else{
                pointer = pointer.getNext();
                }
            }
            List_Node d = user.getDocumentos().getHead();
            while( d != null){
                if(((Object_Document) d.getElement()).getNombre().equalsIgnoreCase(nombre_docu)){
                    Object_Document doc = (Object_Document) d.getElement();
                    getBh().AddBinaryNode(doc.getNombre(), doc.getTipo(), doc.getSize(), prio, getTime().getSegundosTi(), user);
                    setBh(getBh());
                    break;
                }
                else{
                    d = d.getNext();
                }
            }
          }
        SendDocumentUNameTF.setText("");
        SendDocumentNameTF.setText("");
    }//GEN-LAST:event_SendDocumentButtActionPerformed

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
            java.util.logging.Logger.getLogger(SendDocumentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendDocumentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendDocumentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendDocumentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendDocumentUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToOSButt;
    private javax.swing.JRadioButton NPrio;
    private javax.swing.ButtonGroup PriorityBG;
    private javax.swing.JButton SendDocumentButt;
    private javax.swing.JTextField SendDocumentNameTF;
    private javax.swing.JTextField SendDocumentUNameTF;
    private javax.swing.JLabel Title7;
    private javax.swing.JRadioButton YPrio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
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
