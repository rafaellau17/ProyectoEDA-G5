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
    
    public void registrarTramite(DataExpediente expediente, DataTramite tramiteNuevo) {
        Lista<DataTramite> lista = expediente.getListaTramites();
        if (lista.getUltimo().getItem().isTerminado()) {
            lista.agregar(tramiteNuevo);
        }
        else {
            System.out.println("El último trámite no ha sido finalizado.");
        }
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
    
    public static Lista<DataTramite> mostrarTramites(DataExpediente expediente) {
        return expediente.getListaTramites();
    }


}
