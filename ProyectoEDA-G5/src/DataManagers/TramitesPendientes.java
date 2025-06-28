/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import DataClasses.DataTramite;
import tda.ListaCircularSimple;
import tda.Nodo;

/**
 *
 * @author Daniel
 */
public class TramitesPendientes {
    private static ListaCircularSimple<DataTramite> listaPendientes = new ListaCircularSimple<>();
    
    public static void agregarTramitePendiente(DataTramite tramite) {
        listaPendientes.agregar(tramite);
    }
    
    public static void mostrarTramitePendiente() {
    if (listaPendientes.esVacia()) {
        System.out.println("No hay tramites pendientes.");
        return;
    }

    boolean hayPendientes = false;
    Nodo<DataTramite> aux = listaPendientes.getCabeza();

    System.out.println("Trámites pendientes:");
    do {
        DataTramite tramite = aux.getItem();
        if (!tramite.isTerminado()) {
            System.out.println(tramite);
            hayPendientes = true;
        }
        aux = aux.getSgteNodo();
    } while (aux != listaPendientes.getCabeza());

    if (!hayPendientes) {
        System.out.println(" Todos los tramites estan completados.");
    }
    }
}
