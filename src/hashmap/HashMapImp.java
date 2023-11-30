package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapImp {
    public static void main(String[] args){
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"ABC");
        hashMap.put(2,"DEF");
        hashMap.put(3,"GHI");
        hashMap.put(4,"JKL");
        hashMap.put(5,"MNO");

        for(Map.Entry<Integer,String> h : hashMap.entrySet()){
            System.out.println(h.getKey()+" --> "+h.getValue());
        }
    }
}
