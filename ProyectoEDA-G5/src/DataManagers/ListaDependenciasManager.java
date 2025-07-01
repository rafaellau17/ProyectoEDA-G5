/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import DataClasses.Dependencia;
import tda.Lista;
import tda.Nodo;

/**
 *
 * @author n04101
 */
public class ListaDependenciasManager {
    private static Lista<Dependencia> listaDependenciasGlobal = new Lista<>();
    
    public static void iniciarDependencias(){
        listaDependenciasGlobal.agregar(new Dependencia("Otro"));
        listaDependenciasGlobal.agregar(new Dependencia("DUSAR"));
        listaDependenciasGlobal.agregar(new Dependencia("Facultad de Ingeniería"));
        listaDependenciasGlobal.agregar(new Dependencia("Facultad de Derecho"));
        listaDependenciasGlobal.agregar(new Dependencia("Facultad de Psicología"));
        listaDependenciasGlobal.agregar(new Dependencia("Facultad de Ciencias Empresariales y Económicas"));
        listaDependenciasGlobal.agregar(new Dependencia("Facultad de Comunicación"));
        listaDependenciasGlobal.agregar(new Dependencia("Instituto de Investigación Científica"));
        listaDependenciasGlobal.agregar(new Dependencia("Oficina de Innovación y Calidad Educativa"));
        listaDependenciasGlobal.agregar(new Dependencia("Centro de Empleabilidad"));
        listaDependenciasGlobal.agregar(new Dependencia("Centro de Idiomas"));
        listaDependenciasGlobal.agregar(new Dependencia("Departamento de Orientación Psicopedagógica"));
    }
    
    public static boolean agregarDependencia(Dependencia dependencia){
        //verificar que no se repita en la lista
        Nodo<Dependencia> aux = listaDependenciasGlobal.getCabeza();
        while(aux!=null){
            //si la nueva dependencia es igual a alguna dependencia
            if (dependencia.getNombre().equalsIgnoreCase(aux.getItem().getNombre())) {
                return false;
            }
        }
        
        listaDependenciasGlobal.agregar(dependencia);
        return true;
    }

    public static Lista<Dependencia> getListaDependenciasGlobal() {
        return listaDependenciasGlobal;
    }    
}
