
package Tree_clases;

/**
 *
 * @author dell
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
    
    
    public boolean isEmpty(){
        return getRoot() == null;
    }
    
    public Node_Document checkPrio(Node_Document nodo, Usuario user){
        if(nodo.isPrio()){
            switch (user.getTipo()) {
                case 1 -> {
                    nodo.setTiempo(nodo.getTiempo()/10);
                    return nodo;
                }
                case 2 -> {
                    nodo.setTiempo(nodo.getTiempo()/5);
                    return nodo;
                }
                default -> {
                    nodo.setTiempo(nodo.getTiempo()/1);
                    return nodo;
                }
            }
        }
        else{
            return nodo;
        }
    }
    
    public void AddNodeBinHeap(String nombre, String tipo, int size, boolean prio, Timer time, Usuario usuario){
        int tiempo = time.getSegundos();
        Node_Document nodo = new Node_Document(nombre, tipo, size, tiempo , prio);
        
        checkPrio(nodo, usuario);
        
        if(isEmpty()){
            setRoot(nodo);
        }
        else{
            Node_Document pointer = getRoot();
            while(true){
                if(tiempo > pointer.getTiempo()){
                    if(pointer.getLeftSon() == null){
                        pointer.setLeftSon(nodo);
                        heapifyUp(nodo);
                        break;
                    }
                    else{
                        pointer = pointer.getLeftSon();
                    }
                }
                else{
                    if(pointer.getRightSon() == null){
                        pointer.setRightSon(nodo);
                        heapifyUp(nodo);
                        break;
                    }
                    else{
                        pointer = pointer.getRightSon();
                    }
                }
            }
        }
    }
    
    
    public Node_Document delete_Min(){
        if(isEmpty()){
            System.out.println("El árbol está vacio ");
            return null;
        }else{
            Node_Document pointer = getRoot();

            
            Node_Document pointer2 = getLastNode();
            setRoot(pointer2);
            heapifyDown(getRoot());
            return pointer;
        }
    }
    
    public Node_Document getLastNode(){
        Node_Document pointer = getRoot();
        Node_Document pointer2 = null;
        
        while(pointer.getRightSon() != null){
            pointer = pointer.getRightSon();
        }
        
        if(pointer.getLeftSon() != null){
            pointer2 = pointer.getLeftSon();
            pointer.setLeftSon(null);
        }
        else{
            pointer2 = pointer;
        }
        
        return pointer2;
    }
    
    public void heapifyUp(Node_Document node){
        if(node == getRoot()){
            return;
        }
        
        Node_Document subRoot = searchSubRoot(getRoot(), node);
        
        if(node.getTiempo() < subRoot.getTiempo()){
            swapNodes(node, subRoot);
            heapifyUp(node);
        }
    }
    
    public Node_Document searchSubRoot(Node_Document pointer, Node_Document pointer2){
        if(pointer.getLeftSon() == pointer2 || pointer.getRightSon() == pointer2){
            return pointer;
        }
        
        Node_Document leftSubRoot = searchSubRoot(pointer.getLeftSon(), pointer2);
        if(leftSubRoot != null){
            return leftSubRoot;
        }
        
        Node_Document rightSubRoot = searchSubRoot(pointer.getRightSon(), pointer2);
        return rightSubRoot;
    }
    
    
    public void heapifyDown(Node_Document node){
       Node_Document pointer = node;
       if(pointer.getLeftSon() != null && pointer.getLeftSon().getTiempo() > pointer.getTiempo()){
            pointer.setLeftSon(pointer.getLeftSon());
        }
       else if(pointer.getRightSon() != null && pointer.getRightSon().getTiempo() > pointer.getTiempo()){
           pointer.setRightSon(pointer.getRightSon());
       }
       if(pointer != node){
           swapNodes(node, pointer);
           heapifyDown(pointer);
       }
    }
    
    public void swapNodes(Node_Document node1, Node_Document node2){
        Node_Document aux = node1;
        node1 = node2;
        node2 = aux;
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
            System.out.println("Tiempo: " + pointer.getTiempo());
            System.out.println();

            printRecur(pointer.getLeftSon());
            printRecur(pointer.getRightSon());
        
    }
    
    
}



    
