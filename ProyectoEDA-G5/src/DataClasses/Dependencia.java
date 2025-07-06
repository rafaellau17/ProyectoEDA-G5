/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClasses;

/**
 *
 * @author n04101
 */
public class Dependencia {
    //atributos
    private String nombre;
    private Fecha fechaIni;
    private Fecha fechaFin;
    
    //constructor
    public Dependencia(String nombre, Fecha fechaIni) {
        this.nombre = nombre;
        this.fechaIni = fechaIni;
        this.fechaFin = null;
    }
    
    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaIni() {
        return fechaIni;
    }

    public Fecha getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Fecha fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
}
