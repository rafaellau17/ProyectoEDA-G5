/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClasses;

import tda.Cola;
import tda.Pila;

/**
 *
 * @author MARIEL
 */
public class DataTramite {
    //atributos
    private int id;
    private Fecha fechaIni;
    private Fecha fechaFin;
    private String descripcion;
    private Cola<Documento> documentos;
    private Pila<Dependencia> dependencias;
    private boolean terminado;
    
    //constructores
    public DataTramite(Fecha fechaIni, String descripcion, Dependencia depend, int id) {
        this.fechaIni = fechaIni;
        this.fechaFin = null;
        this.descripcion = descripcion;
        this.documentos = new Cola();
        this.dependencias = new Pila();
        this.dependencias.apilar(depend);
        this.terminado = false;
        this.id = id;
    }
    
    //getters y setters
    public Fecha getFechaIni() {
        return fechaIni;
    }

    public Fecha getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Fecha fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Cola<Documento> getDocumentos() {
        return documentos;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public int getId() {
        return id;
    }

    public Pila<Dependencia> getDependencias() {
        return dependencias;
    }
    
    
}
