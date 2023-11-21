
package Tree_clases;

/**
 *
 * @author dell
 */
public interface Methods_List {
    
    public void AddStart(String nombre, int prioridad);

    public void AddEnd(String nombre, int prioridad);

    public void AddAtIndex(String nombre, int prioridad, int index);

    public Object DeleteStart();

    public Object DeleteEnd();

    public Object DeleteAtIndex(int index);

    public boolean isEmpty();
    
}
