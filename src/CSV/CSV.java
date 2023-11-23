/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSV;

import Tree_clases.HashTable;
import Tree_clases.List;
import Tree_clases.Usuario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
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

        public HashTable leer(String path){
            BufferedReader br = null;
            HashTable users = new HashTable(100);
      
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
               Usuario user = new Usuario(fields[0], x);
              users.Add(user);
               System.out.println(user.getNombre());

              line = br.readLine();
           }



           br.close();
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e);
          }
            return users;
        }
        
        public HashTable getHashTable(String path){
            HashTable h= new HashTable(300);
            String str = "";
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(path));
                
                String line = br.readLine();
                while(line != null){
                    str = line;
                    String[] u = str.split(",");
                    int num = 0;
                    if(u[1].equals("prioridad_alta")){
                        num = 1;
                    }else if(u[1].equals("prioridad_media")){
                        num = 2;
                    }else if(u[1].equals("prioridad_baja")){
                        num = 3;
                    }
                    Usuario user = new Usuario(u[0],num);
                    h.Add(user);
                    line = br.readLine();
                }
                br.close();
            }catch (Exception e) {
                e.getStackTrace();
            }
            return h;            
        }
        public String getString(String path){
            String str = "";
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(path));
                
                String line = br.readLine();
                while(line != null){
                    str = str + line + "\n";
                    line = br.readLine();
                }
                br.close();
            }catch (Exception e) {
                e.getStackTrace();
            }
            return str;
        }
        
//        public void ModifyCSV(String path, String data, String nombre, String tipo){
//            try {
//            PrintWriter output = new PrintWriter(path);
//            data = data + nombre + "," + tipo + "\n";
//            output.write(data); 
//            output.close(); 
//        } 
//  
//        catch (Exception e) { 
//            e.getStackTrace();
//        } 
//    }
    public void ModifyCSV(String path, String data){
            try {
            PrintWriter output = new PrintWriter(path);
            output.write(data); 
            output.close(); 
        } 
  
        catch (Exception e) { 
            e.getStackTrace();
        } 
    }
        
        public String DeleteLine(String path, String nombre){
        String str = "";
        BufferedReader br = null;
           
           try {
           br =new BufferedReader(new FileReader(path));
           String line = br.readLine();
           while (line!=null) {
              if(line.contains(nombre) == false){
              str = str + line + "\n";
              }
              line = br.readLine();
           }
           br.close();
           } catch (Exception e) {
               e.getStackTrace();
          }
       return str;
    }
        
        public void DeleteCSV(String path, String data){
            try {
            PrintWriter output = new PrintWriter(path);
            output.write(data); 
            output.close(); 
        }catch (Exception e) { 
            e.getStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
}
