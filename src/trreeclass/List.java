
package trreeclass;



/**
 *
 * @author Sebastian
 */
public class List implements Methods_Lista{
    
    private List_Node head;
    private int length;
    
    /**
     *Constructor de la lista enlazada
     * 
     */
    public List(){
        this.head = null;
        this.length = 0; 
    }

    /**
     *Obtiene la cabeza de la lista enlazada
     * 
     * @return la cabeza de la lista enlazada
     */
    public List_Node getHead() {
        return head;
    }

    public void setHead(List_Node head) {
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean isEmpty(){
        return getHead() == null;
    }

    @Override
    public void AddStart(Object element){
        List_Node nodo = new List_Node(element);
        if(isEmpty()){
            setHead(nodo);
        }
        else{
            nodo.setNext(getHead());
            setHead(nodo);
        }
        length++;
    }

    @Override
    public void AddEnd(Object element){
        List_Node nodo = new List_Node(element);
        
        if(isEmpty()){
            setHead(nodo);
        }
        else{
            List_Node pointer = getHead();
            while(pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            pointer.setNext(nodo);
        }
        length++;
    }
    
    @Override
    public void AddAtIndex(Object element, int index){
        List_Node nodo = new List_Node(element);
        
        if(isEmpty() || index == 0){
            AddStart(element);
        }
        else{
            if (index < getLength()) {
                List_Node pointer = getHead();
                
                int count = 0;
                
                while(count < index-1){
                    pointer = pointer.getNext();
                    count++;
                }
                
                List_Node temp = pointer.getNext();
                
                nodo.setNext(temp);
                pointer.setNext(nodo);
                length++;
            }
            else if (index == getLength()) {
                AddEnd(element);
            }
            else{
                System.out.println("Index not valid");
            }
        }
        
    }

    @Override
    public List_Node DeleteStart(){
    
        if(isEmpty()){
            System.out.println("La Lista esta vacia");
            return null;
        }
        else{
            List_Node pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            length--;
            return pointer;
        }
    
    }

    @Override
    public List_Node DeleteEnd(){
        
        if(isEmpty()){
            System.out.println("La Lista esta vacia");
            return null;
        }
        else{
            List_Node pointer = getHead();
            while(pointer.getNext().getNext() != null){
                pointer = pointer.getNext();
            }
            List_Node temp = pointer.getNext();
            pointer.setNext(null);
            length--;
            return temp;
        }
    }

    @Override
    public List_Node DeleteAtIndex(int index){
        
        if(isEmpty() || index == 0){
            return DeleteStart();
        }
        else{
            if (index < getLength()) {
                List_Node pointer = getHead();
                
                int count = 0;
                
                while(count < index-1){
                    pointer = pointer.getNext();
                    count++;
                }
                
                List_Node temp = pointer.getNext();
                
                pointer.setNext(temp.getNext());
                temp.setNext(null);
                length--;
                return temp;
            }
            else if (index == getLength()) {
                return DeleteEnd();
            }
            else{
                System.out.println("Index not valid");
                return null;
            }
        }
        
    }

    public void print(){
        List_Node pointer = getHead();
        while(pointer != null){
            System.out.print(" [ " +  pointer.getElement() + " ] ");
            pointer = pointer.getNext();
        }
    }
    
    /**
     *Busca un elemento por su indice
     * 
     * @param index el indice del elemento 
     * @return pAux
     */
    public List_Node searchByIndex(int index){
        List_Node pAux=this.head;
        int count = 0;
        
        while (pAux!=null && count!=index){
            pAux=pAux.getNext();
            count++;
        }
        if (pAux!=null){
            return pAux;
        }else{
            return null;
        }
        
    }

    public Object returnIndexData(int index){
        List_Node returnedNodo=this.searchByIndex(index);
        if (returnedNodo!=null){
            return returnedNodo.getElement();
        }else{
            return null;
        }
    }
    
}
