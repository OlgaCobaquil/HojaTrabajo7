/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojatrabajo3;

/**
 *
 * @author Olga Cobaquil
 */
public class InsertionSort {
    public static void insertionSort (Comparable x){
      //Ciclo de ordenamiento de los valores de la lista
      for (int i = 1; i < ((Numeros)x).getSize()-1; i++){
         Comparable _valor = ((Numeros)x).getLista()[i];
         int _posicion = i;
         //  Condición de almacenamiento del valor mayor a la derecha de la lista
         while (_posicion > 0 && _valor.compareTo(((Numeros)x).getLista()[_posicion-1]) < 0){
            ((Numeros)x).getLista()[_posicion] = ((Numeros)x).getLista()[_posicion-1];
            _posicion--;
            }           
         ((Numeros)x).getLista()[_posicion] = (int) _valor;
      }
   }
}
