/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanidiaquez;

/**
 *
 * @author juanf
 */
public class Cancion {
 
    String Titulo;
    String Tduracion;
    Lanzamiento Referencia;

    public Cancion() {
    }

    public Cancion(String Titulo, String Tduracion, Lanzamiento Referencia) {
        this.Titulo = Titulo;
        this.Tduracion = Tduracion;
        this.Referencia = Referencia;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getTduracion() {
        return Tduracion;
    }

    public void setTduracion(String Tduracion) {
        this.Tduracion = Tduracion;
    }

    public Lanzamiento getReferencia() {
        return Referencia;
    }

    public void setReferencia(Lanzamiento Referencia) {
        this.Referencia = Referencia;
    }

    @Override
    public String toString() {
        return "Cancion{" + "Titulo=" + Titulo + ", Tduracion=" + Tduracion + ", Referencia=" + Referencia + '}';
    }
    
    
    
}
