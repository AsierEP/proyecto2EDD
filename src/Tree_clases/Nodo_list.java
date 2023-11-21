
package Tree_clases;

/**
 *
 * @author dell
 */
public class Nodo_list {
    
    private Object element;
    private Nodo_list pNext;
    
    /**
     *Constructor del nodo
     * 
     * @param element el elemento para ser guardado en el nodo
     */
    public Nodo_list(Object element){
        this.element = element;
        this.pNext = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Nodo_list getpNext() {
        return pNext;
    }

    public void setpNext(Nodo_list pNext) {
        this.pNext = pNext;
    }
    
 
}
