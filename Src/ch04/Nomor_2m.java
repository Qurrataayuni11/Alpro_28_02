package ch04;
import java.util.Scanner;

public class Nomor_2m {
   public static void main (String[] args) {
	int[]nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int x = 0;
	int jumlah, jumlah1 = 0;

	System.out.println("Menghitung Jumlah Angka-Angka Selisih Yang ditampilkan Pada Poin (i) ");
	for (int i = 0; i < 12; i++) {
	   x = i+1;
    	   jumlah = nilai[i] - nilai[x];
	   jumlah1 = jumlah1 + jumlah;
	}
	System.out.print("jumlah selisihnya adalah: "+ jumlah1);
	
	
   }
} 
