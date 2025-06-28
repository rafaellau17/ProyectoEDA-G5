package tda;

public class Pila<T> {
    //atributos
    private Nodo<T> cima;
    
    //constructores
    public Pila() {
        cima = null;
    }
    
    public boolean esVacia(){
        return cima == null;
    }
    
    /*
    apilar o push. Agrega un nuevo item a la pila en la cima de la misma fila)
    */
    public void apilar(T item){
        Nodo<T> nuevo = new Nodo<>(item, null);
        if (esVacia()) {
            cima = nuevo;
        }
        else{
            Nodo<T> aux = cima;
            nuevo.setSgteNodo(aux);
            cima = nuevo;
        }
    }
    
    /*
    Desapilar. Eliminina un item de la cima de la pila. Debe redevolver el item que es eliminado.
    */
    public T desencolar(){
        if (esVacia()) { //pila sin elementos
            throw new RuntimeException("La pila esta vacia");
        }
        else{ //pila con elementos
            T item = cima.getItem();
            cima = cima.getSgteNodo();
            return item;
            
        }
    }
    
    
}
