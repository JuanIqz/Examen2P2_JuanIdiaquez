/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanidiaquez;

/**
 *
 * @author juanf
 */
public class Usuario {
    
    String Username;
    String Contra;
    int edad;

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

    public Usuario() {
    }

    public Usuario(String Username, String Contra, int edad) {
        this.Username = Username;
        this.Contra = Contra;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Username=" + Username + ", Contra=" + Contra + ", edad=" + edad + '}';
    }
    
    
}
