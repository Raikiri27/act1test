
package pkg1stexam;

import java.util.Arrays;


public class Number2 {
    public class BubbleSort {
    public static void main(String[] args) {
        String[] fruits = { "banana", "apple", "lanzones", "durian", "rambotan", "kiwi", "mansanitas" };

        
        bubbleSort(fruits);

        
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].length() > arr[i].length()) {
                    
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            
            
            n--;
        } while (swapped);
    }
}
}
//    public static void main(String[] args) {
////         String[] origArray = {"banana", "apple", "lanzones", "durian", "rambotan", "kiwi", "mansanitas"};
////        
////        
////    }
////    public static void bubbleSort(int arr[]){
////        char n = (char) arr.length;
////        for (char i=0; i < n; i++){
////   
////           for(char j=0;j<n-i-1;j++){
////               if(arr[j]>arr[j+1]){
////               int m = arr [j];
////               arr[j] = arr[j = 1 ];
////               arr [j + 1 ] = m;
////           }
////           }
////        }  
////    } 
////    public static void printArray(int arr[], long[] origArray){
////        for (var num : arr){
////            System.out.println(Arrays.toString(origArray) + num);
////        }
////}
//}
