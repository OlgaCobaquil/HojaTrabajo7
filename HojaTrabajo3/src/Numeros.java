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
public class Numeros implements Comparable{
    //Declaración de la lista
    private int[] _lista;
    //Constructor de la clase que inicializa la lista
    public Numeros(){
        _lista = new int[100];
    }
    //Almacenar numero en la lista
    public void guardarNumero(int numero, int i){
        _lista[i] = numero;
    }
    //-----Setters-------
    public void setLista(int[] lista){
        this._lista = lista;
    }
    //-----Getters-------
    public int getSize(){
        return _lista.length;
    }
    public int[] getLista(){
        return _lista;
    }
    //    
    @Override
    public int compareTo(Object o) { 
        int _bandera = 0;
        int _resultado = 0;
        //Ciclo de comparación entre los valores de la lista
        for(int i = 0; i<_lista.length; i++){
            if(_lista[i]==((Numeros)o).getLista()[i]){
                _bandera++;
            }
        }
        if(_bandera==2000){
            _resultado = 1;
        }
        return _resultado;
    }
}
