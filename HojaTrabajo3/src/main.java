import java.util.Random;
/*Algoritmos y Estructura de Datos
  Integrantes: Olga Cobaquil  13020
               Álvaro Sánchez 13657
               Andrés Oliva
               
  Fecha: 31/07/14
  Descripción: Programa Principal de la Hoja de Trabajo 3*/

/**
 *
 * @author Sanchez Tortola
 */
public class main {
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
        //Ordenando los numeros (Puede escoger BubbleSort, MergeSort o InsertionSort)
        MergeSort.mergeSort(listaNumeros); 
        //InsertionSort.insertionSort(listaNumeros);
        //BubbleSort.bubbleSort(listaNumeros);
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
