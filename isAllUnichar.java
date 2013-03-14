import java.util.HashSet;


public class isAllUni{

      public static Boolean isAllUnique(String test){
          /*is a null string allowed?*/
        if(test==null)
          return false;
 
        char [] allChar = test.toCharArray();

        HashSet charSet= new HashSet();
        
        /*what charSet are we talking about?*/
        /*if string is longer than 256, return false*/
        if(allChar.length>256)
          return false;  

        for(int i =0;i<allChar.length;i++) {

             if (charSet.contains(allChar[i]))
                return false;
             charSet.add(allChar[i]);
        }
           return true;

}

       public static  void main(String[] arg){
                String [] testCase={"aa","abc","123a3",""};
                for(String test : testCase)
                System.out.println(test+" "+isAllUnique(test));

       }

}

