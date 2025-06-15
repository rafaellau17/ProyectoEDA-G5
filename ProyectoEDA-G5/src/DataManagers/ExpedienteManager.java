/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import DataClasses.DataTramite;
import DataClasses.DataExpediente;
import tda.*;

/**
 *
 * @author rafae
 */
public class ExpedienteManager {
    
    public static void agregarTramite(DataExpediente expediente, DataTramite tramite) {
        Lista<DataTramite> listaAux = expediente.getListaTramites();
        listaAux.agregar(tramite);
    }
    
    public static void terminarTramite(DataExpediente expediente) {
    Nodo<DataTramite> nodoUltimo = expediente.getListaTramites().getUltimo();
    if (nodoUltimo != null) {
        nodoUltimo.getItem().setTerminado(true);
        }
    else {
        System.out.println("No hay tramites. ");
        }
    }


}
