//not mine
public class Solution {
    public static class Bar {
        int height, startIdx;
        Bar(){}
        Bar(int h, int s){ height = h; startIdx = s; }
    }
    public static int maxn = 1000;
    public static Bar[] stack = new Bar[maxn];
    
    public static int largestRectangle(int[] h){
        int top = 0, max = 0;
        stack[top++] = new Bar(-1, 0);
        for (int i=0; i<=h.length; i++){
            Bar cur = new Bar(0, i);
            if (i < h.length) cur.height = h[i];
            while (stack[top-1].height > cur.height){
                Bar prev = stack[--top];
                int area = (i - prev.startIdx)*prev.height;
                if (area > max)
                    max = area;
                cur.startIdx = prev.startIdx;
            }
            stack[top++] = cur;
        }
        return max;
    }   
    public int maximalRectangle(char[][] matrix){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int n = matrix.length, m = matrix[0].length;
        int max = 0;
        int[] h = new int[m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (matrix[i][j] == '1'){
                    h[j] += 1;
                }else
                    h[j] = 0;
            }
            int area = largestRectangle(h);
            if (area > max)
                max = area;
        }
        return max;
    }
}
