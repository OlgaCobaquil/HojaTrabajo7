/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de datos
 * Integrantes: 
            Olga Cobaquil; 13020
            Alvaro Sanchez 13657
            Andres Oliva
            Alejandro Arana
 * Guatemala 31 de Julio 2014
 */

package hojatrabajo3;

/**
 *
 * @author Olga Cobaquil
 */
import java.util.Random;
public class HojaTrabajo3 {
    
    public static void main(String[] args){
        //Inicia el archivo de numeros aleatorios
        Archivo archivo = new Archivo("Aleatorios");
        //Crea objeto tipo aleatorio
        Random aleatorio = new Random();
        //Crea la lista de numeros de tipo Numeros
        Comparable listaNumeros = new Numeros();       
        //Ciclo que genera numeros aleatorios y almacena en el archivo
        for(int i = 0; i < 100; i++){
            int numero = aleatorio.nextInt(100);
            archivo.escribirArchivo(numero+"");
        }        
        //Almacena los numeros del archivo en el arreglo de tipo Numeros
        ((Numeros)listaNumeros).setLista(archivo.leerArchivo());
        
        //---------------------------------------------
        //Ordenando los numeros (Puede escoger BubbleSort, MergeSort, InsertionSort o QuickSort)
        
        MergeSort.mergeSort(listaNumeros); 
        //InsertionSort.insertionSort(listaNumeros);
        //BubbleSort.bubbleSort(listaNumeros);
        //QuickSotr.quickSort(listaNumeros);
        //---------------------------------------------
        
        //Genera el archivo con los numeros ordenados
        archivo = new Archivo("Ordenados");
        //Almacena los valores de la lista en el archivo Ordenados
        for(int i = 0; i<100; i++){
            int numero = ((Numeros)listaNumeros).getLista()[i];
            archivo.escribirArchivo(numero+"");
        }
    }
}