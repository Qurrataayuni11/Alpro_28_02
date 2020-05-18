package ch04;
import java.util.Scanner;

public class Nomor_2i {
  public static void main (String[] args) {
	int[]nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int x = 0;
	
	System.out.println("Menampilkan Selisih Angka-Angka Dengan Angka Setelahnya: ");
	for (int i = 0; i < 12; i++) {
	    x = i+1;
	    System.out.print("(");
	    System.out.print(nilai[i]-nilai[x] +"),");
	}
   }
}