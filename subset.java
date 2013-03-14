public static ArrayList<ArrayList<Integer>> subSet(ArrayList<Integer> set){
    ArrayList<ArrayList<Integer>> subSet = new ArrayList<ArrayList<Integer>>();
    int size=1<<set.size();
    for (int i= 0;i<size;i++){
	ArrayList<Integer> subsets= new ArrayList<Integer>();
	int index=0;
	for(int j=i;j>0;j>>=1){
	    if((j&1)==1)
	    subsets.add(set.get(index));
	index++;
	}
    }
    return subSet;
}
public static void printSets(ArrayList<Integer> sets){
	
	for (int s: sets){
		System.out.print(s+" ");
	}
	System.out.print('\n');
	return;
}
