public static class minMax{
    int min;
    int max;
}
public static minMax getMinMax(int [] a, int n){

    if (a==null || n==0)
	return null;
    minMax result= new minMax();
    int i=0;
    if(n % 2==0){
	if(a[0]>a[1]){
	    result.min = a[1];
	    result.max= a[0];
	}
	else{
	       result.min = a[0];
	    result.max= a[1];
	}
	i=2;
    }
    else{
	  result.min = a[0];
    result.max = a[0];
    i = 1; 
    }
    while(i<n-1){
	if(a[i]>a[i+1]){
	    if(a[i]>result.max)
		result.max = a[i];
	    if(a[i+1]<result.min)
		result.min =a[i+1];
	}
	else{
	    if(a[i+1]>result.max)
		result.max = a[i+1];
	    if(a[i]<result.min)
		result.min =a[i];
	}
	i+=2;
    }
    return result;
}

       If n is odd:    3*(n-1)/2  
       If n is even:   1 Initial comparison for initializing min and max, 
                           and 3(n-2)/2 comparisons for rest of the elements  
                      =  1 + 3*(n-2)/2 = 3n/2 -2
