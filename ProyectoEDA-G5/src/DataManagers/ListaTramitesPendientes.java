/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import static DataClasses.DataListaTramite.listaTramites;
import DataClasses.DataTramite;
import tda.ListaCircularSimple;
import tda.Nodo;

/**
 *
 * @author Daniel
 */
public class ListaTramitesPendientes {
    private static ListaCircularSimple<DataTramite> listaPendientes = new ListaCircularSimple<>();

    // Recalcula los trámites pendientes en base a la lista completa
    public static void actualizarTramitesPendientes() {
        listaPendientes = new ListaCircularSimple<>();
        
        if (listaTramites.esVacia()) return;
        
        Nodo<DataTramite> aux = listaTramites.getCabeza();
        
        do {
            DataTramite tramite = aux.getItem();
            if (!tramite.isTerminado()) {
                listaPendientes.agregar(tramite);
            }
            aux = aux.getSgteNodo();
        } while (aux != listaTramites.getCabeza());
    }

    // Obtener lista de tramites pendientes
    public static ListaCircularSimple<DataTramite> getListaPendientes() {
        return listaPendientes;
    }

    // Cantidad de tramites pendientes
    public static int obtenerCantidadPendientes() {
        return listaPendientes.longitud();
    }

    // Verificar si hay al menos un trámite pendiente
    public static boolean hayPendientes() {
        return !listaPendientes.esVacia();
    }

    // Devolver el tramite pendiente mas antiguo (el primero de la lista)
    public static DataTramite obtenerTramiteMasAntiguo() {
        if (listaPendientes.esVacia()) return null;
        return listaPendientes.getCabeza().getItem();
    }
}
