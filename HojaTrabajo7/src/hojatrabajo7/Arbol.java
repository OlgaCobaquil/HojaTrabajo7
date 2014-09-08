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
public class Arbol extends Nodo {
    private Nodo raiz;
    
    public Arbol()
    {
        raiz = null;
    }
    
    public Arbol (Nodo nodo1, Nodo nodo2)
    {
        raiz = super.agregarNodo(nodo1, nodo2);
    }
    
    public void insertarNodo(int frec, char c)
    {
        raiz.frecuencia =  frec;
        raiz.caracter = c;
        raiz.izquierda = null;
        raiz.derecha = null;
    }
    
    public void insertarNodo(int frec, char c, Nodo derecha, Nodo izquierda)
    {
        raiz.frecuencia =  frec;
        raiz.caracter = c;
        this.raiz.izquierda = izquierda;
        this.raiz.derecha = izquierda;
    }
    
    public void insertarNodo(Nodo node)
    {
        this.raiz.frecuencia= node.frecuencia;
        this.raiz.caracter = node.caracter;
        this.raiz.izquierda = node.izquierda;
        this.raiz.derecha = node.derecha;
    }
    public void insertarNodo(Nodo nodo1, Nodo nodo2)
    {
        raiz = super.agregarNodo(nodo1, nodo2);   
    }
    
}
