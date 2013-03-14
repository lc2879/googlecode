//Write a function that takes an array of five integers, each of which is between 
//1 and 10, and returns the number of combinations of those integers that sum to 15. 
//For example, calling the function with the array [1, 2, 3, 4, 5] should return 1, while 
//calling it with [5, 5, 10, 2, 3] should return 4 (5 + 10, 5 + 10, 5 + 5 + 2 + 3, 10 + 2 + 3). 
//You may assume that the input has already been validated. Show how you would test this function.


public static int findNumOfCom(int []a ,int n, int sum){

 if(a==null) return -1;
 if(n==0) return 0;
 if(sum==0) return -1;
 int [][] tmp = new int [n][sum+1];

 /*initialization */
 for (int i =0;i<n;i++)
	tmp[i][0]=1;
// important
 if(a[0]<sum) tmp[0][a[0]]=1;
 for(int i=1;i<n;i++)	
	for( int j=0;j<sum+1;j++){
		assert(a[i]>0);
		if(j>=a[i])
			tmp[i][j]=tmp[i-1][j-a[i]]+tmp[i-1][j];
		else
			tmp[i][j]=tmp[i-1][j];
		}
return tmp [n-1][sum];
}
