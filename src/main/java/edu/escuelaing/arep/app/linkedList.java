package edu.escuelaing.arep.app;

/**
 * @author Johan Rueda
 * Es la clase donde se crea la lista doblemente enlazada que almacena sus nodos con los respectivos datos
 */
public class linkedList {

    private node primero,ultimo;
    private int tamano;


    /**
     * Constructor de la clase linkedList
     */
    public linkedList(){
        this.primero= this.ultimo = null;
        tamano=0;
    }

    /**
     * retorna el primer nodo
     * @return primero
     */
    public node getPrimero() {
        return primero;
    }

    /**
     * cambia el primer nodo de la lista
     * @param primero nodo a cambiar
     */

    public void setPrimero(node primero) {
        this.primero = primero;
    }

    /**
     * retorna el ultimo nodo de la lista
     * @return ultimo
     */
    public node getUltimo() {
        return ultimo;
    }

    /**
     * cambia el ultimo nodo de la lista
     * @param ultimo nodo a cambiar
     */
    public void setUltimo(node ultimo) {
        this.ultimo = ultimo;
    }

    /**
     * retorna el tamano de la lista
     * @return tamaño de la lista
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * cambia el tamano de la lista
     * @param tamano valor a cambiar
     */
    public void settamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * adiciona el nodo al final de la lista
     * @param datos es el valor que se quiere insertar
     */
    public void adiccionar(Double datos){
        node nuevoNodo = new node(datos);
        if(ultimo == null){
            primero = ultimo = nuevoNodo;
        }else{
            ultimo.setTail(nuevoNodo);
            nuevoNodo.setHead(ultimo);
            ultimo = nuevoNodo;
        }
        this.tamano += 1;
        
    }

    /**
     * retorna el nodo siguiente a un nodo
     * @param nodoActual nodo actual
     * @return nodo siguiente
     */
    public node siguiente(node nodoActual){
        return nodoActual.getTail();
    }

    /**
     * Retorna el nodo anterior a uno dado
     * @param nodoActual nodo actual
     * @return nodo anterior
     */
    public node anterior(node nodoActual){
        if(nodoActual.getHead() == null){
            System.out.println("No existe nodo");
            return null;
        }else{
            return nodoActual.getHead();
        }
    }
}
