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

    public MinHeap() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
    
    public boolean isEmpty(){
        return getRoot() == null;
    }
    
    public void addNode(String Nombre, int tiempo, int size, String type){
        Node nodo = new Node(Nombre, size, tiempo, type);
        
        if(isEmpty()){
            setRoot(nodo);
        }
        else{
            Node pointer = getRoot();
            while(true){
                if(tiempo > pointer.getTiempo()){
                    if(pointer.getLeft() == null){
                        pointer.setLeft(nodo);
                        heapifyUp(nodo);
                        break;
                    }
                    else{
                        pointer = pointer.getLeft();
                    }
                }
                else{
                    if(pointer.getRight() == null){
                        pointer.setRight(nodo);
                        heapifyUp(nodo);
                        break;
                    }
                    else{
                        pointer = pointer.getRight();
                    }
                }
            }
        }
    }
    
    
    public Node Eliminar_Min(){
        if(isEmpty()){
            System.out.println("El árbol está vacio");
            return null;
        }else{
            Node pointer = getRoot();

            
            Node pointer2 = getLastNode();
            setRoot(pointer2);
            heapifyDown(getRoot());
            return pointer;
        }
    }
    
    public void heapifyUp(Node nodo){
        if(nodo == getRoot()){
            return;
        }
        
        Node subRoot = searchSubRoot(getRoot(), nodo);
        if (subRoot != null){
          if(nodo.getTiempo() < subRoot.getTiempo()){
            swapNodes(nodo, subRoot);
            heapifyUp(nodo);
        }  
        }
        
    }

    public void heapifyDown(Node nodo){
       Node pointer = nodo;
       if(pointer.getLeft() != null && pointer.getLeft().getTiempo() > pointer.getTiempo()){
            pointer.setLeft(pointer.getLeft());
        }
       else if(pointer.getRight() != null && pointer.getRight().getTiempo() > pointer.getTiempo()){
           pointer.setRight(pointer.getRight());
       }
       if(pointer != nodo){
           swapNodes(nodo, pointer);
           heapifyDown(pointer);
       }
    }
    
    
        
    public Node searchSubRoot(Node pointer, Node pointer2){
        if(pointer.getLeft() == pointer2 || pointer.getRight() == pointer2){
            return pointer;
        }
        
        Node leftSubRoot = searchSubRoot(pointer.getLeft(), pointer2);
        if(leftSubRoot != null){
            return leftSubRoot;
        }
        
        Node rightSubRoot = searchSubRoot(pointer.getRight(), pointer2);
        
        if(rightSubRoot != null){
            return rightSubRoot;
        }
        return null;
    }
    
        
        public Node getLastNode(){
        Node pointer = getRoot();
        Node pointer2 = null;
        
        while(pointer.getRight() != null){
            pointer = pointer.getRight();
        }
        
        if(pointer.getLeft() != null){
            pointer2 = pointer.getLeft();
            pointer.setLeft(null);
        }
        else{
            pointer2 = pointer;
        }
        
        return pointer2;
    }
    
    
    public void swapNodes(Node node1, Node node2){
        Node temp = node1;
        node1 = node2;
        node2 = temp;
    }
    
    
    public void print(){
        RecursivePrint(getRoot());
    }
    
    public void RecursivePrint(Node pointer){
        if(pointer == null){
            return;
        }
            System.out.println("Nombre: " + pointer.getName());
            System.out.println("Tiempo: " + pointer.getTiempo());
            System.out.println("Size: " + pointer.getSize());
            System.out.println("Tipo: " + pointer.getType());
            System.out.println();

            RecursivePrint(pointer.getLeft());
            RecursivePrint(pointer.getRight());
        
    }
}

