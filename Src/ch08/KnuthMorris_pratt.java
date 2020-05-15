package ch08;

public class KnuthMorris_pratt {
    public static void KMP(String X, String Y)
    {
		
	if (Y == null || Y.length() == 0)
	{
	    System.out.println("Pattern occurs with shift 0");
	    return;
	}

		
	if (X == null || Y.length() > X.length())
	{
	     System.out.println("Pattern not found");
	     return;
	}

	char[] chars = Y.toCharArray();
	
	int[] next = new int[Y.length() + 1];
	for (int i = 1; i < Y.length(); i++)
	{
	    int j = next[i + 1];

	    while (j > 0 && chars[j] != chars[i])
		j = next[j];

	    if (j > 0 || chars[j] == chars[i])
		next[i + 1] = j + 1;
	}

	for (int i = 0, j = 0; i < X.length(); i++)
	{
	     if (j < Y.length() && X.charAt(i) == Y.charAt(j))
	     {
		if (++j == Y.length())
		{
		    System.out.println("Pola Terjadi Dengan Pergeseran: " + 
			(i - j + 1));
		}
	     }
	     else if (j > 0)
	     {
		j = next[j];
		i--;	
	     }
	  }
	}

	public static void main(String[] args)
	{
		String text = "ABCABAABCABAC";
		String pattern = "CAB";

		KMP(text, pattern);
	}
}