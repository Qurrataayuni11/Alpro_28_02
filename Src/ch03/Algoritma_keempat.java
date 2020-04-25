package ch03;
import java.util.Scanner;

public class Algoritma_keempat {
    public static void main (String[] args) {
	int cek = 0;

	Scanner x = new Scanner(System.in);
	System.out.print("Masukkan Nilai x = ");
	int bil = x.nextInt();

	for (int i = 2; i <= bil; i++) {
	    if (bil%i==0) {
		cek++;
	    }
	}
	if (cek==1) {
	   System.out.println(bil+" Prima");
	}else{
	   System.out.println(bil+" Bukan Prima");
	}
    }
 }	
	
         