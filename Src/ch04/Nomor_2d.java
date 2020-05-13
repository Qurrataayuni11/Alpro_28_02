package ch04;

public class Nomor_2d {
   public static void main (String[] args) {
	int[] nilai =  {82,12,41,38,19,26,9,48,20,55,8,32,3};
	
	System.out.println ("Kelipatan tiga: ");
	for (int i = 1; i<nilai.length; i++){
	   if (nilai[i]%3 == 0){
		System.out.println(nilai[i]);

	  }
      }
   }    
}