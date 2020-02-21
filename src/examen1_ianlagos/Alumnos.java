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
public class Alumnos {
    protected String nombre;
    protected int edad;
    protected String carrera;
    protected String lugar_Nac;
    protected String usuario;
    protected String contraseña;
    /*protected int conocimiento_acum;
    protected int nivel_aprendisaje;
    protected ArrayList clases = new ArrayList();
    */
    public Alumnos() {
    }

    public Alumnos(String nombre, int edad, String carrera, String lugar_Nac, String usuario, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.lugar_Nac = lugar_Nac;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getLugar_Nac() {
        return lugar_Nac;
    }

    public void setLugar_Nac(String lugar_Nac) {
        this.lugar_Nac = lugar_Nac;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
