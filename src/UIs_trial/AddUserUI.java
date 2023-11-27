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

/**
 *
 * @author Dell
 */
public class AddUserUI extends javax.swing.JFrame {
    private String path;
    private List usuarios;
    private System_Usuarios SU;
    private BinaryHeap bh;
    private TimerUI time;

    /**
     * Creates new form AddUserUI
     */
    public AddUserUI() {
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

        PriorityButtons = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Title3 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        AddUserNameTF = new javax.swing.JTextField();
        AddUserButt = new javax.swing.JButton();
        BackToSO = new javax.swing.JButton();
        HPradioButt = new javax.swing.JRadioButton();
        MPradioButt = new javax.swing.JRadioButton();
        LPradioButt = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        Title3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Title3.setForeground(new java.awt.Color(255, 255, 255));
        Title3.setText("Añadir Usuario");
        getContentPane().add(Title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 220, 70));

        lab1.setForeground(new java.awt.Color(255, 255, 255));
        lab1.setText("Introduzca el nombre del usuario, tenga en cuenta que estos no se pueden repetir:");
        getContentPane().add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 870, 40));
        getContentPane().add(AddUserNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 610, 40));

        AddUserButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddUserButt.setText("Añadir usuario");
        AddUserButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserButtActionPerformed(evt);
            }
        });
        getContentPane().add(AddUserButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 330, 50));

        BackToSO.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BackToSO.setText("Volver");
        BackToSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToSOActionPerformed(evt);
            }
        });
        getContentPane().add(BackToSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 160, 50));

        HPradioButt.setForeground(new java.awt.Color(255, 255, 255));
        HPradioButt.setText("Prioridad Alta");
        getContentPane().add(HPradioButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 160, -1));

        MPradioButt.setForeground(new java.awt.Color(255, 255, 255));
        MPradioButt.setText("Prioridad Media");
        getContentPane().add(MPradioButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 140, -1));

        LPradioButt.setForeground(new java.awt.Color(255, 255, 255));
        LPradioButt.setText("Prioridad Baja");
        getContentPane().add(LPradioButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 170, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Por favor seleccione la prioridad del usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 390, 60));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIs_trial/BackgroundUsersOperations.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddUserButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserButtActionPerformed
          CSV C2 = new CSV();
        if (AddUserNameTF.getText().equalsIgnoreCase("") || C2.ObtenerStr(getPath()).equalsIgnoreCase(AddUserNameTF.getText())){
            if (AddUserNameTF.getText().equalsIgnoreCase("")){
           JOptionPane.showMessageDialog(null, "Por favor ingrese un nombre valido");
           }
            else if (C2.ObtenerStr(getPath()).contains(AddUserNameTF.getText())){
               JOptionPane.showMessageDialog(null, "El usuario ya existe, solo puede agregar nuevos usuarios");
               AddUserNameTF.setText("");
           }
        }else{
        String nombre=AddUserNameTF.getText();
        String choice = null;
            for (Enumeration buttons = PriorityButtons.getElements(); buttons.hasMoreElements();) {
                AbstractButton button = (AbstractButton) buttons.nextElement();
                if (button.isSelected()) {
                    choice = button.getText();
                    break;
                }
            }
       CSV C = new CSV();
       C.modificarCSV(getPath(),C2.ObtenerStr(getPath()), nombre,choice);
       JOptionPane.showMessageDialog(null, "El usuario fue añadido exitosamente");
        }
    }//GEN-LAST:event_AddUserButtActionPerformed

    private void BackToSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToSOActionPerformed
        this.setVisible(false);
        OperativeSistemUI ventana = new OperativeSistemUI();
        ventana.setPath(getPath());
        ventana.setUsuarios(getUsuarios());
        ventana.setSU(getSU());
        ventana.setBh(getBh());
        ventana.setTime(getTime());
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackToSOActionPerformed

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
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUserUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUserButt;
    private javax.swing.JTextField AddUserNameTF;
    private javax.swing.JButton BackToSO;
    private javax.swing.JRadioButton HPradioButt;
    private javax.swing.JRadioButton LPradioButt;
    private javax.swing.JRadioButton MPradioButt;
    private javax.swing.ButtonGroup PriorityButtons;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab1;
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