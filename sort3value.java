public static void sort(int a [],int n) throws java.lang.Exception{
    if (a==null) return;
    if (n==0||n==1)return;
    int index1=0;
    int index2=n-1;
    for(int i=0;i<n;){
	if(a[i]==0){
	    a[i]=a[index1];
	    a[index1]=0;
	    i++;
	    index1++;
	}
	else if(a[i]==2){
	    a[i]=a[index2];
	    a[index2]=2;
	    index2--;
	}
	else if(a[i]==1){
	    i++;
	}
	else 
	    throw new Exception ("values should be 0,1,or 2!\n");
    }
}
