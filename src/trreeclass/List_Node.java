
package trreeclass;

/**
 *
 * @author dell
 */
public class List_Node {
    
    private Object element;
    private List_Node pNext;
    
    /**
     *Constructor del nodo
     * 
     * @param element el elemento para ser guardado en el nodo
     */
    public List_Node(Object element){
        this.element = element;
        this.pNext = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public List_Node getNext() {
        return pNext;
    }

    public void setNext(List_Node next) {
        this.pNext = next;
    }
    
    
    
}
