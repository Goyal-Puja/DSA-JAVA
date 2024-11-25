package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OverLappingInterval {
    public static void main(String[] args){
        int[][] interval = new int[][]{ {1, 3}, {2, 6}, {8, 10}, {15, 18} };

        Arrays.sort(interval, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        ArrayList<int[]> mergedInterval = new ArrayList<int[]>();
        mergedInterval.add(interval[0]);

        for(int i=1;i<interval.length;i++){
          int[] currentInterval = interval[i];
          int[] mergedLastInterval = mergedInterval.get(mergedInterval.size()-1);
          if(currentInterval[0] <= mergedLastInterval[1]){
              mergedLastInterval[1] = Math.max(mergedLastInterval[1], currentInterval[1]);
          } else {
              mergedInterval.add(currentInterval);
          }
        }
          for(int[] i : mergedInterval){
              System.out.print(Arrays.toString(i));
          }
    }
}