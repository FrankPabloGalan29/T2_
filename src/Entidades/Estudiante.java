/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Frank
 */
public class Estudiante {
    private String nombre;
    private boolean asistio;

    public Estudiante(String nombre, boolean asistio) {
        this.nombre = nombre;
        this.asistio = asistio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean getAsistio() {
        return asistio;
    }
    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }
    
    
    
}
