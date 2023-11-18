
package Tree_clases;



/**
 *
 * @author andre
 */
public class List implements Methods_List{
    
    private Nodo_list pFirst;
    private int size;
    
    /**
     *Constructor de la lista enlazada
     * 
     */
    public List(){
        this.pFirst = null;
        this.size = 0; 
    }

    public Nodo_list getpFirst() {
        return pFirst;
    }

    public void setpFirst(Nodo_list pFirst) {
        this.pFirst = pFirst;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    @Override
    public boolean isEmpty(){
        return getpFirst() == null;
    }

    @Override
    public void AddStart(Object element){
        Nodo_list nodo = new Nodo_list(element);
        
        if(isEmpty()){
            setpFirst(nodo);
        }
        else{
            nodo.setpNext(getpFirst());
            setpFirst(nodo);
        }
        size++;
    }

    @Override
    public void AddEnd(Object element){
        Nodo_list nodo = new Nodo_list(element);
        
        if(isEmpty()){
            setpFirst(nodo);
        }
        else{
            Nodo_list pointer = getpFirst();
            while(pointer.getpNext() != null){
                pointer = pointer.getpNext();
            }
            pointer.setpNext(nodo);
        }
        size++;
    }
    
    @Override
    public void AddAtIndex(Object element, int index){
        Nodo_list nodo = new Nodo_list(element);
        
        if(isEmpty() || index == 0){
            AddStart(element);
        }
        else{
            if (index < getSize()) {
                Nodo_list pointer = getpFirst();
                
                int count = 0;
                
                while(count < index-1){
                    pointer = pointer.getpNext();
                    count++;
                }
                
                Nodo_list pAux = pointer.getpNext();
                
                nodo.setpNext(pAux);
                pointer.setpNext(nodo);
                size++;
            }
            else if (index == getSize()) {
                AddEnd(element);
            }
            else{
                System.out.println("Index inválido");
            }
        }
    }

    @Override
    public Nodo_list DeleteStart(){
    
        if(isEmpty()){
            System.out.println("La Lista está vacía");
            return null;
        }
        else{
            Nodo_list pointer = getpFirst();
            setpFirst(pointer.getpNext());
            pointer.setpNext(null);
            size--;
            return pointer;
        }
    }

    @Override
    public Nodo_list DeleteEnd(){
        
        if(isEmpty()){
            System.out.println("La Lista está vacía");
            return null;
        }
        else{
            Nodo_list pointer = getpFirst();
            while(pointer.getpNext().getpNext() != null){
                pointer = pointer.getpNext();
            }
            Nodo_list pAux = pointer.getpNext();
            pointer.setpNext(null);
            size--;
            return pAux;
        }
    }
    
    @Override
    public Nodo_list DeleteAtIndex(int index){
        
        if(isEmpty() || index == 0){
            return DeleteStart();
        }
        else{
            if (index < getSize()) {
                Nodo_list pointer = getpFirst();
                
                int count = 0;
                
                while(count < index-1){
                    pointer = pointer.getpNext();
                    count++;
                }
                
                Nodo_list pAux = pointer.getpNext();
                
                pointer.setpNext(pAux.getpNext());
                pAux.setpNext(null);
                size--;
                return pAux;
            }
            else if (index == getSize()) {
                return DeleteEnd();
            }
            else{
                System.out.println("Index inválido");
                return null;
            }
        }
        
    }

    public void print(){
        Nodo_list pointer = getpFirst();
        while(pointer != null){
            System.out.print(" [ " +  pointer.getElement() + " ] ");
            pointer = pointer.getpNext();
        }
    }

    public Nodo_list searchByIndex(int index){
        Nodo_list pAux=this.pFirst;
        int count = 0;
        
        while (pAux!=null && count!=index){
            pAux=pAux.getpNext();
            count++;
        }
        if (pAux!=null){
            return pAux;
        }else{
            return null;
        }
        
    }

    public Object returnIndexData(int index){
        Nodo_list returnedNodo=this.searchByIndex(index);
        if (returnedNodo!=null){
            return returnedNodo.getElement();
        }else{
            return null;
        }
    }
    
}
