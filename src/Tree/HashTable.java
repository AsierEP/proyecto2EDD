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
    public Usuario[] table;

    public HashTable() {
        this.size = 100;
        this.table = new Usuario[100];
        
        
        for(int i = 0; i < size; i++){
            Usuario auxList =new  Usuario("", "", null);
            this.table[i] = auxList;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Usuario[] getTable() {
        return table;
    }

    public void setTable(Usuario[] table) {
        this.table = table;
    }
    
    public int HashFunction(String Usuario){
        int Hashcode = Usuario.hashCode();
        return Math.abs(Hashcode) % table.length;
    }
    
    public void Add(Usuario user){
        String usuario = user.getNombre();
        int index = HashFunction(usuario);
        System.out.println(index);
        if ("".equals(this.table[index].getNombre())){
            this.table[index] = user;
        }
        this.table[index].AddAtIndex(usuario, index);
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