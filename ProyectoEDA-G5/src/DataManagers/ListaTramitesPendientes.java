/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import DataClasses.DataExpediente;
import static DataClasses.DataListaExpedientes.listaExpedientes;
import DataClasses.DataTramite;
import tda.Lista;
import tda.ListaCircularSimple;
import tda.Nodo;
import tda.NodoDoble;

/**
 *
 * @author Daniel
 */
public class ListaTramitesPendientes {
    private static ListaCircularSimple<DataTramite> listaPendientes = new ListaCircularSimple<>();

    // Recalcula los tramites pendientes recorriendo la lista de expedientes
    public static void actualizarTramitesPendientes() {
        // Vaciar la lista
        listaPendientes = new ListaCircularSimple<>();
        
        // Recorrer la lista doble de expedientes
        NodoDoble<DataExpediente> nodoExpediente = listaExpedientes.getCabeza();
        while (nodoExpediente != null) {
            DataExpediente expediente = nodoExpediente.getItem();
            Lista<DataTramite> listaTramites = expediente.getListaTramites();
            
            // Revisar que el expediente tenga tramites
            if (!listaTramites.esVacia()) {
                Nodo<DataTramite> nodoTramite = listaTramites.getCabeza();
                
                // Recorrer la lista simple de tramites
                do {
                    DataTramite tramite = nodoTramite.getItem();
                    
                    // Anadir a la lista los tramites pendientes
                    if (!tramite.isTerminado()) {
                        listaPendientes.agregar(tramite);
                    }
                    nodoTramite = nodoTramite.getSgteNodo();
                } while (nodoTramite != listaTramites.getCabeza());
            }

            nodoExpediente = nodoExpediente.getSgteNodo();
        }
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
