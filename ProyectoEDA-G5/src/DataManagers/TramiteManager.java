/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import DataClasses.DataTramite;
import DataClasses.Dependencia;
import DataClasses.Documento;
import DataClasses.Fecha;
import java.util.Calendar;
import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.GregorianCalendar;
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
    
    public static void ingresarDependencia(DataTramite tramite, String dependencia) {
        Documento doc = new Documento(dependencia+".doc");
        ingresarDocumento(tramite, doc);
        
        Pila<Dependencia> pila_aux = tramite.getDependencias();
        Calendar calendar = new GregorianCalendar();
        int cal1 = calendar.get(YEAR);
        int cal2 = calendar.get(MONTH)+1;
        int cal3 = calendar.get(DATE);     
        Fecha FechaIniAux = new Fecha(cal3, cal2, cal1);        
        Dependencia dependAux = new Dependencia(dependencia, FechaIniAux);
        pila_aux.apilar(dependAux);
    }
    
    
    public static void actualizarFechaFinUltimaDependencia(DataTramite tramite) {
        Pila<Dependencia> pila_aux = tramite.getDependencias();
        Calendar calendar = new GregorianCalendar();
        int cal1 = calendar.get(YEAR);
        int cal2 = calendar.get(MONTH)+1;
        int cal3 = calendar.get(DATE);     
        Fecha FechaFinAux = new Fecha(cal3, cal2, cal1);
        
        Dependencia ultimaDepend = pila_aux.desapilar();
        if (ultimaDepend != null) {
            ultimaDepend.setFechaFin(FechaFinAux);
            pila_aux.apilar(ultimaDepend);   
        }
     
    }
    
    
    public static Cola<Documento> mostrarDocumentos(DataTramite tramite) {
        return tramite.getDocumentos();
    }
    
    public static Pila<Dependencia> mostrarDependencias(DataTramite tramite){
        return tramite.getDependencias();
    }
}
