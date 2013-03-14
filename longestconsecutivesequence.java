public class Solution {
    public int longestConsecutive(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        // Start typing your Java solution below
        // DO NOT write main() function
        Set<Integer> set = new HashSet<Integer>();
        int max=0;
        for(int ele: num)
            set.add(ele);
        for(int ele: num){
            int left = ele -1;
            int right = ele +1;
            int count = 1;
            while(set.contains(left)){
                set.remove(left--);//eliminate redundancy
                count++;
            }
            while(set.contains(right)){
                set.remove(right++);//eliminate redundancy
                count++;
            }
            max = Math.max(count,max);
        }
        return max;
    
    }
}
