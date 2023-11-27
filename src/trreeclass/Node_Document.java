/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trreeclass;

/**
 *
 * @author dell
 */
public class Node_Document {
    
//    private Documento doc;
    private String nombre;
    private String tipo;
    private int size;
    private int segundos;
    private boolean prio;
    private Node_Document leftSon,rightSon;
    

    public Node_Document(String nombre, String tipo, int size, int segundos, boolean prio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.size = size;
        this.segundos = segundos;
        this.prio = prio;
        this.leftSon = null;
        this.rightSon = null;
    }

    public Node_Document getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(Node_Document leftSon) {
        this.leftSon = leftSon;
    }

    public Node_Document getRightSon() {
        return rightSon;
    }

    public void setRightSon(Node_Document rightSon) {
        this.rightSon = rightSon;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }    

    public boolean isPrio() {
        return prio;
    }

    public void setPrio(boolean prio) {
        this.prio = prio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isLeaf(){
        return getRightSon() == null && getLeftSon() == null;
    }
    
    public boolean hasOnlyRightSon(){
        return getRightSon() != null && getLeftSon() == null;
    }
    
    public boolean hasOnlyLeftSon(){
        return getRightSon() == null && getLeftSon() != null;
    }  
}
