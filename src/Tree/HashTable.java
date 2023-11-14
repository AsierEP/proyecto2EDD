/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

/**
 *
 * @author Dell
 */
public class HashTable {
    
    private int size;
    public Lista_Documentos[] table;

    public HashTable(int size) {
        this.size = size;
        this.table = table;
        
        
        for(int i = 0; i < size; size++){
            Lista_Documentos auxList = new Lista_Documentos();
            this.table[i] = auxList;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Lista_Documentos[] getTable() {
        return table;
    }

    public void setTable(Lista_Documentos[] table) {
        this.table = table;
    }
    
    public int HashFunction(String Usuario){
        int Hashcode = Usuario.hashCode();
        return Math.abs(Hashcode) % table.length;
    }
    
    public void Add(Usuario Usuario){
        String usuario = Usuario.getNombre();
        int index = HashFunction(usuario);
        table[index].AddAtIndex(usuario, index);
    }
    
    public void Delete(Usuario Usuario){
        String usuario = Usuario.getNombre();
        int index = HashFunction(usuario);
        table[index].deleteAtIndex(index);
    }
    
    public Nodo_lista Search(Usuario Usuario){
        String usuario = Usuario.getNombre();
        int index = HashFunction(usuario);
        return table[index].searchByIndex(index);
    }
    
    public void Print(){
        for(int i = 0; i < getSize(); i++){
            table[i].print();
        }
    }
}