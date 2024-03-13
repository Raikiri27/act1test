
package pkg1stexam;

import java.util.Arrays;


public class Number1 { 

    

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5};
        int n = arr.length;

        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
 
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
 }
 
// Sir pasara tawn mi
    

  
    
        


