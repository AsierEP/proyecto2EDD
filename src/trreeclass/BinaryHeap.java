
package trreeclass;

/**
 *
 * @author Sebastian
 */
public class BinaryHeap {
 
    private Node_Document root;
   

    public BinaryHeap() {
        this.root = null;
    }

    public Node_Document getRoot() {
        return root;
    }

    public void setRoot(Node_Document root) {
        this.root = root;
    }
    
     public int size() {
        return getSize(root);
    }

    
    
    public boolean isEmpty(){
        return getRoot() == null;
    }
    
    public Node_Document CheckPrio(Node_Document nodo, Usuario usuario){
        if(nodo.isPrio()){
            if(usuario.getTipo()==1){
                nodo.setSegundos(nodo.getSegundos()/10);
                return nodo;
            }else if (usuario.getTipo()==2){
                nodo.setSegundos(nodo.getSegundos()/5);
                return nodo;
            }else{
                nodo.setSegundos(nodo.getSegundos()/2);
                return nodo;
            }

        }
        else{
            return nodo;
        }
    }
    
    public void AddBinaryNode(String nombre, String tipo, int size, boolean prio, int ti, Usuario usuario){
        Node_Document nodo = new Node_Document(nombre, tipo, size, ti, prio);
        
        CheckPrio(nodo, usuario);
        
        if(isEmpty()){
            setRoot(nodo);
        }
        else{
            Node_Document pointer = getRoot();
            while(true){
                if(ti > pointer.getSegundos()){
                    
                    if(pointer.getLeftSon() == null){
                        pointer.setLeftSon(nodo);
                        heapifyUp(nodo);
                        break;
                    }
                    else if(pointer.getRightSon() == null){
                        pointer.setRightSon(nodo);
                        heapifyUp(nodo);
                        break;
                    }
                    else{
                        Node_Document pointer2 = pointer.getRightSon();
                        pointer = pointer.getLeftSon();
                        
                        if(pointer.getLeftSon() != null && pointer.getRightSon() != null){
                            pointer = pointer2;
                        }
                    } 
                }
            }
        }
    }
    
    
    public Node_Document deleteMin(){
        if(isEmpty()){
            System.out.println("El arbol esta vacio");
            return null;
        }else{
            Node_Document pointer = getRoot();
            Node_Document pointer2 = getLastNode();
            
          
            setRoot(pointer2);
            pointer2.setLeftSon(pointer.getLeftSon());
            pointer2.setRightSon(pointer.getRightSon());
            heapifyDown(getRoot(), true);
            
            return pointer;
        }
    }
    
    public Node_Document getLastNode(){
        Node_Document pointer = getRoot();
        Node_Document pointer2 = null;
        
        if(pointer.getRightSon() == null){
            pointer2 = pointer.getLeftSon();
            pointer.setLeftSon(null);
            return pointer2;
        }
        
        while(pointer.getRightSon() != null){
            pointer2 = pointer;
            pointer = pointer.getRightSon();
        }
        
        if(pointer2 != null){
            pointer2.setRightSon(null);
        }
        else{
            pointer2 = pointer;
            pointer = null;
        }
        
        return pointer;
    }
    
    public void heapifyUp(Node_Document nodo){
        if(nodo == getRoot()){
            return;
        }
        
        Node_Document subRoot = searchSubRoot(getRoot(), nodo);
        
        if(nodo.getSegundos() < subRoot.getSegundos()){
            swapNodes(nodo, subRoot);
            heapifyUp(nodo);
        }
    }
    
    public Node_Document searchSubRoot(Node_Document pointer, Node_Document pointer2){
        try{
        
        if(pointer.getLeftSon() == pointer2 || pointer.getRightSon() == pointer2){
            return pointer;
                }
            
        }catch(Exception e){
            try{
                Node_Document leftSubRoot = searchSubRoot(pointer.getLeftSon(), pointer2);
                if(leftSubRoot != null){
                return leftSubRoot;
                    }
                
            }catch(Exception w){

            Node_Document rightSubRoot = searchSubRoot(pointer.getRightSon(), pointer2);
            return rightSubRoot;
            }  
        }   
       return pointer;   
    }
    
    
    public void heapifyDown(Node_Document nodo, boolean isFirstTime){
       
       if(nodo.getLeftSon() != null && nodo.getLeftSon().getSegundos() < nodo.getSegundos()){
           Node_Document leftSon = nodo.getLeftSon();
           
           Node_Document temp = new Node_Document(leftSon.getNombre(),leftSon.getTipo(),leftSon.getSize(),leftSon.getSegundos(),leftSon.isPrio());
           temp.setLeftSon(leftSon.getLeftSon());
           temp.setRightSon(leftSon.getRightSon());
           
           Node_Document temp2;
            temp2 = new Node_Document(nodo.getNombre(), nodo.getTipo(), nodo.getSize(), nodo.getSegundos(), nodo.isPrio());
           temp2.setLeftSon(leftSon);
           temp2.setRightSon(nodo.getRightSon());
           
           leftSon.setLeftSon(null);
           leftSon.setRightSon(null);
           
           
           nodo.setRightSon(null);
           nodo.setLeftSon(null);
           
           
           
           Node_Document node = swapNodes(nodo, leftSon);
           
           node.setRightSon(temp2.getRightSon());
           node.setLeftSon(nodo);
           
           nodo.setLeftSon(temp.getLeftSon());
           nodo.setRightSon(temp.getRightSon());
           
              if(isFirstTime){
           setRoot(node);
           heapifyDown(nodo, false);
            }else{
             getRoot().setLeftSon(node);
             heapifyDown(nodo, false);
            }
           
       }
       else if(nodo.getRightSon() != null && nodo.getRightSon().getSegundos() < nodo.getSegundos()){
           Node_Document temp = new Node_Document(nodo.getRightSon().getNombre(), nodo.getRightSon().getTipo(), nodo.getRightSon().getSize(), nodo.getRightSon().getSegundos(), nodo.getRightSon().isPrio());
          Node_Document temp2 = new Node_Document(nodo.getNombre(),nodo.getTipo(),nodo.getSize(),nodo.getSegundos(),nodo.isPrio());
           
           Node_Document rightSon = nodo.getRightSon();
           rightSon.setLeftSon(null);
           rightSon.setRightSon(null);
           
           
           nodo.setRightSon(null);
           nodo.setLeftSon(null);
           
           
           
           Node_Document node = swapNodes(nodo, rightSon);
           
           node.setRightSon(nodo);
           node.setLeftSon(temp2.getLeftSon());
           
           nodo.setLeftSon(temp.getLeftSon());
           nodo.setRightSon(temp.getRightSon());
           
            if(isFirstTime){
           setRoot(node);
           heapifyDown(nodo, false);
            }else{
             getRoot().setRightSon(node);
             heapifyDown(nodo, false);
            }
       }
       
       else{
           heapifyUp(nodo);
       }
    }
    
    public Node_Document swapNodes(Node_Document n1, Node_Document n2){
        Node_Document temp = n1;
        n1 = n2;
        n2 = temp;
        return n1;
    }
    
    public int getSize(Node_Document node) {
        if (node == null) {
            return 0;
        }
        int size = 1;
        size += getSize(node.getLeftSon());
        size += getSize(node.getRightSon());
        return size;
    }
    
    
    public void print(){
        printRecur(getRoot());
    }
    
    public void printRecur(Node_Document pointer){
        if(pointer == null){
            return;
        }
            System.out.println("Nombre: " + pointer.getNombre());
            System.out.println("Tipo: " + pointer.getTipo());
            System.out.println("Size: " + pointer.getSize());
            System.out.println("Tiempo: " + pointer.getSegundos());
            System.out.println();

            printRecur(pointer.getLeftSon());
            printRecur(pointer.getRightSon());
        
    }
}

