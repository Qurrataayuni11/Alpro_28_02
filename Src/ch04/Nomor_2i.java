package ch04;

public class Nomor_2i {
  public static void main (String[] args) {
	int[]nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	
	System.out.println("Menampilkan Selisih Angka dengan Angka Setelahnya: ");
	for (int i = 0; i<nilai.length; i++){
	    if (nilai[i]-1 <= 13) {
	    System.out.print(nilai[i] +" ");


	   }
        }
   } 
    
}
