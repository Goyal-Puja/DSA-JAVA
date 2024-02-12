package array;

import javafx.print.Collation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinNoOfPlatforms {
    public static void main(String[] args){
        int[] arrive = {900,945,955,1100,1500,1800};
        int[] dept = {920,1200,1130,1150,1900,2000};
        int i = 1;
        int j = 0;
        int count = 1;
        int ans = 1;

        Arrays.sort(arrive);
        Arrays.sort(dept);

        while(i < arrive.length && j < dept.length){
            if(arrive[i] <= dept[j]){
                count++;
                i++;
            } else {
                count--;
                j++;
            }
        }
        ans = Math.max(ans,count);
        System.out.println(ans);
    }
}
