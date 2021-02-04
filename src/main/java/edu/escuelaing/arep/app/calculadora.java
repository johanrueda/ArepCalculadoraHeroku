package edu.escuelaing.arep.app;

/**
 * @author Johan Rueda
 * Esta clase calcula la media aritmetica y desviacion estandar a partir de una linkedList
 */


public class calculadora {
    private linkedList list;

    /**
     * Consturctor de la calculadora
     * @param list es la linkedList que contiene los valores a calcular
     */
    public calculadora(linkedList list){
        this.list=list;
    }

    /**
     * Calcula la media aritmetica a partir de la lista
     * @return el valor de la media aritmetica
     */
    public double media(){
        double suma = 0;
        double media = 0;
        node node = list.getPrimero();
        while (node != null) {
            suma += node.getDatos();
            node = list.siguiente(node);
        }
        media = suma / list.getTamano();
        double calculo = Math.round(media * 100.0) / 100.0;
        return calculo ;
    }

    /**
     * Calcula la desviacion estandar a partir de la lista
     * @return el valor de la desviacion estandar
     */
    public double desviacion(){
        double desviacion = 0;
        double suma = 0;
        double media = this.media();
        node nodo = list.getPrimero();
        while (nodo != null) {
            suma = suma + (Math.pow((nodo.getDatos() + (-media)), 2));
            nodo = list.siguiente(nodo);
        }

        desviacion = Math.sqrt(suma / (list.getTamano() - 1));
        double resultado = Math.round(desviacion * 100.0) / 100.0;
        return resultado;
    }

}
