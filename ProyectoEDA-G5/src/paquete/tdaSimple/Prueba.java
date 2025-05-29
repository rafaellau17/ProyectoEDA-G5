/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.tdaSimple;

/**
 *
 * @author N04102
 */
import java.util.Scanner;

public class Prueba {
    
    static Scanner sc = new Scanner(System.in);
 
    public static int menu() {
        System.out.println("MENU");
        System.out.println("1. Agregar");
        System.out.println("2. Mostrar");
        System.out.println("3. Contar");
        System.out.println("4. Iesimo");
        System.out.println("5. Ubicacion");
        System.out.println("6. Insertar");
        System.out.println("7. Eliminar");
        System.out.println("8. Salir");
        System.out.print("Seleccione una opcion: ");
        int opcion = sc.nextInt();
        return opcion;    
    }
    
    public static void compararListas(ListaSimpleEnlazada lista1, ListaSimpleEnlazada lista2) {
        
    }
    
    
    public static void main(String[] args) {
        ListaSimpleEnlazada lista1 = new ListaSimpleEnlazada();
        
        boolean terminado = false;
        do {
            switch(menu()) {
                case 1:
                    System.out.print("Ingrese item: ");
                    int item = sc.nextInt();
                    lista1.agregar(item);
                    break;
                case 2:
                    lista1.mostrar();
                    System.out.println();
                    break;
                case 3:
                    System.out.println(lista1.contarNodos());
                    break;
                case 4:
                    System.out.print("Ingrese pos: ");
                    int pos = sc.nextInt();
                    System.out.println("Item: "+lista1.iesimo(pos));
                    break;  
                case 5:
                    System.out.print("Ingrese item: ");
                    int item2 = sc.nextInt();
                    System.out.println("Ubicacion: "+lista1.ubicacion(item2));
                    break;           
                case 6:
                    System.out.print("Ingrese item: ");
                    int item3 = sc.nextInt();
                    System.out.print("Ingrese pos: ");
                    int pos3 = sc.nextInt();
                    lista1.insertar(item3, pos3);
                    break;                     
                case 7:
                    System.out.print("Ingrese pos: ");
                    int pos2 = sc.nextInt();
                    lista1.eliminar(pos2);
                    System.out.println("Item eliminado con exito.");
                    break;                      
                case 8:
                    terminado = true;
                    break;
            }
        }
        while (!terminado);

    }
    
}
