package array;

public class MergeTwoSortedArray {
    public static void merge(int[] arr1, int[] arr2,int m,int n){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] newArr = new int[m+n+1];   // extra space

        while(i < m && j < n){
            if(arr1[i] <= arr2[j]){
                newArr[k++] = arr1[i];
                i++;
            } else {
                newArr[k++] = arr2[j];
                j++;
            }
        }
        while(i < m){
            newArr[k++] = arr1[i];
            i++;
        }
        while(j < n){
            newArr[k++] = arr2[j];
            j++;
        }

        for(int t=0;t<k;t++){
            System.out.print(newArr[t]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 5, 6};
        int m = arr1.length;
        int n = arr2.length;

        MergeTwoSortedArray array = new MergeTwoSortedArray();
        array.merge(arr1,arr2,m,n);
    }
}
