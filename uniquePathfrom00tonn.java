/*A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?
*/

const int M_MAX = 100;
const int N_MAX = 100;
 
int dp(int m, int n) {
  int mat[M_MAX+2][N_MAX+2] = {0};
  mat[m][n+1] = 1;
 
  for (int r = m; r >= 1; r--)
    for (int c = n; c >= 1; c--)
      mat[r][c] = mat[r+1][c] + mat[r][c+1];
 
  return mat[1][1];
}


const int M_MAX = 100;
const int N_MAX = 100;
 
int backtrack(int r, int c, int m, int n, int mat[][N_MAX+2]) {
  if (r == m && c == n)
    return 1;
  if (r > m || c > n)
    return 0;
 
  if (mat[r+1][c] == -1)
    mat[r+1][c] = backtrack(r+1, c, m, n, mat);
  if (mat[r][c+1] == -1)
    mat[r][c+1] = backtrack(r, c+1, m, n, mat);
 
  return mat[r+1][c] + mat[r][c+1];
}
 
int bt(int m, int n) {
  int mat[M_MAX+2][N_MAX+2];
  for (int i = 0; i < M_MAX+2; i++) {
    for (int j = 0; j < N_MAX+2; j++) {
      mat[i][j] = -1;
    }
  }
  return backtrack(1, 1, m, n, mat);
}

