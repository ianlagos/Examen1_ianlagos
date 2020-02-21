/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_ianlagos;

/**
 *
 * @author ian
 */
public class Examen {
    private String clase;
    private int conocimiento;
    private String tema;
    private double puntaje;

    public Examen() {
    }

    public Examen(String clase, int conocimiento, String tema, double puntaje) {
        this.clase = clase;
        this.conocimiento = conocimiento;
        this.tema = tema;
        this.puntaje = puntaje;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(int conocimiento) {
        this.conocimiento = conocimiento;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
    
}
