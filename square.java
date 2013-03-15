public static float findSqure(float n){
    if(n<0)return -1;
    if(n==0)return 0;
    float fMin=0.0;
    float fMax=n;
    float fTmp = fMin/2 + fMax/2;
    int count =10000;
    while(Math.Abs(fTmp*fTmp-n)>0.00001){
	if(count--=0) break;
	if(fTmp*fTmp>f){
	    fMax=fTmp;
	    fTmp= fMin/2 + fMax/2;
	}
	else
	    {
	    fMin=fTmp;
	    fTmp= fMin/2 + fMax/2;
	    }
    }
    return fTmp;
}
//sqrt
   public static double sqrt(double x){
        if(x==1 || x==0) return x;
        if(x<0)return -1;
        double stopCase = 0.00001;
        double left = 0, right = x<1? 1:x;
        while(right-left>stopCase){
            double mid = left + (right - left)/2;
            double midSqr = mid * mid;
            if(midSqr ==x)return mid;
            else if(midSqr > x) right = mid;
            else left = mid;
        }
        return (left+right)/2.0;
    }
/*fragment for integers*/
hi = number
lo = 0
mid = ( hi + lo ) / 2
mid2 = mid*mid
while( lo < hi-1 and mid2 != number ) {
    if( mid2 < number ) {
        lo = mid
    else
        hi = mid
    mid = ( hi + lo ) / 2
    mid2 = mid*mid
