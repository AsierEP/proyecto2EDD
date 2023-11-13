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
    private Nodo_lista pFirst;
    private Nodo_lista pLast;
    private int size;

    public Lista_Documentos(Nodo_lista pFirst, int size) {
        this.pFirst = null;
        this.size = 0;
    }

    public Nodo_lista getpFirst() {
        return pFirst;
    }

    public void setpFirst(Nodo_lista pFirst) {
        this.pFirst = pFirst;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo_lista getpLast() {
        return pLast;
    }

    public void setpLast(Nodo_lista pLast) {
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
    public void AddStart(Object data) {
        Nodo_lista newNode = new Nodo_lista(data);
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
    public void AddEnd(Object data) {
        Nodo_lista newNode = new Nodo_lista(data);
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
    public void AddAtIndex(Object data, int index) {
        boolean run = true;
        Nodo_lista newNode = new Nodo_lista(data);
        while(run == true){
            if(index < 0 || index >= len()){
                run = false;
            }
            else{
                if(index == 0){
                    AddStart(data);
                    run = false;
                }
                else{
                    Nodo_lista pointer = pFirst;
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

//    @Override
//    public Object DeleteEnd() {
//        if(IsEmpty() == true){
//            return null;
//        }else{
//        }
//    }

    @Override
    public Object deleteAtIndex(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object DeleteEnd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
