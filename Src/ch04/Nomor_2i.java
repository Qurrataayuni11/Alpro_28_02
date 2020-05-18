package ch04;
import java.util.Scanner;

public class Nomor_2i {
  public static void main (String[] args) {
	int[]nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int x = 0;
	
	for (int i = 0; i<13; i++){
	    x = i+1;   
	    System.out.print("(");
	    System.out.print(nilai[i]-nilai[x] +"), ");


	}
   }
} 
    
