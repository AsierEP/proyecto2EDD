
package Tree_clases;

import CSV.CSV;



/**
 *
 * @author dell
 */
public class List implements Methods_List{
    
    private Node_Document pFirstD;
    private Usuario pFirst;
    private int size;
    
    /**
     *Constructor de la lista enlazada
     * 
     */
    public List(){
        this.pFirstD = null;
        this.pFirst = null;
        this.size = 0; 
    }

    public Node_Document getpFirstD() {
        return pFirstD;
    }

    public void setpFirstD(Node_Document pFirstD) {
        this.pFirstD = pFirstD;
    }

    public Usuario getpFirst() {
        return pFirst;
    }

    public void setpFirst(Usuario pFirst) {
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
    public void AddStart(String nombre, int prioridad){
        Usuario nodo = new Usuario(nombre, prioridad);
        
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
    public void AddEnd(String nombre, int prioridad){
        Usuario nodo = new Usuario(nombre, prioridad);
        
        if(isEmpty()){
            setpFirst(nodo);
        }
        else{
            Usuario pointer = getpFirst();
            while(pointer.getpNext() != null){
                pointer = pointer.getpNext();
            }
            pointer.setpNext(nodo);
        }
        size++;
    }
    
    @Override
    public void AddAtIndex(String nombre, int prioridad, int index){
        Usuario nodo = new Usuario(nombre, prioridad);
        
        if(isEmpty() || index == 0){
            AddStart(nombre, prioridad);
        }
        else{
            if (index < getSize()) {
                Usuario pointer = getpFirst();
                
                int count = 0;
                
                while(count < index-1){
                    pointer = pointer.getpNext();
                    count++;
                }
                
                Usuario pAux = pointer.getpNext();
                
                nodo.setpNext(pAux);
                pointer.setpNext(nodo);
                size++;
            }
            else if (index == getSize()) {
                AddEnd(nombre, prioridad);
            }
            else{
                System.out.println("Index inválido");
            }
        }
    }

    @Override
    public Usuario DeleteStart(){
    
        if(isEmpty()){
            System.out.println("La Lista está vacía");
            return null;
        }
        else{
            Usuario pointer = getpFirst();
            setpFirst(pointer.getpNext());
            pointer.setpNext(null);
            size--;
            return pointer;
        }
    }

    @Override
    public Usuario DeleteEnd(){
        
        if(isEmpty()){
            System.out.println("La Lista está vacía");
            return null;
        }
        else{
            Usuario pointer = getpFirst();
            while(pointer.getpNext().getpNext() != null){
                pointer = pointer.getpNext();
            }
            Usuario pAux = pointer.getpNext();
            pointer.setpNext(null);
            size--;
            return pAux;
        }
    }
    
    @Override
    public Usuario DeleteAtIndex(int index){
        
        if(isEmpty() || index == 0){
            return DeleteStart();
        }
        else{
            if (index < getSize()) {
                Usuario pointer = getpFirst();
                
                int count = 0;
                
                while(count < index-1){
                    pointer = pointer.getpNext();
                    count++;
                }
                
                Usuario pAux = pointer.getpNext();
                
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
        Usuario pointer = getpFirst();
        while(pointer != null){
            System.out.print(" [ " +  pointer.getNombre()+ "," + pointer.getTipo() + " ] ");
            pointer = pointer.getpNext();
        }
    }

    public Usuario searchByIndex(int index){
        Usuario pAux=this.pFirst;
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
    
    public Usuario searchUser(String user){
        Usuario pAux = pFirst;
        if(isEmpty() == false){
            while(pAux != null && !pAux.getNombre().equals(user)){
                pAux = pAux.getpNext();
            }
            if(pAux == null){
                return null;
            }else{
                return pAux;
            }
        }else{
            return null;
        }        
    }
    
    public void searchUserForDelete(String user){
        Usuario pAux = pFirst;
        if(isEmpty() == false){
            if(pAux.getNombre() == pFirst.getNombre()){
                this.pFirst = pFirst.getpNext();
            }else{
                while(pAux.getpNext() != null && !pAux.getpNext().getNombre().equals(user)){
                    pAux = pAux.getpNext();
                }
                if(pAux.getpNext() != null){
                    pAux.setpNext(pAux.getpNext().getpNext());
                }
            }
        }      
    }

    public Object returnIndexData(int index){
        Usuario returnedNodo=this.searchByIndex(index);
        if (returnedNodo!=null){
            return returnedNodo.getNombre();
        }else{
            return null;
        }
    }
    
    public void imprimir(String path, CSV csv, String data){
        Usuario pAux = pFirst;
        while(pAux != null){
//            csv.ModifyCSV(path, data, pAux.getNombre(), String.valueOf(pAux.getTipo()));
            pAux = pAux.getpNext();
        }
    } 
    
    public String imprimirUsuarios (String s){
        Usuario pAux = pFirst;
        while(pAux != null){
            s += pAux.getNombre() + "\n";
            s = imprimirDocumentos(s);
            pAux = pAux.getpNext();
        }return s;
    } 
    
    public String imprimirDocumentos (String d){
       
        Node_Document pAux = pFirstD;
        while(pAux != null){
            d += pAux.getNombre() + "\n";
            pAux = pAux.getpNext();
        }
        return d;
    }
    
    public void AddDocumentAtEnd(String nombre, String tipo, int size, int tiempo, boolean prio){
        Node_Document nodo = new Node_Document(nombre, tipo, size, tiempo, prio);
        if(pFirstD == null){
            setpFirstD(nodo);
        }
        else{
            Node_Document pointer = getpFirstD();
            while(pointer.getpNext() != null){
                pointer = pointer.getpNext();
            }
            pointer.setpNext(nodo);
        }
        size++;
    }
    
    public void DeleteDocument (String nombre){
        Node_Document pAux = pFirstD;
        if(isEmpty() == true){
            System.out.println("La lista está vacía");
        }else if(pAux.getNombre() == pFirstD.getNombre()){
            pFirstD = pFirstD.getpNext();
        }else{
            while(pAux.getpNext() != null){
                if(pAux.getpNext().getNombre().equals(nombre)){
                    break;
                }else{
                    pAux = pAux.getpNext();
                }
            }
        }
    }
}

