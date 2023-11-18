
package Tree_clases;

/**
 *
 * @author andre
 */
public class HashTable {
    
    private int size;
    public List[] table;

    public HashTable(int size) {
        
        this.size = size;
        this.table = new List[size];
        
        for(int i= 0;i<size;i++){
            List aux = new List();
            this.table[i] = aux;
            }
        
    }
   

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List[] getTabla() {
        return table;
    }

    public void setTabla(List[] table) {
        this.table = table;
    }
    
    private int hashFunction(Integer user){
        int hashCode = user.hashCode();
        return Math.abs(hashCode) % table.length;
    }
    
//     public void Add(Usuario user){
//        int usuario = user.getID();
//        int index = hashFunction(usuario);
//        table[index].AddAtIndex(usuario,index);
//    }
//     
//    public void delete(Usuario user){
//        int usuario = user.getID();
//        int index = hashFunction(usuario);
//        table[index].DeleteAtIndex(index);
//    }
//    
//    public Nodo_list search(Usuario user){
//        int usuario = user.getID();
//        int index = hashFunction(usuario);
//        return table[index].searchByIndex(index);
//    }
    
    public void print(){
        for (int i = 0; i < getSize(); i++) {
            table[i].print();
        }
    }
    
    
    
}
