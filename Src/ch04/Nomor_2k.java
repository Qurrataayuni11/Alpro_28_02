package ch04;
import java.util.Scanner;
import java.util.Arrays;

public class Nomor_2k {
   public static void main (String[] args) {
	int[]nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};

	System.out.println("Menampilkan Angka-Angka Yang Setelahnya Bernilai Lebih Besar: ");

	Arrays.sort(nilai);
	for (int i = 0; i < nilai.length; i++) {
	    System.out.print(nilai[i] +" , ");
       
 	}
    }
}
