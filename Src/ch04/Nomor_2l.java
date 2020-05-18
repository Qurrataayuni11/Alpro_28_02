package ch04;
import java.util.Scanner;

public class Nomor_2l {
   public static void main (String[] args) {
	int[]nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int x = 0;
	int newarray;
  
	System.out.println("Menampilkan Jumlah Angka Dengan Angka Setelahnya Yang Hasil Penjumlahannya Genap: ");
	for (int i = 0; i<12; i++) {
     	    x = i+1;
 	    newarray = nilai[i]+nilai[x];
	    if (newarray % 2 == 0) {
   		System.out.print(newarray+",");

             }
   	}
    }
}
