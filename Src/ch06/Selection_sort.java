package ch06;

public class Selection_sort {
   public static void main (String[] args) {
	int i;
	int[] data = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	urutkan(data, data.length);

	System.out.println("Hasil pengurutan data: ");
	tampilkanLarik(data, data.length);
   }
 
   public static void tampilkanLarik(int[] data, int n) {
	for (int i = 0; i < n; i++) 
	    System.out.printf("%d ", data[i]);
	    System.out.println();
   }

   public static void urutkan(int[] data, int n) {
	int posMin, posAwal, j, temp;

	for (posAwal = 0; posAwal < n -1; posAwal++) {
	    posMin = posAwal;
	    for (j = posAwal + 1; j < n; j++) 
		if (data[posMin] > data[j])
		posMin = j;
	    
 	    // Tukarkan
	    temp = data[posAwal];
	    data[posAwal] = data[posMin];
	    data[posMin] = temp;

	    System.out.printf("Hasil posAwal %d: ", posAwal);
	    tampilkanLarik(data, n);
   
	}
    }
}
	