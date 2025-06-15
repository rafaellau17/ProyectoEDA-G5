/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClasses;

import tda.Cola;
import tda.Lista;

/**
 *
 * @author MARIEL
 */
public class DataExpediente {
    //atributos
    private static int id = 0;
    private int prioridad;
    private int dni;
    private String nombres;
    private String tipo;
    private int telefono;
    private String email;
    private String asunto;
    private Cola<Documento> docsRef;
    private Lista<DataTramite> listaTramites;
    
    //constructores
    public DataExpediente(int prioridad, int dni, String nombres, String tipo, int telefono, String email, String asunto) {
        id++;
        this.prioridad = prioridad;
        this.dni = dni;
        this.nombres = nombres;
        this.tipo = tipo;
        this.telefono = telefono;
        this.email = email;
        this.asunto = asunto;
        docsRef = new Cola();
        listaTramites = new Lista();
    }
    
    //getters y setters
    public static int getId() {
        return id;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Cola<Documento> getDocsRef() {
        return docsRef;
    }

    public void setDocsRef(Cola<Documento> docsRef) {
        this.docsRef = docsRef;
    }

    public Lista<DataTramite> getListaTramites() {
        return listaTramites;
    }

    public void setListaTramites(Lista<DataTramite> listaTramites) {
        this.listaTramites = listaTramites;
    }
    
}
