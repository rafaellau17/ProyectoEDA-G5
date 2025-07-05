/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import DataClasses.DataListaDependencias;
import DataClasses.Dependencia;
import tda.Lista;
import tda.Nodo;

/**
 *
 * @author n04101
 */
public class ListaDependenciasManager {    
    public static void agregarDependencia(Dependencia dependencia){
        DataListaDependencias.listaDependenciasGlobal.agregar(dependencia);
    }
    
    public static void inicializar(){
        if (DataListaDependencias.listaDependenciasGlobal.longitud()>0) {
            return;
        }
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Otro"));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("DUSAR"));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Facultad de Ingeniería"));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Facultad de Derecho"));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Facultad de Psicología"));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Facultad de Ciencias Empresariales y Económicas"));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Facultad de Comunicación"));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Instituto de Investigación Científica"));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Oficina de Innovación y Calidad Educativa"));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Centro de Empleabilidad"));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Centro de Idiomas"));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Departamento de Orientación Psicopedagógica"));
    }

    public static boolean duplicado(Dependencia dependencia){
        //verificar que no se repita en la lista
        Lista<Dependencia> lista = DataListaDependencias.listaDependenciasGlobal;
        Nodo<Dependencia> aux = lista.getCabeza();
        while(aux!=null){
            //si la nueva dependencia es igual a alguna dependencia
            if (dependencia.getNombre().equalsIgnoreCase(aux.getItem().getNombre())) {
                return true;
            }
            aux = aux.getSgteNodo();
        }
        return false;
    }

}
