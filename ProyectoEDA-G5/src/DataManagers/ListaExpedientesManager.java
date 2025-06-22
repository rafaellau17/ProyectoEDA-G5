/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import DataClasses.DataExpediente;
import static DataClasses.DataListaExpedientes.listaExpedientes;

/**
 *
 * @author rafae
 */
public class ListaExpedientesManager {
    
    public void agregarExpediente(DataExpediente expediente) {
        listaExpedientes.agregar(expediente);
    }
    
}
