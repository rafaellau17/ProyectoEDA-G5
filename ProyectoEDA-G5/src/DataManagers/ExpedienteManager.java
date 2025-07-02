/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import DataClasses.DataTramite;
import DataClasses.DataExpediente;
import DataClasses.Documento;
import tda.*;

/**
 *
 * @author rafae
 */
public class ExpedienteManager {
    
    public static void agregarTramite(DataExpediente expediente, DataTramite tramiteNuevo) {
        Lista<DataTramite> lista = expediente.getListaTramites();
        lista.agregar(tramiteNuevo);
        expediente.aumentarContadorTramites();
    }
    
    public static DataTramite buscarTramite(DataExpediente expediente, int id) {
        Lista<DataTramite> lista = expediente.getListaTramites();
        Nodo<DataTramite> aux = lista.getCabeza();
        while (aux!=null){
            if (aux.getItem().getId() == id){
                return aux.getItem();
            }
            aux = aux.getSgteNodo();
        }
        return null;
    }   
    
    public static Lista<DataTramite> mostrarTramites(DataExpediente expediente) {
        return expediente.getListaTramites();
    }

    public static void agregarDocumento(DataExpediente expediente, Documento doc) {
        Cola<Documento> colaAux = expediente.getDocsRef();
        colaAux.encolar(doc);
    }
    
    public static Cola<Documento> mostrarDocumentos(DataExpediente expediente) {
        return expediente.getDocsRef();
    }
      
}
