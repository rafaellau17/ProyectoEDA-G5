/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClasses;

import java.util.Scanner;

/**
 *
 * @author MARIEL
 */
public class Documento {
    //atributos
    private String item;
    
    //constructores
    public Documento(String item){
        this.item = item;
    }

    public String getItem() {
        return item;
    }
    //metodos
    @Override
    public String toString() {
        return "Nombre Documento: " + item;
    }
    
    
}
