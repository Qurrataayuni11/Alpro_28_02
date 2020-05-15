package ch07;

public class Block_sort {
 public static void main(String[] args) {        
             
        int [] arr = new int [] {82,12,41,38,19,26,9,48,20,55,8,32,3};     
        int temp = 0;    
            
           
        System.out.println("Sebelum Pengurutan: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
            
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
            
        System.out.println();    
                
        System.out.println("Sesudah Pengurutan: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    