
package Tree_clases;

import CSV.CSV;

/**
 *
 * @author dell
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
    
    private int hashFunction(String user){
        int hashCode = user.hashCode();
        return Math.abs(hashCode) % table.length;
    }
    
    public int UserToInt(String user){
        int hashint = 0;
        for (int i = 0; i < user.length(); i++) {
            hashint += (int) user.charAt(i)*i;
            
        }
        return hashint % table.length;
    }
    
     public void Add(Usuario user){
        String usuario = user.getNombre();
        int index = UserToInt(usuario);
        table[index].AddStart(user.getNombre(),user.getTipo());
    }
     
    public void delete(Usuario user){
        String usuario = user.getNombre();
        int index = UserToInt(usuario);
        table[index].searchUserForDelete(user.getNombre());
    }
    
    public Usuario search(String usuario){
        
        int index = UserToInt(usuario);
        return table[index].searchUser(usuario);
    }
    
    public void print(){
        for (int i = 0; i < getSize(); i++) {
            table[i].print();
        }
    }
    
    public void guardar(CSV csv,String path){
        String data = "";
        for (int i = 0; i < this.size; i++) {
            if (this.table[i]!= null){
                 //data = this.table[i].imprimir(path, csv, data); 
            }
        }
    }
    
    
    
}
