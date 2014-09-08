/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojatrabajo7;

/**
 *
 * @author Olga Cobaquil
 */
public class HuffmanConvert {
    private int i=0;
    private Nodo nodoRaiz;
    private char c;
    private char charArray[];
    public String patronFinal = "";
    public HuffmanConvert(Nodo miNodo, char [] charArray)
    {
        String temp;
        int i;
        nodoRaiz = miNodo;
        this.charArray = charArray;
        for(i = 0; i < charArray.length; i++)
        {
            temp = buscar(nodoRaiz, "", charArray[i]);
            patronFinal += temp+" ";
            System.out.println("Codigo para caracter: "+charArray[i]+" "+temp);
        }
    }
    
    public String buscar(Nodo nodoRaiz, String valor,char myChar)
    {
        String valorL ="";
        if(nodoRaiz != null)
        {
            if(nodoRaiz.izquierda != null)
                valorL = buscar(nodoRaiz.izquierda, valor+"0", myChar);
            if(nodoRaiz.caracter == myChar)
                return valor;

            else
            {
                if(valorL == "")
                {
                    return buscar(nodoRaiz.derecha, valor+"1",myChar);
                }
                else
                {
                    return valorL;
                }
            }
        }
        else
        {
            return "";
        }
    }
    
}
