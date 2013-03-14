public static void g  enParen(ArrayList<String> result,int leftp,int rightp,char[] str, int n){
    if(leftp==0&&rightp==0)
	result.add(String.copyValueOf(str);
     else{
	 if(leftp>0){
	     str[n]="(";
	     genParen(result,leftp-1,rightp,str,n+1);
	 }
	 if(rightp>leftp){
	     str[n]=")";
	     genParen(result,leftp,rightp-1,str,n+1);
	 }
     }
		   }
