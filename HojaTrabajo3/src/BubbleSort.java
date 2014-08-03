/*Algoritmos y Estructura de Datos
  Integrantes: Olga Cobaquil  13020
               Álvaro Sánchez 13657
               Andrés Oliva
               
  Fecha: 31/07/14
  Descripción: */

/**
 *
 * @author Sanchez Tortola
 */
public class BubbleSort {
    public static void bubbleSort(Comparable o) {
        //Tamaño de la lista de numeros
        int tamanio = ((Numeros)o).getSize();
        //Ciclo que se repite de acuerdo al tamaño de la lista
        for (int i=1; i < tamanio; i++) {
        //Ciclo que intercambia los numeros de la lista por los numeros ordenados
        for (int j=0; j < tamanio-i; j++) {
            //Verifica si el numero de la lista es mayor al número siguiente
            if (((Numeros)o).getLista()[j] > ((Numeros)o).getLista()[j+1]) {
                //Intercambia elementos si el valor siguiente era mayor
                int x = ((Numeros)o).getLista()[j];
                ((Numeros)o).getLista()[j] = ((Numeros)o).getLista()[j+1];
                ((Numeros)o).getLista()[j+1] = x;
                }  
            }  
        }
    }
}
