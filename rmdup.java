public static int finddupor(int [] a, int n){
	int sum=(1+n)*n/2;
	int sqsum=n*(n+1)*(2*n+1)/6;
	int sumA=0;
	int sqsumA=0;
	for (int i=0;i<n;i++){
		sumA+=a[i];
		sqsumA+=a[i]*a[i];
		}
	if((sum-sumA)==0)return 0;
	return (((sqsum-sqsumA)/(sum-sumA))-(sum-sumA))/2;
}
