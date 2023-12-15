package array;

import java.util.*;
class Interval{
    int start,end;
    Interval(int start,int end){
        this.start = start;
        this.end = end;
    }
}
public class MergeInterval {
    public static ArrayList<Interval> merge(ArrayList<Interval> intervals){
        int n = intervals.size();
        ArrayList<Interval> ans = new ArrayList<>();
        if(n <= 0)
            return ans;

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval l1, Interval l2) {
                return l1.start - l2.start;
            }
        });

        ans.add(intervals.get(0));
        for(int i=1;i<intervals.size();i++){
            if(ans.get(ans.size()-1).end >= intervals.get(i).start){
                ans.get(ans.size()-1).end = Math.max(ans.get(ans.size()-1).end, intervals.get(i).end);
            } else{
                ans.add(intervals.get(i));
            }
        }
        return ans;
    }
    public static void main(String[] args){
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1,2));
        intervals.add(new Interval(3,5));
        intervals.add(new Interval(4,9));
        intervals.add(new Interval(6,7));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(12,16));

        MergeInterval mergeInterval = new MergeInterval();
        ArrayList<Interval> mergeIntervals = mergeInterval.merge(intervals);
        for (int i=0;i<mergeIntervals.size();i++) {
            Interval interval = mergeIntervals.get(i);
            System.out.print("["+interval.start + "," + interval.end + "] ");
        }
    }
}
