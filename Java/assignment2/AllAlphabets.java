// Time Complexity is O(n).
//Space Complexity is O(26).



import java.util.*;

class AllAlphabets
{
    public boolean alphabets()
    {
 	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int n = str.length();
	if(n < 26)
	return false;
	else
	{
	    str.toLowerCase();
	    int []array = new int[26];
	    for(int i = 0; i < n; i++)
	    {
		int x = str.charAt(i) - 'a';
		if(x < 26 && x >= 0)
		array[x]++;
	    }
	    
	    for(int i = 0; i < 26; i++)
	    {
		if(array[i] == 0)
		return false;
	    }
	}
	return true;
    }

    public static void main(String args[])
    {
	AllAlphabets s= new AllAlphabets();
	boolean ans = s.alphabets();
	if(ans == true)
	System.out.println("contains all alphabets");
	else
	System.out.println("doesn't contain all alphabets");
    }
}
