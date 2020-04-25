package ch03;
import java.util.Scanner;

public class Algoritma_kedua {
    public static void main (String[] args) {
    int x,y,z;
    Scanner a = new Scanner (System.in);
    System.out.print ("Masukkan nilai bilangan x: ");
    x = a.nextInt();
    Scanner b = new Scanner (System.in);
    System.out.print ("Masukkan nilai bilangan y: ");
    y = b.nextInt();
    Scanner c = new Scanner (System.in);
    System.out.print ("Masukkan nilai bilangan z: ");
    z = c.nextInt();
    
    if (x>=y && x>=z){
	System.out.println ("Nilai x yaitu "+x+" lebih besar nilai y yaitu "+y+" dan z yaitu "+z);
    }else if (y>=x && y>=z){
	System.out.println ("Nilai y yaitu "+y+" lebih besar daripada nilai x "+x+" dan z yaitu "+z);
    }else{
	System.out.println ("Nilai z yaitu "+z+" lebih besar daripada nilai x yaitu "+x+" dan y yaitu "+y);
   
    }
  }
}
   