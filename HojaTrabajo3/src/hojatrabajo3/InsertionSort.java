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
//********************************************************************
//  Sorting.java       Author: Lewis/Loftus
//
//  Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************
      
    public static void insertionSort (Comparable[] list)
    {
      for (int index = 1; index < list.length; index++)
      {
         Comparable key = list[index];
         int position = index;

         //  Shift larger values to the right
         while (position > 0 && key.compareTo(list[position-1]) < 0)
         {
            list[position] = list[position-1];
            position--;
         }
            
         list[position] = key;
      }
   }
    
}
