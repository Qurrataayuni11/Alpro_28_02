package ch04;
import java.util.Scanner;

public class Nomor_2n {
   public static void main(String[] args) {
	int[]nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int sum = 0;
	int n = nilai.length-2;
	int j = 0;
	
	System.out.println("Menampilkan Jumlah Angka-Angka Didalam Array Dengan Seluruh Angka-Angka Sebelumnya ");
	   for (int num : nilai) {
	      sum = sum + num;
	}
	    System.out.print("Adalah: ");
	for (int i = 0; i < nilai.length; i++) {
	    if (i > n) {
		System.out.print(nilai[i]+" ");
	    }else{
		System.out.print(nilai[i]+",");
	    }
 	}
	System.out.print("\n\n Jumlahnya: "+sum);

	}
}