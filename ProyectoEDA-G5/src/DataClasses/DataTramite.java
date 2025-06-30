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
    private static int contadorId = 1;
    private int id;
    private Fecha fechaIni;
    private Fecha fechaFin;
    private String descripcion;
    private Cola<Documento> documentos;
    private Pila<String> dependencia;
    private boolean terminado;
    
    //constructores
    public DataTramite(Fecha fechaIni, String descripcion, Pila<String> dependencia) {
        this.fechaIni = fechaIni;
        this.fechaFin = null;
        this.descripcion = descripcion;
        this.documentos = new Cola();
        this.dependencia = dependencia;
        this.terminado = false;
        this.id = contadorId;
        contadorId++;
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

    public Pila<String> getDependencia() {
        return dependencia;
    }

    public void setDependencia(Pila<String> dependencia) {
        this.dependencia = dependencia;
    }
    
    
}
