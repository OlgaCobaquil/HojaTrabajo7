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
