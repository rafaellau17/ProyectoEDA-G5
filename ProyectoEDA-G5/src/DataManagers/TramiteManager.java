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
public class TramiteManager {
    
    public static void ingresarDocumento(DataTramite tramite, Documento doc ){
        Cola<Documento> colaAux = tramite.getDocumentos();
        colaAux.encolar(doc);
    }
    
    public static void cambiarEstado(DataTramite tramite, String estado) {
        tramite.setEstado(estado);
    }
    
    public static Cola<Documento> mostrarDocumentos(DataTramite tramite) {
        return tramite.getDocumentos();
    }
    
}
