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
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Otro", null));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("DUSAR", null));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Facultad de Ingeniería", null));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Facultad de Derecho", null));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Facultad de Psicología", null));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Facultad de Ciencias Empresariales y Económicas", null));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Facultad de Comunicación", null));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Instituto de Investigación Científica", null));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Oficina de Innovación y Calidad Educativa", null));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Centro de Empleabilidad", null));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Centro de Idiomas", null));
        DataListaDependencias.listaDependenciasGlobal.agregar(new Dependencia("Departamento de Orientación Psicopedagógica", null));
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
