/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojatrabajo3;

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