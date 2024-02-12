package array;

import java.util.Arrays;
import java.util.Comparator;

class MeetingRoom {
    static class Meeting{
        int start;
        int end;
        Meeting(int start,int end){
            this.start = start;
            this.end = end;
        }
    }
    static class comp implements Comparator<Meeting>{
        public int compare(Meeting m1, Meeting m2){
            if(m1.end >= m2.end)
                return 1;
            else if(m1.end < m2.end)
                return -1;
            else
                return 0;
        }
    }
    public static int maxMeetings(int start[],int end[],int n){
        if(n == 0)
            return 0;

        Meeting[] meetings = new Meeting[n];
        for(int i=0;i<n;i++){
            meetings[i] = new Meeting(start[i],end[i]);
        }
        Arrays.sort(meetings, new comp());
        int ans = 1;
        int prev = meetings[0].end;
        for(int i=1;i<n;i++){
            if(meetings[i].start > prev){
                ans += 1;
                prev = meetings[i].end;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        int n = start.length;

        int ans = maxMeetings(start,end, n);
        System.out.println(ans);
    }
}
