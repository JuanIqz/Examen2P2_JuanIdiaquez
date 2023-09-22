/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanidiaquez;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author juanf
 */
public class Album extends Lanzamiento{
    
    ArrayList<Cancion> Canciones= new ArrayList();
    int CantiC;

    public Album() {
    }

    public Album(int CantiC) {
        this.CantiC = CantiC;
    }

    public Album(String Titulo, String FechaP, int ConteoL) {
        super(Titulo, FechaP, ConteoL);
    }

    public ArrayList<Cancion> getCanciones() {
        return Canciones;
    }

    public void setCanciones(ArrayList<Cancion> Canciones) {
        this.Canciones = Canciones;
    }

    public int getCantiC() {
        return CantiC;
    }

    public void setCantiC(int CantiC) {
        this.CantiC = CantiC;
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
        return "Album{" + "Canciones=" + Canciones + ", CantiC=" + CantiC + '}';
    }
    
    
    
    
}
