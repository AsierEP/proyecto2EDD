
package Tree_clases;

/**
 *
 * @author andre
 */
public interface Methods_List {
    
    public void AddStart(Object element);

    public void AddEnd(Object element);

    public void AddAtIndex(Object element, int index);

    public Object DeleteStart();

    public Object DeleteEnd();

    public Object DeleteAtIndex(int index);

    public boolean isEmpty();
    
}
