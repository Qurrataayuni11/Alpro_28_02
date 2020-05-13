package ch04;

public class Nomor_2h {
   public static void jumlah (int[] data){
	int total = 0;
	for (int i = 0; i <data.length; i++){
	   total += data[i];
	}
	System.out.println("Total=  " + total);
   }
   public static void main (String[] args) {
	int[]nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	jumlah(nilai);
	
	
   } 
    
}
