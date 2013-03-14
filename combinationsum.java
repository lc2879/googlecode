//many time
//BF way, just recursion, didn`t consider duplicated elements
public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        Arrays.sort(candidates);
        combinationSumHelper(0, candidates, 0, target, resultList, tempList);
        return resultList;
    }

    public void combinationSumHelper(int index, int[] candidates, int sum, int target, ArrayList<ArrayList<Integer>> resultList, ArrayList<Integer> tempList){

        if(sum > target) return;
        if(sum == target){
            resultList.add(new ArrayList<Integer>(tempList));
            return;
        }
        for(int i = index; i < candidates.length; i ++){
            tempList.add(candidates[i]);
            combinationSumHelper(i, candidates, sum+candidates[i], target, resultList, tempList);
            tempList.remove(tempList.size()-1);
        }
    }
}

//one time only
public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] candidates, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        Arrays.sort(candidates);
        combinationSumHelper(0, candidates, 0, target, resultList, tempList);
        return resultList;
    }

    public boolean combinationSumHelper(int index, int[] candidates, int sum, int target, ArrayList<ArrayList<Integer>> resultList, ArrayList<Integer> tempList){

        if(sum > target) return false;
        if(sum == target){
            if(!resultList.contains(tempList)){
                resultList.add(new ArrayList<Integer>(tempList));
            }
            return false;
        }
        for(int i = index; i < candidates.length; i ++){
            tempList.add(candidates[i]);
            boolean alive = combinationSumHelper(i+1, candidates, sum+candidates[i], target, resultList, tempList);
            tempList.remove(tempList.size()-1);
            if(!alive) break;
        }
        return true;
    }
}
