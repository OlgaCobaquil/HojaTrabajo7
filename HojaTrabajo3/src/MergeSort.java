import java.util.Arrays;
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
public class MergeSort {
    static void mergeSort(Comparable x) {
        //Define un array del tamaño de la lista Comparable
        int [] A = ((Numeros)x).getLista();
        //Genera un array de valores a la derecha y otro de valores a la izquierda
        if (((Numeros)x).getSize()> 1) {
            //Tamaño de la mitad de la lista Comparable
            int q = ((Numeros)x).getSize()/2;
            //Creación del array de datos a la izquierda y conversion al tipo comparable
            int[] _leftarray = Arrays.copyOfRange(A, 0, q);
            Comparable leftArray = new Numeros(); 
            ((Numeros)leftArray).setLista(_leftarray);
            //Creación del array de datos a la derecha y conversion al tipo comparable
            int[] _rightarray = Arrays.copyOfRange(A,q,A.length);
            Comparable rightArray = new Numeros(); 
            ((Numeros)rightArray).setLista(_rightarray);
            //repite el procedimiento para las listas Derecha e Izquierda
            mergeSort(leftArray);
            mergeSort(rightArray);
            //Utiliza el metodo merge para ordenar las listas
            merge(A,_leftarray,_rightarray);
        }
    }

    static void merge(int[] a, int[] l, int[] r) {
        //El total de elementos es el tamaño de ambas listas
        int _totalElementos = l.length + r.length;        
        int i,li,ri;
        i = li = ri = 0;
        while ( i < _totalElementos) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
    }
}
