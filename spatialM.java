void print_spiral(int mat[][N_MAX], int m, int n, int k) {
  if (m <= 0 || n <= 0)
    return;
  if (m == 1) {
    for (int j = 0; j < n; j++)
      cout << mat[k][k+j] << " ";
    return;
  }
  if (n == 1) {
    for (int i = 0; i < m; i++)
      cout << mat[k+i][k] << " ";
    return;
  }
  // print from top left
  for (int j = 0; j < n - 1; j++)
    cout << mat[k][k+j] << " ";
  // print from top right
  for (int i = 0; i < m - 1; i++)
    cout << mat[k+i][k+n-1] << " ";
  // print from bottom right
  for (int j = 0; j < n - 1; j++)
    cout << mat[k+m-1][k+n-1-j] << " ";
  // print from bottom left
  for (int i = 0; i < m - 1; i++)
    cout << mat[k+m-1-i][k] << " ";
 
  print_spiral(mat, m-2, n-2, k+1);
}
 
void print_spiral_helper(int mat[][N_MAX], int m, int n) {
  print_spiral(mat, m, n, 0);
}

    class Solution {  
    public:  
        vector<vector<int> > generateMatrix(int n) {  
            // Start typing your C/C++ solution below  
            // DO NOT write int main() function  
            vector<vector<int> > result(n, vector<int>(n));  
            if (n == 0) return result;  
              
            int num = 0;  
            int layer = n/2;  
            for (int i = 0; i < layer; ++i)  
            {  
                int j;  
                for (j = i; j < n-1-i; ++j)  
                    result[i][j] = ++num;  
                for (j = i; j < n-1-i; ++j)  
                    result[j][n-1-i] = ++num;  
                for (j = n-1-i; j > i; --j)  
                    result[n-1-i][j] = ++num;  
                for (j = n-1-i; j > i; --j)  
                    result[j][i] = ++num;  
            }  
            if (n%2 == 1)  
                result[n/2][n/2] = ++num;  
            return result;  
        }  
    };  
