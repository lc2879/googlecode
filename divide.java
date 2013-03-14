w
int division(int tempdividend, int tempdivisor) {

     int quotient = 1;

     if (tempdivisor == tempdividend) {
        remainder = 0;
        return 1;
     } else if (tempdividend < tempdivisor) {
        remainder = tempdividend;
        return 0;
     }   

    do{

        tempdivisor = tempdivisor << 1;
        quotient = quotient << 1;

     } while (tempdivisor <= tempdividend);



     /* Call division recursively */
     quotient = quotient + division(tempdividend - tempdivisor, divisor);

     return quotient;
 } 


 void main() {

      printf ("\nEnter the Dividend: ");
      scanf("%d", &dividend);
      printf("\nEnter the Divisor: ");
      scanf("%d", &divisor);   

      printf("\n%d / %d: quotient = %d", dividend, divisor, division(dividend, divisor));
      printf("\n%d / %d: remainder = %d", dividend, divisor, remainder);
      getch();
 }
int divide(int numerator, int denominator) { 

 int mask = 0x1; 
 int quotient = 0; 

 while (denominator <= numerator) { 
 denominator <<= 1; 
 mask <<= 1; 
 } 

 while (mask > 1) { 
 denominator >>= 1; 
 mask >>= 1; 
 if (numerator >= denominator) { 
 numerator -= denominator; 
 quotient |= mask; 
 } 
 } 

 return quotient; 
}
//over flow proof

01.class Solution {  
02.public:  
03.    int divide(int dividend, int divisor) {  
04.        int sign = 1;  
05.        if(dividend < 0)  
06.            sign *= -1;  
07.        if(divisor < 0)  
08.            sign *= -1;  
09.  
10.        long long big = abs((long long)dividend);  
11.        long long small = abs((long long)divisor);  
12.        long long temp = small;  
13.        long long midres = 1;  
14.        while(temp < big)  
15.        {  
16.            temp <<= 1;  
17.            midres <<= 1;  
18.        }  
19.  
20.        int ret = 0;  
21.        while(temp >= small)  
22.        {  
23.            while(big >= temp)  
24.            {  
25.                big -= temp;  
26.                ret += midres;  
27.            }  
28.            temp >>= 1;  
29.            midres >>= 1;  
30.        }  
31.        return ret*sign;  
32.    }  
33.};  
i



//Be careful of corner cases.
class Solution {
    public int divide(int dividend, int divisor) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        //handle negative
        boolean neg = false;
        if(dividend < 0) neg = !neg;
        if(divisor < 0) neg = !neg;

        //change dividend and divisor to positive long, handle min values
        long a = Math.abs(dividend);
        if(dividend == min) a = (long)max+1;//explicit type casting needed here
        long b = Math.abs(divisor);
        if(divisor == min) b = (long)max+1;

        long result = 0;
        while(a >= b){
            long c = b;
            long tempResult = 1;
            while(c <= a){
                c <<= 1;
                tempResult <<= 1;
            }
            c >>= 1;
            tempResult >>= 1;
            result += tempResult;
            a -= c;
        }
        if(neg) result = -result;
        return (int)result;
    }
}
