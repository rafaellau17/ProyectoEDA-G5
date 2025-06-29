/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import DataClasses.DataTramite;
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
    
    public static void cambiarDependencia(DataTramite tramite, String dependencia) {
        Documento doc = new Documento(dependencia+".doc");
        ingresarDocumento(tramite, doc);
        tramite.setDependencia(dependencia);
    }
    
    public static Cola<Documento> mostrarDocumentos(DataTramite tramite) {
        return tramite.getDocumentos();
    }
    
}
