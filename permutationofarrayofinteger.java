public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean visit[] = new boolean[num.length];
        int[] perm = new int[num.length];
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        permute(result, perm, num, visit, 0);
        return result;
    }
     
    public void  permute(ArrayList<ArrayList<Integer>> res, int[] perm, int []num,
    boolean[] visit, int count){
        if(count == perm.length){
            ArrayList<Integer> set = new ArrayList<Integer>();
            for(int i =0; i< perm.length;i++)
                set.add(perm[i]);
            res.add(set);
            return;
        }
         
        for(int i=0; i< perm.length;i++){
            if(visit[i]==false){
                visit[i]=true;
                perm[count] = num[i];
                permute(res, perm,num,visit,count+1);
                visit[i] = false;
            }
        }
    }
}




public class Solution {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean [] visited = new boolean[num.length];
        int[] buffer = new int[num.length];
        for(int i =0; i<num.length; i++)
            visited[i] = false;
        return permute(buffer, num, visited, 0);
    }
  
    public ArrayList<ArrayList<Integer>> permute(int[]buffer, int[] num, boolean[] visited, int pos){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        //add new Set of NUM
        if(num.length == pos){
            ArrayList<Integer> newSet = new ArrayList<Integer>();
            for(int i =0; i< num.length; i++)
                newSet.add(buffer[i]);
            result.add(newSet);
        }
      
        for(int i =0; i< num.length; i++){
            if(visited[i] == false){
                visited[i] = true;
                buffer[pos] = num[i];
               ArrayList<ArrayList<Integer>> res = permute(buffer, num,visited, pos+1);
                for(ArrayList<Integer> smallSet: res){
                    if(!result.contains(smallSet))
                        result.add(smallSet);
                }
                visited[i] = false;
            }
        }
        return result;
    }
}

