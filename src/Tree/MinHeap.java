/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

/**
 *
 * @author Dell
 */
public class MinHeap {
    
    private Node root;
    private int size;

    public MinHeap(Node root, int size) {
        this.root = null;
        this.size = 0;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
    public boolean isLeftEmpty(Node nodo){
        return nodo.getLeft() == null;
    }
    
    public void insert(int data){
        if(isEmpty() == false){
            addDocument(root, data);
        }else{
            root = new Node(data);
        }
    }
    
    public void addDocument(Node nodo, int data){
        if(data >= nodo.getData()){
            if(isLeftEmpty(nodo) == false){
                nodo.setLeft(nodo);
            }else{
                nodo.setRight(nodo);
            }
        }else{
            this.setRoot(nodo);
            
        }
    }
}
