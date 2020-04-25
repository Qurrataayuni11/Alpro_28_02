package ch03;
import java.util.Scanner;

public class Algoritma_ketiga {
    public static void main(String[] args) {
	int a=3;
 	int terkecil;

	System.out.println("Program menentukan Pembagi terkecil selain 1 dan2 ");
	System.out.println();

	Scanner z = new Scanner (System.in);
        System.out.print ("Masukkan bilangan yang ingin diketahui pembagi terkecilnya: ");
        int bil = z.nextInt();

	while(a<=bil){
	    if (bil%a==0){
		terkecil=a;
	        System.out.println(terkecil+"Adalah pembagi terkecil dari"+bil);
	        break;
	    }else{
		a=a+1;
		  if(bil%a==0){
		     terkecil=a;
	             System.out.println(terkecil+"Adalah pembagi terkecil dari"+bil);
		     break;
	    }
	}a++;
      }
    }
  }

   
	