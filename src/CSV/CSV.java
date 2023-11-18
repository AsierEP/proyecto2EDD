/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSV;

import Tree_clases.List;
import Tree_clases.Usuario;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author UsuarioDeWindows
 */
public class CSV {
        public String Seleccionar(){
        String path;
        JFileChooser buscador = new JFileChooser();
        buscador.showOpenDialog(buscador);
        path = buscador.getSelectedFile().getAbsolutePath();
        return path;
    }

        public List leer(String path){
            BufferedReader br = null;
            List users = new List();
      
        try {

           br =new BufferedReader(new FileReader(path));
           String line = br.readLine();
           while (null!=line) {
              String [] fields = line.split(",");
              int x=0;
              if (fields[1].equalsIgnoreCase("prioridad_baja")){
                  x=3;    
              }else if(fields[1].equalsIgnoreCase("prioridad_media")){
                  x=2;
              }else if (fields[1].equalsIgnoreCase("prioridad_alta")){
                  x=1;
              }
              Usuario usuario = new Usuario(fields[0],x);
              users.AddEnd(usuario);

              line = br.readLine();
           }



           br.close();
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e);
          }
            return users;
        }
        
}
