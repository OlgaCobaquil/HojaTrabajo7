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
import java.io.*;

public class Archivo {
    /*atributos*/
    private File archivo;
    private FileWriter fWriter;
    private PrintWriter printW;
    private BufferedReader bReader;
    private FileReader fReader;
    
     /*Constructor*/
    
    public Archivo(String nombre){
        archivo = new File(nombre+".txt");
        if(!archivo.exists()){
            System.out.print("El archivo no existe");
        }
        else{
            try{
                fReader = new FileReader(archivo);
                bReader = new BufferedReader(fReader);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
    
    //Metodo para escribir un archivo nuevo
    public void escribirArchivo(String linea){
        try{
            fWriter = new FileWriter(archivo, true);
            printW = new PrintWriter(fWriter);
            
            printW.println(linea);
            
            fWriter.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
     //Metodo para la lectura de un archivo
    public int[] leerArchivo(){
        int[] cont = new int[100];
        try{
            String linea;
            int i = 0;
            while((linea=bReader.readLine())!=null){
                cont[i] = Integer.parseInt(linea);
                i++;
            }
            fReader.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return cont;
    }
}
