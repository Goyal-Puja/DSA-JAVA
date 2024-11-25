package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args){
        ArrayList<String> A = new ArrayList<>(Arrays.asList("cat", "dog", "god", "tca"));
        HashMap<String,ArrayList<Integer>> hmap = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            char[] s = A.get(i).toCharArray();
            Arrays.sort(s);
            String t = String.valueOf(s);
            if(hmap.get(t) == null){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i+1);
                hmap.put(t,list);
            } else{
                hmap.get(t).add(i+1);
            }
        }

        for(Map.Entry<String,ArrayList<Integer>> map : hmap.entrySet()){
            System.out.println(map.getKey()+"--->"+map.getValue());
        }

        for(ArrayList<Integer> i : hmap.values()){
            ans.add(i);
        }
       System.out.print(ans);
    }
}
