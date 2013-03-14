public static ArrayList<String> pmString(String target){

if(target==null) return null;

ArrayList<String> result= new ArrayList<String>();
if(target.length()==0){
result.add("");
return result;
}

char fst=target.charAt(0);
String rest=target.substring(1);
ArrayList<String> restP= pmString(rest);
for(String p:restP){
 for(int i=0;i<=p.length();i++){
          String start=p.substring(0,i);
          String end=p.substring(i);
          result.add(start+fst+end);
        }
}
return result;
}


 public  static void permutation(String str) { 
    permutation("", str); 
 }

 private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0) System.out.println(prefix);
    else {
        for (int i = 0; i < n; i++)
           permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }

}


