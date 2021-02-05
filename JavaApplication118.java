/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication118;

/**
 *
 * @author green
 */
public class JavaApplication118 {

   
    public static void main(String[] args) {
      
        int[] array = {1,2,3,4,5,6};

        System.out.println("Original Array");
        itemPrint(array);

        itemRemove(array, 2);

        array = itemsLeft(array,2);
        System.out.println("Original Array After Removing Items");
        itemPrint(array); 
    }
      private static void itemRemove(int[] inputArray, int n) {
        int newArr [] = new int[n];
        System.arraycopy(inputArray, 0, newArr, 0, n);
        System.out.println("New Array");
        itemPrint(newArr);
    }

    private static void itemPrint(int[] array) {
        for(Integer  i : array) System.out.println(i);
    }

    private static int[] itemsLeft(int[] inputArr, int d) {
        int [] itemsLeftArr =  new int[inputArr.length-d];
        for(int i=d, j=0; i<inputArr.length; i++, j++) {
            itemsLeftArr[j] = inputArr[i];
        }
        return itemsLeftArr;
    }
    
    
    
}
