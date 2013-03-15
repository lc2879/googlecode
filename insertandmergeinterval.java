c class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Interval> resultList = new ArrayList<Interval>();
        int i = 0; 
        while(i < intervals.size()){
            Interval interval = intervals.get(i);
            int x = newInterval.start;
            int y = newInterval.end;
            int a = interval.start;
            int b = interval.end;
            if(y < a){
                resultList.add(newInterval);
                copy(intervals, i, intervals.size()-1, resultList);
                return resultList;
            }
            else{
                if(x > b){
                    resultList.add(interval);
                }
                else{
                    newInterval.start = Math.min(a, x);
                    newInterval.end = Math.max(b, y);
                }
                i++;
            }
        }
        resultList.add(newInterval);
        return resultList;
    }
    public void copy(ArrayList<Interval> intervals, int from, int to, ArrayList<Interval> result){
        for(int i = from, i <= to; i++){
            result.add(intervals.get(i));
        }
    }

///////////////////

merge intervals


public class Solution {

    class Com implements Comparator<Interval>{
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Interval> resultList = new ArrayList<Interval>();
        Collections.sort(intervals, new Com());
        int i = 0;
        while(i < intervals.size()){
            Interval m = intervals.get(i);
            int x = m.start;
            int y = m.end;
            int j = i+1;
            while(j < intervals.size()){
                Interval n = intervals.get(j);
                int a = n.start;
                int b = n.end;
                if(y >= a){
                    y = Math.max(y, b);
                    m.end = y;
                    i = j;
                    j++;
                }
                else break;
            }
            resultList.add(m);
            i++;
        }
        return resultList;
    }
}}
