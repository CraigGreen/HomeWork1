/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication122;

import java.util.Arrays;

/**
 *
 * @author green
 */
public class JavaApplication122 {
  
 
    static int highestElement(int []arr,    
                       int n) 
    { 
        Arrays.sort(arr); 
        return arr[n - 1]; 
    } 
  
     
    static public void main (String[] args) 
    { 
        int []arr = {9, 8994, 46665,  
                     9660, 999999999}; 
        int n = arr.length; 
        System.out.println(highestElement(arr, n)); 
    } 
} 
  
    

