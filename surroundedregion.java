/*For example,

X X X X
X O O X
X X O X
X O X X
After running your function, the board should be:

X X X X
X X X X
X X X X
X O X X*/

First scan the four edges of the board, if you meet an 'O', call a recursive mark function to mark that region to something else (for example, '+');
scan all the board, if you meet an 'O', flip it to 'X';
scan again the board, if you meet an '+', flip it to 'O';
