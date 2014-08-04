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
public class QuickSort 
{
    public static void quicksort(int A[], int izquierda, int derecha) {
//codigo en base al encontrado en el libro Ja
  int pivote=A[izquierda]; // se toma el primer elemento como pivote
  int i=izquierda; // i busca de izquierda a derecha
  int j=derecha; // j busca de derecha a izquierda
  int aux;
 
  while(i<j){                        // se repetira mientras no se crucen las búsquedas
     while(A[i]<=pivote && i<j) i++; // buscar elemento mayor que el pivote
     while(A[j]>pivote) j--;         // buscar elemento menor que el pivote
     if (i<j) {                      // si no se cruzan                      
         aux= A[i];                  // hacer el intercambio
         A[i]=A[j];
         A[j]=aux;
     }
   }
  /*
  el pivote es colocado a manera de tener los menores 
  que el a su izquierda y los mayores a su derecha
  */
   A[izquierda]=A[j];               
   A[j]=pivote;                     
   if(izquierda<j-1)
      quicksort(A,izquierda,j-1); // se ordena el subarray izquierdo
   if(j+1 <derecha)
      quicksort(A,j+1,derecha); // se ordena el subarray derecho
}
    
}
