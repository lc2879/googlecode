//A straght forward thinking: say, 1432
//what`s the next bigger number of it? 
//1. we make it bigger 
//2. we make the bigger number smaller to be as close as possible to the original number(simple sort the array from the next digit of the digit found in step1)
public class Solution {
    public void nextPermutation(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = num.length;
        int i = len-2;
        while(i >= 0){
            int j = i+1;
            int index = -1;
            int min = Integer.MAX_VALUE;
            while(j < len){
                if(num[j] > num[i]){
                    min = Math.min(min, num[j]);
                    index = j;
                }
                j++;
            }
            if(index == -1) i--;
            else{
                num[index] = num[i];
                num[i] = min;
                break;
            }
        }

        Arrays.sort(num, i+1, len);
    }
}

