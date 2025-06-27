/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClasses;

import tda.Cola;

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
    private String dependencia;
    private boolean terminado;
    
    //constructores
    public DataTramite(Fecha fechaIni, String descripcion, String dependencia) {
        this.fechaIni = fechaIni;
        this.fechaFin = null;
        this.descripcion = descripcion;
        this.documentos = new Cola();
        this.dependencia = dependencia;
        this.terminado = false;
        id = contadorId;
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

    public String getEstado() {
        return dependencia;
    }

    public void setEstado(String estado) {
        this.dependencia = estado;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }
    
    
    
}
