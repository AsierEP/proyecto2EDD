
package trreeclass;

/**
 *
 * @author Dell
 */
public class HashTable {
    
    private int size;
    public List[] tabla;

    public HashTable(int size) {
        
        this.size = size;
        this.tabla = new List[size];
        
        for(int i= 0;i<size;i++){
            List temp = new List();
            this.tabla[i] = temp;
            }
        
    }
   

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List[] getTabla() {
        return tabla;
    }

    public void setTabla(List[] tabla) {
        this.tabla = tabla;
    }
    
    private int hashFunction(String usuario){
        int hashCode = usuario.hashCode();
        return Math.abs(hashCode) % tabla.length;
    }
    
     public void insert(Usuario Usuario){
        String usuario = Usuario.getNombre();
        int index = hashFunction(usuario);
        tabla[index].AddAtIndex(Usuario.getDocumentos(),index);
         System.out.println(index);
    }
     
    public void delete(Usuario Usuario){
        String usuario = Usuario.getNombre();
        int index = hashFunction(usuario);
        tabla[index].DeleteAtIndex(index);
    }
    
    public List_Node search(Usuario Usuario){
        String usuario = Usuario.getNombre();
        int index = hashFunction(usuario);
        return tabla[index].searchByIndex(index);
    }
    
    public void print(){
        for (int i = 0; i < getSize(); i++) {
            tabla[i].print();
        }
    } 
}
