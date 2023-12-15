package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DistinctNumberInWindow {
    public static ArrayList<Integer> dNum(ArrayList<Integer> arr, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < B; i++) {
            hashMap.put(arr.get(i), hashMap.getOrDefault(arr.get(i), 0) + 1);
        }
        ans.add(hashMap.size());

        for (int i = B; i < arr.size(); i++) {
            hashMap.put(arr.get(i), hashMap.getOrDefault(arr.get(i), 0) + 1);

            if (hashMap.containsKey(arr.get(i - B))) {
                if (hashMap.get(arr.get(i - B)) == 1) {
                    hashMap.remove(arr.get(i - B));
                } else {
                    hashMap.put(arr.get(i - B), hashMap.get(arr.get(i - B)) - 1);
                }
            }
            ans.add(hashMap.size());
        }
        return ans;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 4, 3));
        int B = 3;
        DistinctNumberInWindow result = new DistinctNumberInWindow();
        System.out.println(result.dNum(arr,B));
    }
}
