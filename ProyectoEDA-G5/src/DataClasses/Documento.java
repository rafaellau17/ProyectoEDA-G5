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
    
    //metodos
    @Override
    public String toString() {
        return "Documento item: " + item;
    }
    
    //leer del teclado
    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el item del Documento: ");
        item = sc.next();   
    }
}
