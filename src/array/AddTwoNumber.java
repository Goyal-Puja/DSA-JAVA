package array;

import java.util.*;

public class AddTwoNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n size : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            int element = sc.nextInt();
            arr.add(element);
        }

        Collections.reverse(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 1;
        for(int i=0;i<arr.size();i++){
            int sum = arr.get(i)+carry;
            ans.add(sum%10);
            carry = sum/10;
        }
        if(carry == 1){
            ans.add(carry%10);
            carry = carry/10;
        }
        while(ans.get(ans.size()-1) == 0 && ans.size() > 1){
            ans.remove(ans.size()-1);
        }
        Collections.reverse(ans);
        System.out.println(ans);

    }
}
