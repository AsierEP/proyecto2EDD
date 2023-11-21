
package Tree_clases;
import java.util.Random;

/**
 *
 * @author dell
 */
public class Usuario {
    
    private String nombre;
    private int tipo;
    private List Documentos;

    public Usuario(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public List getDocumentos() {
        return Documentos;
    }

    public void setDocumentos(List Documentos) {
        this.Documentos = Documentos;
    }
}
