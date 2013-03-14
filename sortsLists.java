//sorts lists elements ranging from 1 to n all together.


'm thinking about constructing a array A of linkedlist to solve the problem.

 

 the index of the array  A is ranging from 1 to n, A[i] is a linkedlist that contains the index of the L that contains value i.

 

for example:

 

 

A[1] --1->1>3   (list L1 contains two 1s, List L3 contains one 1)

A[2]--

A[3]--


A[4]--2->4      (list L2 contains one 4 ,List L4 contains a 4)

A[5]--

 

 

so we go over the lists once to construct the array of linkedlist , this takes O(n) time because the insertion into the indexed linkedlist takes constant time. 

after scanning all the lists L , we scan the array of linkedlst from A[1] to A[n] and create the new lists L' at the same time.

because there are in total n values for the index and n total elements in  all the linked list, the total running time, similar to BFS, should be O(n+n)=O(n).
