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
public class Artista extends Usuario{
    
    String NombreA;
    ArrayList<Cancion> CancionesS= new ArrayList();
   ArrayList<Lanzamiento> AlbumesP= new ArrayList();

    public Artista() {
    }

    public Artista(String Username, String Contra, int edad) {
        super(Username, Contra, edad);
    }

    public Artista(String NombreA) {
        this.NombreA = NombreA;
    }

    public String getNombreA() {
        return NombreA;
    }

    public void setNombreA(String NombreA) {
        this.NombreA = NombreA;
    }

    public ArrayList<Cancion> getCancionesS() {
        return CancionesS;
    }

    public void setCancionesS(ArrayList<Cancion> CancionesS) {
        this.CancionesS = CancionesS;
    }

    public ArrayList<Lanzamiento> getAlbumesP() {
        return AlbumesP;
    }

    public void setAlbumesP(ArrayList<Lanzamiento> AlbumesP) {
        this.AlbumesP = AlbumesP;
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
        return "Artista{" + "NombreA=" + NombreA + ", CancionesS=" + CancionesS + ", AlbumesP=" + AlbumesP + '}';
    }
   
   
   
}
