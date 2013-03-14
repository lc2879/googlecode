given a maze (matrix bool[N][M]) where 0 = free way, 1= obsticle - How many ways are there to reach from [0][0] to [N][M]? write a non-recursive solution.
class Solution {
public:
    int uniquePathsWithObstacles(vector<vector<int> > &obstacleGrid) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        int m = obstacleGrid.size();
        int n = obstacleGrid[0].size();
        int dp[m][n];
        int val = 1;
        for(int i = 0; i < m; ++i){
            if(obstacleGrid[i][0] == 1)
                val = 0;
            dp[i][0] = val;
                
        }
        val = 1;
        for(int i = 0; i < n; ++i){
            if(obstacleGrid[0][i] == 1){
                val = 0;
            }
            dp[0][i] = val;
        }
        for(int i = 1; i < m; ++i){
            for(int j = 1; j < n; ++j){
                if(obstacleGrid[i][j] == 1)
                    dp[i][j] = 0;
                else
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                
            }
        }
        return dp[m-1][n-1];
    }
};





#include <stdio.h>
#define SIZE 4

struct point {
        int i;
        int j;
        struct point *next;
};
typedef struct point point;

void push(point **last, int i, int j)
{
        /* base case when stack is empty */
        if(*last == NULL) {
                point *temp = malloc(sizeof(*temp));
                temp->i = i;
                temp->j = j;
                temp->next = NULL;
                *last = temp;
        } else {
                point *temp = malloc(sizeof(*temp));
                temp->i = i;
                temp->j = j;
                temp->next = *last;
                *last = temp;
        }
}

point *pop(point **last)
{
        point *temp = *last;
        *last = (*last)->next;
        return temp;
}

int stack_empty(point *last)
{
        if(last == NULL)
                return 1;
        else
                return 0;
}

int dfs(int mat[SIZE][SIZE], int i, int j, point **last)
{
        int count = 0;

        if(mat[i][j] == 0)
                return 0;
        /* push 0,0 on the stack */
        push(last, 0, 0);
        while(!stack_empty(*last)) {
                point *co = pop(last);
                if(co->i == SIZE-1 && co->j == SIZE-1)
                        count++;
                /* check for neigbours of x*/
                if(co->j +1 < SIZE && mat[co->i][co->j+1] == 1) {
                        push(last, co->i, co->j+1);
                }
                if(co->i+1 < SIZE && mat[co->i+1][co->j] == 1) {
                        push(last, co->i+1, co->j);
                }
        }
        return count;
}

int main()
{
        point *last;
        last = NULL;
        int mat[SIZE][SIZE] = {
                1, 1, 1, 1,
                1, 1, 1, 1,
                1, 0, 0, 1,
                1, 1, 1, 1,
        };
        printf("%d\n", dfs(mat, 0, 0, &last));
}
