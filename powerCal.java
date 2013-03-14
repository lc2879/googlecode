//Implement the function
//int pow (int a, int b)
//that takes two integers 'a' and 'b' and returns a^b (i.e 'a' raised to the power 'b')

public static int powerCal( int a ,int b){

	if (a ==0 ) return -1;
	if(b ==0) return 1;
	if(b==1) return a ;
	if(b%2==1) return powerCal(a , b-1)*a;
	return powerCal (a*a,b/2);
}
