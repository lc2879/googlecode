class Solution {  
public:  
    int minPathSum(vector<vector<int> > &grid) {  
        // Start typing your C/C++ solution below  
        // DO NOT write int main() function  
        int y = grid.size();  
        if (y == 0) return 0;  
        int x = grid[0].size();  
          
        for (int i = 1; i < x; ++i)  
            grid[0][i] += grid[0][i-1];  
        for (int i = 1; i < y; ++i)  
            grid[i][0] += grid[i-1][0];  
              
        int a, b;  
        for(int j = 1; j < y; ++j)  
        {  
            for (int i = 1; i < x; ++i)  
            {  
                a = grid[j][i] + grid[j-1][i];  
                b = grid[j][i] + grid[j][i-1];  
                grid[j][i] = a > b ? b : a;  
            }  
        }  
        return grid[y-1][x-1];  
    }  
};  
