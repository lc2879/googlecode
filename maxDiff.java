public class maxDiff{
	public static int lindex;
	public static int rindex;
	public static void returnMaxDiff(int [] a,int n){

	        int [] minLeft = new int [n-1];
	        minLeft[0]=0;
	        for ( int i=1;i<n-1;i++){
	                minLeft[i]= a[minLeft[i-1]]>a[i]?i:minLeft[i-1];
	        }
	        int tmp= Integer.MIN_VALUE;
	        for (int i=1;i<n;i++){
	                 if(a[i]-a[minLeft[i-1]]>tmp){
	                        tmp=a[i]-a[minLeft[i-1]];
	                        lindex=minLeft[i-1];
	                        rindex=i;
	        	}
	        }
	return;
	}


	public static int returnMaxIndexDiff(int [] a,int n){

		int [] minLeft = new int [n];
		int [] maxRight = new int [n];
		minLeft[0]=a[0];
		 for ( int i=1;i<n;i++){
                        minLeft[i]= minLeft[i-1]>a[i]?a[i]:minLeft[i-1];
                }
		maxRight[n-1]= a [n-1];
		for (int i=n-2;i>-1;i--){
			maxRight[i]=maxRight[i+1]<a[i]?a[i]:maxRight[i+1];
		}
		int i=0;
		int j=0;
		int maxIndexDiff=-1;
		while(i<n&&j<n){
			if(maxRight[j]>minLeft[i]){
				maxIndexDiff= maxIndexDiff<(j-i)?j-i:maxIndexDiff;
				j++;
			}else{
				i++;}
		}
			
		return maxIndexDiff;
	}




	}



}


