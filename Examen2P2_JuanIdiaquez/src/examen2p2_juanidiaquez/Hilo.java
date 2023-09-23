/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanidiaquez;

import javax.swing.JProgressBar;

/**
 *
 * @author juanf
 */
public class Hilo extends Thread{
    
    JProgressBar barra; 

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public Hilo(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run() {
        
        for (int i = 1; i <= 5; i++) {
            barra.setValue(barra.getValue()+i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
            }
        }
    }
    
    
}
