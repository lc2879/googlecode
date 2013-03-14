public class stringCompre{

public static int numofBits(int a){
int bits=0;
while(a>1){
a= a/10;
bits++;
}
return bits;
}

public static String strCompresion(String target){

if(target==null||target.length()<3)
     return target;
int totalBits=0;
char[] targetList= target.toCharArray();
int count=1;
char last=targetList[0];
for(int i =1;i<targetList.length;i++)
{  if(targetList[i]==last)
         count++;
   else{
    totalBits+=1+String.valueOf(count).length();
    last=targetList[i];
    count=1;
}
}
totalBits+=1+String.valueOf(count).length();

if(totalBits>target.length())
     return target;
/*determine if worth the effort*/
     

StringBuffer newStr= new StringBuffer();

count=1;
last=targetList[0];
for(int i =1;i<targetList.length;i++)
{  if(targetList[i]==last)
         count++;
   else{
    newStr.append(last);
    newStr.append(count);
    last=targetList[i];
    count=1;
}
}
 newStr.append(last);
    newStr.append(count);

return  newStr.toString();
}

public static void main (String[] args){



}

}
