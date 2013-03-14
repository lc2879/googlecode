//return the number of prime numbers 
public static int inputPrime ( int [] a,int n){
    if (a==null) return -1;
    if(a==1) return 1;
    if(a==2) return 2;

    a[0]=1;
    a[1]=2;
    int nRet =2 ;
    for(int i=3;i<=n;i++){
	if(isPrime(a,i))
	    a[nRet++]=i;
    }
    return nRet;
}

public static Boolean isPrime(int [] a, int num){
    for ( int i=1; a[i]*a[i]<num; i++){
	if(num%a[i]==0)
	    return false;
	return true;
    }

}
