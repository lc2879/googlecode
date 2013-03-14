import java.util.Arrays;



public class isPermutation{


public static Boolean isPmt(String a,String b){

		/*is the anagram case sensitive? is whitespace significant?*/
       	if(a.length()!=b.length())
		return false;

		char [] alist= a.toCharArray();
		char [] blist= b.toCharArray();
        java.util.Arrays.sort(alist);
		java.util.Arrays.sort(blist);

		for(int i =0;i<alist.length;i++)	
			if(alist[i]!=blist[i])
				return false;
		
		return true;

		
	 }


public static Boolean isPmt1(String a ,String b)
{
     if(a.length()!=b.length()||a==null||b==null)
                return false;

     int [] count= new int [256];

     char [] alist= a.toCharArray();
     char [] blist= b.toCharArray();
      for(int i =0;i<alist.length;i++){
        count[alist[i]]++;
         count[blist[i]]--;
}
      for(int j=0;j<256;j++)
          if(count[j]<0)
                return false;

return true;
}


public static void main(String[] args){

                String a="adfads";
                String b="abc";
                String c="abc";
                System.out.println(a+" "+b+" "+isPmt(a,b));
                System.out.println(c+" "+b+" "+isPmt(c,b));




}


}
