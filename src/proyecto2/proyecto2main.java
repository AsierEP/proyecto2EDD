/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2;

import UIs_trial.LoadArchiveUI;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.ui.javafx.*;
import org.graphstream.ui.view.*;
import org.graphstream.ui.layout.*;

/**
 *
 * @author Dell
 */
public class proyecto2main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("org.graphstream.ui", "swing");
        LoadArchiveUI ventanaload = new LoadArchiveUI();
        ventanaload.setVisible(true);
    }
    
}
