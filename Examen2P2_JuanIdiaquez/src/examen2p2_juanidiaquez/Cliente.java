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
public class Cliente extends Usuario{
    
    ArrayList <Cancion> canciones= new ArrayList();
    ArrayList<Lista_de_Reproduccion> playlist= new ArrayList();
    ArrayList<Lista_de_Reproduccion> playlist_gustadas= new ArrayList();
    
    public Cliente(String Username, String Contra, int edad) {
        super(Username, Contra, edad);
    }

    public Cliente() {
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Lista_de_Reproduccion> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Lista_de_Reproduccion> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<Lista_de_Reproduccion> getPlaylist_gustadas() {
        return playlist_gustadas;
    }

    public void setPlaylist_gustadas(ArrayList<Lista_de_Reproduccion> playlist_gustadas) {
        this.playlist_gustadas = playlist_gustadas;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "canciones=" + canciones + ", playlist=" + playlist + ", playlist_gustadas=" + playlist_gustadas + '}';
    }
    
    
    
    
    
}
