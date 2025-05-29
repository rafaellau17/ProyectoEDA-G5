


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.tdaCircular;

/**
 *
 * @author N04102
 * @param <T>
 */
public class Nodo <T> {
    private T item;
    private Nodo sgteNodo;
    
    public Nodo() {
        item = null;
        sgteNodo = null;
    }

    public Nodo(T item) {
        this.item = item;
        this.sgteNodo = null;
        
    }
    
    public Nodo(T item, Nodo sgteNodo) {
        this.item = item;
        this.sgteNodo = sgteNodo;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Nodo getSgteNodo() {
        return sgteNodo;
    }

    public void setSgteNodo(Nodo sgteNodo) {
        this.sgteNodo = sgteNodo;
    }
    
    
}
