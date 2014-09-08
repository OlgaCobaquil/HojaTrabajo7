/*
 * Universidad del Valle de Guatemala
 * Integrantes: Olga Cobaquil; Andres Oliva; Alvaro Sanchez
 * Guatemala, Septiembre 2014
 */
package hojatrabajo7;

/**
 *
 * @author Olga Cobaquil
 */
public class Nodo {
    public int frecuencia;      // int para la frecuencia
    public char caracter;       // char para el caracter
    public Nodo izquierda;      // para izquierda (nodo)
    public Nodo derecha;        // para derecha (nodo)
    
    //Constructor de la clase
    public Nodo(int frecuencia, char caracter, Nodo izquierda, Nodo derecha)
    {
        this.frecuencia = frecuencia;
        this.caracter = caracter;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }
    
    public Nodo()
    {
        //constructor vacio
    }
    
    public Nodo agregarNodo(Nodo nodo1, Nodo nodo2)
    {
        if(nodo1.frecuencia < nodo2.frecuencia)
        {
            izquierda = nodo1;
            derecha = nodo2;
        }
        else
        {
            derecha = nodo1;
            izquierda = nodo2;
        }
        frecuencia = nodo1.frecuencia + nodo2.frecuencia;
        
        return this;
    }
}
