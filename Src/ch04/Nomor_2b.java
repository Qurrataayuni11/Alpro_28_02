package ch04;
import java.util.Scanner;

public class Nomor_2b {
    public static void main (String[] args) {
	int[]nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	Scanner a = new Scanner(System.in);
	System.out.println("Masukkan nilai yang ingin dicari: ");
	int nilaiX = a.nextInt();
	boolean benar = false;

	for (int baris = 0; baris<nilai.length; baris++){
	       if (nilai[baris] == nilaiX){
		System.out.println("Angka: "+ nilaiX + "\nberada pada baris: "+ baris);
		benar = true;

		}
		
	  }
     }
}