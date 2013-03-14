minimum partition to achieve a sequence of palindrome strings 

// Returns the minimum number of cuts needed to partition a string
// such that every part is a palindrome
int minPalPartion(char *str)
{
    // Get the length of the string
    int n = strlen(str);
 
    /* Create two arrays to build the solution in bottom up manner
       C[i][j] = Minimum number of cuts needed for palindrome partitioning
                 of substring str[i..j]
       P[i][j] = true if substring str[i..j] is palindrome, else false
       Note that C[i][j] is 0 if P[i][j] is true */
    int C[n][n];
    bool P[n][n];
 
    int i, j, k, L; // different looping variables
 
    // Every substring of length 1 is a palindrome
    for (i=0; i<n; i++)
    {
        P[i][i] = true;
        C[i][i] = 0;
    }
 
    /* L is substring length. Build the solution in bottom up manner by
       considering all substrings of length starting from 2 to n.
       The loop structure is same as Matrx Chain Multiplication problem (
       See http://www.geeksforgeeks.org/archives/15553 )*/
    for (L=2; L<=n; L++)
    {
        // For substring of length L, set different possible starting indexes
        for (i=0; i<n-L+1; i++)
        {
            j = i+L-1; // Set ending index
 
            // If L is 2, then we just need to compare two characters. Else
            // need to check two corner characters and value of P[i+1][j-1]
            if (L == 2)
                P[i][j] = (str[i] == str[j]);
            else
                P[i][j] = (str[i] == str[j]) && P[i+1][j-1];
 
            // IF str[i..j] is palindrome, then C[i][j] is 0
            if (P[i][j] == true)
                C[i][j] = 0;
            else
            {
                // Make a cut at every possible localtion starting from i to j,
                // and get the minimum cost cut.
                C[i][j] = INT_MAX;
                for (k=i; k<=j-1; k++)
                    C[i][j] = min (C[i][j], C[i][k] + C[k+1][j]+1);
            }
        }
    }
 
    // Return the min cut value for complete string. i.e., str[0..n-1]
    return C[0][n-1];
}


import java.util.ArrayList;
import java.util.Stack;
 
 
public class PalindromePartitioning {
	public ArrayList<ArrayList<String>> partition(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		ArrayList<String> output = new ArrayList<String>();
		//System.out.println(s.substring(0, 1));
		//System.out.println(s);
		dfs(s, 0, output, result);
		return result;
        
    }
	private void dfs(String s, int start, ArrayList<String> output, ArrayList<ArrayList<String>> result ) {
		if (start == s.length()) {
			result.add((ArrayList<String>) output.clone());//must use clone
			return;
		}
		for (int i = start; i < s.length(); i++) {
			if (isPalindrome(s.substring(start, i+1))) {
				//System.out.println(s.subSequence(start, i+1));
				output.add(s.substring(start, i+1));
				dfs(s, i+1, output, result);
				//System.out.println(output);
				output.remove(output.size() - 1);
			}
		}
	}
	private boolean isPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end))
				return false;
			start++;
			end--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(new PalindromePartitioning().partition("aab"));
	}
 
}
