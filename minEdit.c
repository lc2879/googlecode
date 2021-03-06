public class Solution {
    public int minDistance(String word1, String word2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] cache = new int[len1+1][len2+1];
        for(int i = 0; i <= len1; i++) cache[i][0] = i;
        for(int i = 0; i <= len2; i++) cache[0][i] = i;
        for(int i = 1; i <= len1; i++){
            for(int j = 1; j <= len2; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)) cache[i][j] = cache[i-1][j-1];
                else cache[i][j] = Math.min(cache[i-1][j-1], Math.min(cache[i][j-1], cache[i-1][j])) + 1;
            }
        }
        return cache[len1][len2];
    }
}// Dynamic Programming implementation of edit distance
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
 
// Change these strings to test the program
#define STRING_X "SUNDAY"
#define STRING_Y "SATURDAY"
 
#define SENTINEL (-1)
#define EDIT_COST (1)
 
// Returns Minimum among a, b, c
int Minimum(int a, int b, int c)
{
    int min = c;
 
    if( a < b )
        if( a < c )
            min = a;
        else if( b < c )
            min = b;
 
    return min;
}
 
// Strings of size m and n are passed.
// Construct the Table for X[0...m, m+1], Y[0...n, n+1]
int EditDistanceDP(char X[], char Y[])
{
    // Cost of alignment
    int cost = 0;
    int leftCell, topCell, cornerCell;
 
    int m = strlen(X)+1;
    int n = strlen(Y)+1;
 
    // T[m][n]
    int *T = (int *)malloc(m * n * sizeof(int));
 
    // Initialize table
    for(int i = 0; i < m; i++)
        for(int j = 0; j < n; j++)
            *(T + i * n + j) = SENTINEL;
 
    // Set up base cases
    // T[i][0] = i
    for(int i = 0; i < m; i++)
        *(T + i * n) = i;
 
    // T[0][j] = j
    for(int j = 0; j < n; j++)
        *(T + j) = j;
 
    // Build the T in top-down fashion
    for(int i = 1; i < m; i++)
    {
        for(int j = 1; j < n; j++)
        {
            // T[i][j-1]
            leftCell = *(T + i*n + j-1);
            leftCell += EDIT_COST; // deletion
 
            // T[i-1][j]
            topCell = *(T + (i-1)*n + j);
            topCell += EDIT_COST; // insertion
 
            // Top-left (corner) cell
            // T[i-1][j-1]
            cornerCell = *(T + (i-1)*n + (j-1) );
 
            // edit[(i-1), (j-1)] = 0 if X[i] == Y[j], 1 otherwise
            cornerCell += (X[i-1] != Y[j-1]); // may be replace
 
            // Minimum cost of current cell
            // Fill in the next cell T[i][j]
            *(T + (i)*n + (j)) = Minimum(leftCell, topCell, cornerCell);
        }
    }
 
    // Cost is in the cell T[m][n]
    cost = *(T + m*n - 1);
    free(T);
    return cost;
}
 
// Recursive implementation
int EditDistanceRecursion( char *X, char *Y, int m, int n )
{
    // Base cases
    if( m == 0 && n == 0 )
        return 0;
 
    if( m == 0 )
        return n;
 
    if( n == 0 )
        return m;
 
    // Recurse
    int left = EditDistanceRecursion(X, Y, m-1, n) + 1;
    int right = EditDistanceRecursion(X, Y, m, n-1) + 1;
    int corner = EditDistanceRecursion(X, Y, m-1, n-1) + (X[m] != Y[n]);
 
    return Minimum(left, right, corner);
}
 
int main()
{
    char X[] = STRING_X; // vertical
    char Y[] = STRING_Y; // horizontal
 
    printf("Minimum edits required to convert %s into %s is %d\n",
           X, Y, EditDistanceDP(X, Y) );
    printf("Minimum edits required to convert %s into %s is %d by recursion\n",
           X, Y, EditDistanceRecursion(X, Y, strlen(X), strlen(Y)));
 
    return 0;
}
