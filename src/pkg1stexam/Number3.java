
package pkg1stexam;


public class Number3 {
    public static void main(String[] args) {
        int[] origArray = {16, 17, 18,  15, 20, 21};
        
        System.out.println("Original array");
        printArray(origArray);
        bubbleSort(origArray);
       
        System.out.println("New Set");
        printArray(origArray);
    }
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i=0; i < n; i++){
   
           for(int j=0;j<n-i-1;j++){
               if(arr[j]>arr[j+1]){
               int m = arr [j];
               arr[j] = arr[j = 1 ];
               arr [j + 1 ] = m;
           }
           }
        }  
    } 
    public static void printArray(int arr[]){
        for (int num : arr){
            System.out.println( num + " ");
        }
}
}
