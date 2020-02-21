/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_ianlagos;

import java.util.ArrayList;

/**
 *
 * @author ian
 */
public class Tutores extends Alumnos{
    protected ArrayList clases = new ArrayList();
    protected double ganancias;
    protected int tutorias_dadas;
    protected int nivel_enseñansa;

    public Tutores(double ganancias, int tutorias_dadas, int nivel_enseñansa, String nombre, int edad, String carrera, String lugar_Nac, String usuario, String contraseña) {
        super(nombre, edad, carrera, lugar_Nac, usuario, contraseña);
        this.ganancias = ganancias;
        this.tutorias_dadas = tutorias_dadas;
        this.nivel_enseñansa = nivel_enseñansa;
    }

    public double getGanancias() {
        return ganancias;
    }

    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }

    public int getTutorias_dadas() {
        return tutorias_dadas;
    }

    public void setTutorias_dadas(int tutorias_dadas) {
        this.tutorias_dadas = tutorias_dadas;
    }

    public int getNivel_enseñansa() {
        return nivel_enseñansa;
    }

    public void setNivel_enseñansa(int nivel_enseñansa) {
        this.nivel_enseñansa = nivel_enseñansa;
    }

    
    
    
}
