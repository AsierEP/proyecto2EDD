package Tree;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Dell
 */
public interface Methods_Lista_Documentos {
    
    public boolean IsEmpty();
    
    public void AddStart(String name, int size, int tiempo, String type);
    
    public void AddEnd(String name, int size, int tiempo, String type);
    
    public void AddAtIndex(String name, int size, int tiempo, String type, int index);
    
    public Object DeleteStart();

    public Object DeleteEnd();
    
    public Object deleteAtIndex(int index);




    
    
        
    
}
