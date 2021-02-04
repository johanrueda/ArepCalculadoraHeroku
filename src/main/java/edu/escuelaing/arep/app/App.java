package edu.escuelaing.arep.app;
import static spark.Spark.*;


/**
 * @author Johan Rueda
 * Clase principal que hace la lectura de archivos e imprime la media aritmetica y desviacion estandar
 */
public class App
{
    /**
     * Clase que lee los valores del archivo
     * @param args argumento
     */
    public static void main( String[] args ) {
        staticFileLocation("/public");
        port(getPort());
        post("/calculadora", (request, response) -> {
            linkedList list = new linkedList();
            Double list2[] = new Double[] {};
            String req = request.body(); //String en formato json

            String[] json = req.replace("\"", "").replace("[", "").replace("]", "").split(",");

            for (int i = 0; i < json.length; i++) {
                double value = Double.parseDouble(json[i]);
                list.adiccionar(value);
            }

            calculadora cal = new calculadora(list);

            return "{\"mean\":" + cal.media() + ", \"dev\":" + cal.desviacion() + "}";

        });
    }


    /**
     * Clase que imprime los calculos realizados
     * @param data es la lista con los datos a calcular
     */
    private static void print(linkedList data) {
        calculadora resultado = new calculadora(data);
        System.out.println("Media aritmetica:" + resultado.media() + " y Desviacion estandar: " + resultado.desviacion());
    }

    /**
     * Si no hay un puerto predeterminado por el sistema, retorna el puerto 36000
     * @return puerto predeterminado o definido
     */
    private static int getPort(){
        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 36000;
    }
}
