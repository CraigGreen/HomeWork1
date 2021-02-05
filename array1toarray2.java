/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication119;

/**
 *
 * @author green
 */
public class array1toarray2 {

  public static void main(String[] args) {


        printArraYS();

        }

    private static void printArraYS() {
          String[] array1 = {"word1", "word2", "word3", "word4"};
        String[] array2 = array1;
         
        for (int index = 0; index < array1.length; index++) {
            System.out.println("_" + array1[index]);
            System.out.println(array2[index]);
    }
        
    }
    
 
}