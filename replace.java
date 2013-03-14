public class replace{


    public static String rep(String target){
          if(target==null)
        	  return null;
    	  char[] charList= target.toCharArray();
    	  int spacecount=0;
    	  for (int j=0;j<charList.length;j++)
    		  if(charList[j]==' ')
    			  spacecount++;
    	  
    	  char[] newList= new char [charList.length+spacecount*2];
    	  int cur=0;
    	  for(int i=0;i<charList.length;i++){
    	  if(charList[i]==' '){
    	  newList[cur++]='%';
    	  newList[cur++]='2';
    	  newList[cur++]='0';
    	  }
    	  else
    		  newList[cur++]=charList[i];
    	  }
    	 // newList[cur]='\0';
    	  return new String(newList);
    	  }



public static void main (String[] args){


String s="hello world,this is a testcase!";
System.out.println(rep(s));


}
