/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

/**
 *
 * @author Dell
 */
public class Usuario {
    
    private String nombre;
    private int prioridad;
    private Lista_Documentos documentos;

    public Usuario(String nombre, int prioridad, Lista_Documentos documentos) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.documentos = documentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Lista_Documentos getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Lista_Documentos documentos) {
        this.documentos = documentos;
    }
    
    
    
    
}
