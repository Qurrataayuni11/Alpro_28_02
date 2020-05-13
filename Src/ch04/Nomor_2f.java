package ch04;

public class Nomor_2f {
   public static void main (String[] args) {
	int[] nilai =  {82,12,41,38,19,26,9,48,20,55,8,32,3};

	System.out.println("Menampilkan Angka-Angka Ganjil yang Diapit Angka Genap: ");
	for (int i = 0; i<nilai.length; i++){
	   if (nilai[i]%2 >= 1){
		System.out.println(nilai[i]);

	  }
      }
   }    
}