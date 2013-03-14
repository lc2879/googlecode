// test.cpp : ..............
//

#include "stdio.h"
 
void reverseString(char* str){

if(str==0)
return;

char* end = str;

char temp;

while(*end){
	++end;
}

--end;

while(str<end){
    temp=*str;
    *str++=*end;
    *end--=temp;
}

}

int void main()
{

	char* s="abcd";
	reverseString(s);
	return 0;
}
 


