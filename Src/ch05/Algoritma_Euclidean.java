package ch05;
import java.util.Scanner;

public class Algoritma_Euclidean {
    public static void main (String[] args) {
	int n,m,r;

	Scanner dataInput = new Scanner(System.in);
	System.out.print ("Masukkan nilai n: ");
	n = dataInput.nextInt();
	System.out.print ("Masukkan nilai m: ");
	m = dataInput.nextInt();
	System.out.print ("Nilai PBB: ");
	r = dataInput.nextInt();

	r = m%n;
	while (r!=0);{
	n = m;
	m = r;
	r = n % m;
    }
    r++;
    System.out.println();
    }
}
	
	
	
