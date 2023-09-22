/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanidiaquez;

import java.util.ArrayList;

/**
 *
 * @author juanf
 */
public class Lista_de_Reproduccion {
 
    String Titulo;
    int ConteoL;
    ArrayList<Cancion> canciones= new ArrayList();

    public Lista_de_Reproduccion() {
    }

    public Lista_de_Reproduccion(String Titulo, int ConteoL) {
        this.Titulo = Titulo;
        this.ConteoL = ConteoL;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getConteoL() {
        return ConteoL;
    }

    public void setConteoL(int ConteoL) {
        this.ConteoL = ConteoL;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Lista_de_Reproduccion{" + "Titulo=" + Titulo + ", ConteoL=" + ConteoL + ", canciones=" + canciones + '}';
    }
    
    
    
    
}
