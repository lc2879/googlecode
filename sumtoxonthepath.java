/*the depth of the tree is 5*/
public static int pathsum [] = new int [5];

public static void printPath(Node root, int sum, int [] pathsum, int level){
	if(root==null) return;
	pathsum[level]=root.value;
	int s=0;
	for(int i=level;i>0;i--){
		s+=pathsum[i];
			if(s==sum)
				print(pathsum,i,level);
		}
	printPath(root.left,sum,pathsum,level+1);
	printPath(root.right,sum,pathsum,level+1);



}

public static void print(int pathsum [],int start, int end){

for (int i = start;i<=end;i++){
	System.out.print(pathsum[i]+" ");
}
 System.out.println();
}
