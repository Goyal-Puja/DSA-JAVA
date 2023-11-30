package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int element = sc.nextInt();
            arr.add(element);
        }

        String[] str = new String[arr.size()];
        for(int i=0;i<n;i++){
            str[i] = String.valueOf(arr.get(i));
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String s : str){
            sb.append(s);
        }

        System.out.println(sb.toString());
    }
}
