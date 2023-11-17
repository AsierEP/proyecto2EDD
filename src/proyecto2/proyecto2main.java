/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2;

import Tree.HashTable;
import Tree.Lista_Documentos;
import Tree.MinHeap;
import Tree.Usuario;
import UIs.LoadArchiveUI;
import UIs.TimerUI;

/**
 *
 * @author Dell
 */
public class proyecto2main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        MinHeap prueba = new MinHeap();
//        prueba.addNode("si", 12, 36, "PDF");
//        prueba.addNode("no", 18, 67, "DOCX");
//        prueba.addNode("nop", 20, 2, "del");
//        prueba.print();

        HashTable pruebaHash = new HashTable();
        Lista_Documentos x = new Lista_Documentos();
        x.AddStart("pakalk", 45, 32, "PDF");
        x.AddEnd("jbjqbkq", 29, 76, "snsn");
        x.print();
        Usuario usuario1 = new Usuario( "Juan",  "Alta",  x);
        pruebaHash.Add(usuario1);
        pruebaHash.Print();
        
        
        LoadArchiveUI ventanaload = new LoadArchiveUI();
        ventanaload.setVisible(true);
        TimerUI ventanatimer = new TimerUI();
        ventanatimer.setVisible(true);
    }
    
}
