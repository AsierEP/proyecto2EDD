/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

/**
 *
 * @author Dell
 */
public class Nodo_lista {
    
    private Object data;
    private Nodo_lista pNext;

    public Nodo_lista(Object data, Nodo_lista pNext) {
        this.data = data;
        this.pNext = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Nodo_lista getpNext() {
        return pNext;
    }

    public void setpNext(Nodo_lista pNext) {
        this.pNext = pNext;
    }
    
    
    
    
    
}
