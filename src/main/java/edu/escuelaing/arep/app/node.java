package edu.escuelaing.arep.app;

/**
 * @author Johan Rueda
 *Esta clase de nodos contiene los datos
 */

public class node {
    private node head;
    private node tail;
    private double datos;

    /**
     * constructor de la clase node
     * @param datos es el valor que va a contener el nodo
     */
    public node (double datos){
        this.head=null;
        this.tail=null;
        this.datos=datos;
    }

    /**
     * Retorna el nodo anterior
     * @return head
     */
    public node getHead() {
        return head;
    }

    /**
     * cambia el nodo anterior a un nodo dado
     * @param head nodo dado
     */
    public void setHead(node head) {
        this.head = head;
    }

    /**
     * retorna el nodo siguiente
     * @return nodo siguiente
     */
    public node getTail() {
        return tail;
    }

    /**
     * cambia la referencia del nodo siguiente a un nodo dado
     * @param tail nodo actual
     */
    public void setTail(node tail) {
        this.tail = tail;
    }

    /**
     * retorna el valor del nodo
     * @return retorna el valor del nodo
     */
    public double getDatos() {
        return datos;
    }

    /**
     * cambia el valor del nodo
     * @param datos cambia el valor que tiene el nodo
     */
    public void setDatos(double datos) {
        this.datos = datos;
    }
}
