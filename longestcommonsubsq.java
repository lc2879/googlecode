/*longest common subsequence
If last characters of both sequences match (or X[m-1] == Y[n-1]) then

 L(X[0..m-1], Y[0..n-1]) = 1 + L(X[0..m-2], Y[0..n-2])

If last characters of both sequences do not match (or X[m-1] != Y[n-1]) then

 L(X[0..m-1], Y[0..n-1]) = MAX ( L(X[0..m-2], Y[0..n-1]), L(X[0..m-1], Y[0..n-2])
*/
public static String LCS(String str1,String str2){
    if(str1==null||str2==null) return null;

    char [] cha1= str1.toCharArray();
    char [] cha2= str2.toCharArray();
    int len1=cha1.length;
    int len2=cha2.length;
    int [][] t= new int [len1+1][len2+1];
    for(int i=0;i<len1;i++)
	for(int j=0;j<len2;j++){
	    if(i==0||j==0)
		t[i][j]=0;
	    else if (cha1[i-1]==cha2[j-1])
		t[i][j]=t[i-1][j-1];
	    else
		t[i][j]=Math.MAX(t[i-1][j],t[i][j-1]);
	}
return t[i][j];
}




