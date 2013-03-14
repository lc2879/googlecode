jump game 1  reachable problem?


public class Solution {   public boolean canJump(int[] A) {
    
        if (A.length == 0) {
            return false;
        }
        if (A.length == 1) {
            return true;
        }
        boolean psb = false;
        int count = 0;
         
        for (int i = A.length-2; i >= 0; i--) {
            if (A[i] > count) {//you can go from a[i] to the nearest point that's connected to the last one
                psb = true; //it is possible to reach the end if you ever arrive at a[i]
                count = 0;
            }
            else {
                psb = false;
                count++; //count is the number you should be bigger than so that you can go to nearest 'train station'
            }
        }
 
        return psb;
    }
}

public class Solution {
 
    public int jump(int[] A) {
        /* Greedy algorithm: always jump to the next place which 
         * provides you the maximum next jump*/
         
        int max = A[0]; //the max index of the next jump
        int min = 1; //the min index of the next jump
        int step = 0;
 
        if (A.length == 1) {
            return 0;
        }
        while (max < A.length-1) {
            int m = max;
            for (int i = min; i <= max; i++) {
                if (m < A[i] + i) {
                    m = A[i] + i;
                }
            }
            min = max+1;
            max = m;
            step++;
        }
 
        return step+1;
    }
}





