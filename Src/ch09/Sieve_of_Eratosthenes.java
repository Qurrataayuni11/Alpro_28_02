package ch09;

public class Sieve_of_Eratosthenes {
    void sieveOfEratosthenes(int n) 
    { 
        boolean prima[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prima[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            if(prima[p] == true) 
            { 
                for(int i = p*2; i <= n; i += p) 
                    prima[i] = false; 
            } 
        } 
          
        for(int i = 2; i <= n; i++) 
        { 
            if(prima[i] == true) 
                System.out.print(i + " "); 
        } 
    } 
     
    public static void main(String args[]) 
    { 
        int n = 30; 
        System.out.print("Berikut ini Adalah Bilangan Prima "); 
        System.out.println("Lebih Kecil Dari " + n); 
        Sieve_of_Eratosthenes g = new Sieve_of_Eratosthenes(); 
        g.sieveOfEratosthenes(n); 
    } 
} 