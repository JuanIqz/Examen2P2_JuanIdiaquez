/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanidiaquez;

import java.util.Date;

/**
 *
 * @author juanf
 */
public class Lanzamiento {
    
    String Titulo;
    String FechaP;
    int ConteoL;

    public Lanzamiento() {
    }

    public Lanzamiento(String Titulo, String FechaP, int ConteoL) {
        this.Titulo = Titulo;
        this.FechaP = FechaP;
        this.ConteoL = ConteoL;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getFechaP() {
        return FechaP;
    }

    public void setFechaP(String FechaP) {
        this.FechaP = FechaP;
    }

    public int getConteoL() {
        return ConteoL;
    }

    public void setConteoL(int ConteoL) {
        this.ConteoL = ConteoL;
    }

    @Override
    public String toString() {
        return "Lanzamiento{" + "Titulo=" + Titulo + ", FechaP=" + FechaP + ", ConteoL=" + ConteoL + '}';
    }
    
    
    
}
