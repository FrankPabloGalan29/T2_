/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Frank
 */

public class Aula {
    private List<Estudiante> estudiantesTrigon;
    private List<Estudiante> estudiantesGeom;
    private List<Estudiante> estudiantesAlge;

    public Aula() {
        estudiantesTrigon = new ArrayList<>();
        estudiantesGeom = new ArrayList<>();
        estudiantesAlge = new ArrayList<>();
    }

    public List<Estudiante> getEstudiantesTrig() {
        return estudiantesTrigon;
    }

    public void setEstudiantesTrig(List<Estudiante> estudiantesTrig) {
        this.estudiantesTrigon = estudiantesTrig;
    }

    public List<Estudiante> getEstudiantesGeom() {
        return estudiantesGeom;
    }

    public void setEstudiantesGeom(List<Estudiante> estudiantesGeom) {
        this.estudiantesGeom = estudiantesGeom;
    }

    public List<Estudiante> getEstudiantesAlgebra() {
        return estudiantesAlge;
    }

    public void setEstudiantesAlgebra(List<Estudiante> estudiantesAlgebra) {
        this.estudiantesAlge = estudiantesAlgebra;
    }
}
