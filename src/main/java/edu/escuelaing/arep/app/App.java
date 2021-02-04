package edu.escuelaing.arep.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

        try{
            String file;
            BufferedReader scanner = new BufferedReader(new FileReader("datos.txt"));
            linkedList data;
            double number;
            while ((file = scanner.readLine()) != null){
                String[] list = file.split(" ");
                data = new linkedList();
                for(String date: list){
                    number = Double.parseDouble(date);
                    data.adiccionar(number);
                }
                print(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Clase que imprime los calculos realizados
     * @param data es la lista con los datos a calcular
     */
    private static void print(linkedList data) {
        calculadora resultado = new calculadora(data);
        System.out.println("Media aritmetica:" + resultado.media() + " y Desviacion estandar: " + resultado.desviacion());
    }
}
