package ch05;

public class Algoritma_LIS {
   public static void main(String[] args) {
	int N = 6;
	int np[] = {5,3,4,8,6,7};
	int s[] = new int[N];
	int k = 0;

	for (int i = 0; i < N; i++) s[i] = 1;

	for (int i = 0; i < N; i++) {
	    for (int j = 0; j < i; j++) {
		if (np[i] >= np[j]) {
	  	   k = s[j] + 1;
		   if (s[i] <= k) {
			s[i] = k;
		   }
		}
	    }
	}
	System.out.println(s[N-1]);
    }
}