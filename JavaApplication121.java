
package javaapplication121;

/**
 *
 * @author green
 */
public class JavaApplication121 {

    
    public static void main(String[] args) {
          int[] array = {45,21,22,31,44,65,12,56,78,19,100};
           int even = 0; 
  
        // Loop to find even, 
        for (int i = 0; i < array.length; i++) { 
            if (i % 2 == 0) 
                even += array[i]; 
           
        } 
  
        System.out.println("Even sum: " + even); 
        
    } 
          
          
    }
    
    
