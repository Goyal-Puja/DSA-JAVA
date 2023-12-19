package array;

import java.util.HashSet;
import java.util.Iterator;
public class UnionOfTwoArrays {
    public static void union(int[] arr1,int[] arr2){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hashSet.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++) {
            hashSet.add(arr2[i]);
        }
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }

    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 6, 7, 8};

        UnionOfTwoArrays unionOfTwoArrays = new UnionOfTwoArrays();
        unionOfTwoArrays.union(arr1,arr2);
    }
}
