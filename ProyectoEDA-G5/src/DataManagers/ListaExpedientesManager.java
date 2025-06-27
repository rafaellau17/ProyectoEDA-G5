/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import DataClasses.DataExpediente;
import static DataClasses.DataListaExpedientes.listaExpedientes;
import tda.NodoDoble;

/**
 *
 * @author rafae
 */
public class ListaExpedientesManager {
    
    public void agregarExpediente(DataExpediente expediente) {
        listaExpedientes.agregar(expediente);
    }
    
    // Buscar expendiente por DNI
    
    public static DataExpediente buscarExpediente(int DNI) {
    NodoDoble<DataExpediente> aux = listaExpedientes.getCabeza();
    
    while (aux != null) {
        DataExpediente exp = aux.getItem();
        if (exp.getDni() == DNI) {
            return exp;
        }
        aux = aux.getSgteNodo();
    }

    return null;
    }
}
