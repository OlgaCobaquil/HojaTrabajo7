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
import java.util.*;
public class Huffman {
	private static char charArray[];                //el string convertido a caracteres
	private static int tabla[] = new int[0x7f];     //guarda la frecuencia de cada uno 
        private static Nodo miNodo[];                   //El Priority Queue, se guarda el arbol generado en el lugar 0
	private static int largoDeTabla = 0;            //el largo de la cantidad guardada de los caracteres
        private static Arbol miArbol;                   // Arbol
        private static int largoDeNodo = 0;             //si crece o decrece se hace en este int
        public static HuffmanConvert hC; //The Class Responsible for Decoding the Huffman Tree
        
        
        public Huffman(String valor)
        {
            frequencyTable(valor);
            nodeArrange();
            Nodo x = createTree();
            hC = new HuffmanConvert(x,charArray);
        }
        public static void frequencyTable(String value)
	{
		int i;
                charArray = value.toCharArray();
		for(i = 0; i < charArray.length; i++)
			tabla[getAscii(charArray[i])] += 1; 
	}
	
	public static int getAscii(char substringValue)
	{
		return substringValue&0x7f;
	}
	
        public static void nodeArrange()    
        {
            int counter = 0;
            int j = 0;
            for(int i = 0; i < tabla.length; i++)
            {
                if(tabla[i]>0)
                    counter++;
            }
            
            largoDeTabla =  counter;
            counter = 0;    
            miNodo = new Nodo[largoDeTabla];
            
            for(int i = 0; i < 127; i++)
            {
                if(tabla[i] != 0)
                {
                    miNodo[counter]= new Nodo(tabla[i], (char)i, null, null);
                    counter++;
                }
            }
            largoDeNodo = miNodo.length;
            sort();
            
        }
        
        public static Nodo createTree()
        {
           for(int i = 1; i < largoDeNodo; i++)
           {
               try
               {
                   if(miNodo[1].frecuencia >= miNodo[0].frecuencia)
                   {
                       miArbol = new Arbol(miNodo[0],miNodo[i]);
                       miNodo[0] = miArbol;
                       moveItems(i, largoDeNodo);
                       largoDeNodo -= 1; 
                       i -= 1;
                       sort();
                   }
                   else
                   {
                       if(i+1 < largoDeNodo)
                       {
                            miArbol = new Arbol(miNodo[i], miNodo[i+1]);
                            miNodo[1] = miArbol;
                            moveItems(i+1, largoDeNodo);
                            sort();
                            largoDeNodo -= 1;
                            i -= 1;
                       }
                       else
                       {
                           miNodo[1] = miNodo[i];
                           miNodo[0] = new Arbol(miNodo[0], miNodo[1]);
                       }
                   }
               }
               catch(Exception e)
               {
                 //I dare this program to crash...hahaha
               }
           }
            return miNodo[0];
        }
        
        private static void moveItems(int index, int length)
        {   try
            {
                for(int i = index; i < length; i++)
                    miNodo[i] = miNodo[i+1];
                
            }
            catch(Exception e)
            {
                //See...this program is uncrashable...lol
            }
        }
        private static void sort()
        {
            Nodo temp;
            for(int i = largoDeNodo-1; i > 1; i--)
            {
                for(int j = 0; j < i; j++)
                {
                    if(miNodo[j].frecuencia > miNodo[j+1].frecuencia)
                    {
                        temp = miNodo[j+1];
                        miNodo[j+1] = miNodo[j];
                        miNodo[j] = temp;
                    }
                    
                    if(miNodo[j].frecuencia == miNodo[j+1].frecuencia && miNodo[j].izquierda != null)
                    {
                        temp = miNodo[j+1];
                        miNodo[j+1] = miNodo[j];
                        miNodo[j] = temp;
                    }
                }
            }
        }
    
}
