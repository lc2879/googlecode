public static void printLevel( Node root){
    if(root==null) return ;
    Queue<Node> lst = new LinkedList<Node>();
    lst.add(root);
    int nCur =1 ;
    int nNext =0;
    while(!lst.isEmpty()){
	Node tmp = lst.remove();
	nCur--;
	if(tmp.left!=null){
	    lst.add(tmp.left);
	    nNext++;
	}
	if(tmp.right!=null){
	    lst.add(tmp.right);
	    nNext++;
	}
	System.out.print(tmp.value);
	if(nCur==0){
	    System.out.println();
	    nCur=nNext;
	    nNext=0;
	}

    }
       
}


print by level bottom up

public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        LinkedList<ArrayList<Integer>> reversedList = new LinkedList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        if(root == null) return resultList;

        queue.offerLast(root);
        int numInLayer = 1, numInNextLayer = 0, count = 0;
        while(!queue.isEmpty()){
            count ++;
            TreeNode node = queue.pollFirst();
            if(node.left != null){
                queue.offerLast(node.left);   
                numInNextLayer ++;
            }
            if(node.right != null){
                queue.offerLast(node.right);
                numInNextLayer ++;   
            }
            tempList.add(node.val);
            if(count == numInLayer){
                reversedList.addFirst(tempList);
                tempList = new ArrayList<Integer>();
                numInLayer = numInNextLayer;
                numInNextLayer = 0;
                count = 0;
            }
        }
        for(ArrayList<Integer> list : reversedList) resultList.add(list);
        return resultList;
    }
}
