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
    private static int contadorId = 0;
    private int id;
    private int prioridad;
    private int dni;
    private String nombres;
    private String tipo;
    private int telefono;
    private String email;
    private Cola<Documento> docsRef;
    private Lista<DataTramite> listaTramites;
    
    //constructores
    public DataExpediente(int prioridad, int dni, String nombres, String tipo, int telefono, String email) {
        this.prioridad = prioridad;
        this.dni = dni;
        this.nombres = nombres;
        this.tipo = tipo;
        this.telefono = telefono;
        this.email = email;
        docsRef = new Cola();
        listaTramites = new Lista();
        this.id = contadorId;
        contadorId++;
    }
    
    //getters y setters
    public int getId() {
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

    public String getNombres() {
        return nombres;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Cola<Documento> getDocsRef() {
        return docsRef;
    }

    public Lista<DataTramite> getListaTramites() {
        return listaTramites;
    }
    
    
}
