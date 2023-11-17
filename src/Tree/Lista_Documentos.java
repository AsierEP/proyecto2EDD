/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

/**
 *
 * @author Dell
 */
public class Lista_Documentos implements Methods_Lista_Documentos {
    private Node pFirst;
    private Node pLast;
    private int size;

    public Lista_Documentos() {
        this.pFirst = null;
        this.size = 0;
    }

    public Node getpFirst() {
        return pFirst;
    }

    public void setpFirst(Node pFirst) {
        this.pFirst = pFirst;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getpLast() {
        return pLast;
    }

    public void setpLast(Node pLast) {
        this.pLast = pLast;
    }
    

    @Override
    public boolean IsEmpty() {
        return this.pFirst == null;
    }
    
    public int len(){
        return getSize();
    }

    @Override
    public void AddStart(String name, int tamano, int tiempo, String type) {
        Node newNode = new Node(name, tamano, tiempo, type);
        if(IsEmpty() == true){
            pFirst = newNode;
            pLast = newNode;
            size++;
        }
        else{
            newNode.setpNext(pFirst);
            pFirst = newNode;
            size++;
        }
    }

    @Override
    public void AddEnd(String name, int tamano, int tiempo, String type) {
        Node newNode = new Node(name, tamano, tiempo, type);
        if(IsEmpty() == true){
            pFirst = newNode;
            size++;
        }
        else{
            pLast.setpNext(newNode);
            pLast = newNode;
            size++;
        }
    }

    @Override
    public void AddAtIndex(String name, int size, int tiempo, String type, int index) {
        boolean run = true;
        Node newNode = new Node(name, size, tiempo, type);
        while(run == true){
            if(index < 0 || index >= len()){
                run = false;
            }
            else{
                if(index == 0){
                    AddStart(name, size, tiempo, type);
                    run = false;
                }
                else{
                    Node pointer = pFirst;
                    for(int x = 1; x < index; x++){
                        pointer = pointer.getpNext();
                    }
                    newNode.setpNext(pointer.getpNext());
                    pointer.setpNext(newNode);
                    size++;  
                    run = false;
                }
            }
        }
    }

    @Override
    public Object DeleteStart() {
        if(IsEmpty() == true){
            return null;
        }else{
            pFirst = pFirst.getpNext();
            size--;
            return null;
        }
    }

    @Override
    public Object deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            System.out.println("index inválido");
            return null;
        }else if(index == 0){
            DeleteStart();
            return pFirst;
        }else if(index == size -1){
            DeleteEnd();
            return pLast;

        }else{
            Node pAux = pFirst;
            for(int i = 0; i < index - 1; i++){
                pAux = pAux.pNext;
            }
            pAux.pNext = pAux.pNext.pNext;
            size--;
            return pAux.pNext;
        }
    }

    @Override
    public Object DeleteEnd() {
        if(IsEmpty() == true || pFirst.pNext == null){
            return null;
        }
        Node pAux = pFirst;
        
        while(pAux.pNext.pNext != null){
            pAux = pAux.pNext;
        }
        
        pAux.pNext = null;
        size--;
        return pFirst;
    }
    
    public Node searchByIndex(int index){
        Node pAux = this.pFirst;
        int count = 0;
        
        while(pAux != null && count != index){
            pAux = pAux.getpNext();
            count++;
        }
        
        if(pAux != null){
            return pAux;
        }else{
            return null;
        }
    }
    
        public void print(){
        Node pAux = this.pFirst;
        
        while(pAux != null){
            System.out.println("Nombre : " + pAux.getName());
            System.out.println("Size : " + pAux.getSize());
            System.out.println("Tiempo : " + pAux.getTiempo());
            System.out.println("Tipo : " + pAux.getType());
            pAux = pAux.getpNext();
        }
    }
}
