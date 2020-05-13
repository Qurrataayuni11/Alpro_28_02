package ch04;

public class Nomor_2e {
   public static void main (String[] args){
	int[]nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	
	System.out.println("Menampilkan Angka yang Memiliki 2 Angka: ");
	for (int i = 0; i < nilai.length; i++) {
	    if (nilai[i] >= 10) {
	    System.out.println(nilai[i] +" ");

	   }
        }
   } 
    
}