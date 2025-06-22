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
    private Fecha fechaIni;
    private Fecha fechaFin;
    private String descripcion;
    private Cola<Documento> documentos;
    private String estado;
    private boolean terminado;
    
    //constructores
    public DataTramite(Fecha fechaIni, String descripcion, String estado) {
        this.fechaIni = fechaIni;
        this.fechaFin = new Fecha();
        this.descripcion = descripcion;
        this.documentos = new Cola();
        this.estado = estado;
        this.terminado = false;
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
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }
    
    
    
}
