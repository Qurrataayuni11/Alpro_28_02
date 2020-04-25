package ch03;
import java.util.Scanner;

public class Algoritma_pertama {
   public static void main (String[] args) {
      int x,y;
      Scanner a = new Scanner (System.in);
      System.out.print ("Masukkan nilai bilangan x: ");
      x = a.nextInt();
      Scanner b = new Scanner (System.in);
      System.out.print ("Masukkan nilai bilangan y: ");
      y = b.nextInt();
      
      if (x>=y){
      System.out.println("Nilai x yaitu "+x+" lebih besar dari nilai y yaitu "+y);

      }else if (x==y){
      System.out.println("Nilai x yaitu sama dengan nilai y ");

      }else{
      System.out.println("Nilai y yaitu "+y+" lebih besar daripada nilai x yaitu "+x);

  }
 }
}