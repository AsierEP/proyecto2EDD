/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree_clases;

/**
 *
 * @author andre
 */
public class Timer {
    
    private int segundos;
    
    
    public Timer() {
        this.segundos = 0;
    }
    
    
    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public void run(){
     
            try{
                 Thread.sleep(1000);
                 segundos++;
            }
           catch(InterruptedException e){
               e.printStackTrace();
           }
        }
    }
    
    

