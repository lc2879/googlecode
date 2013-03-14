	public static void print(String str){
        if(str==null) return;
        for(int i=0;i<str.length();i++){
                System.out.print(str.charAt(i));
                if(i<str.length()-1&&(int)str.charAt(i+1)!=(int)str.charAt(i)+1)
                        System.out.print('\n');
                }
return;
}
