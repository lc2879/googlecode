int findRepeation (int a [ ], int n) // where size of array n + 1

{

int i = 0;



for(int i = 0; i < size; i++)

{

int j = ( ( a [ i ] < 0 ) ? -1 : 1 ) * a [ i ]; // j = abs( a[ i ] )



if(a [ j ] > 0)

a [ j ] *= -1;

else

break; // break from the for loop

}



return i; // index of the first repeation

/* I prefer returning the index instead of the element itself.

return a [ i ]; // first repeated element

*/

}


