package array;

public class Array {
    public static void main(String[] args){
        int[] arr = new int[]{2, 3, 1, 1, 4};
        int i = 0;
        while(i < arr.length-1){
            int ele = arr[i];
            i = i+ele;
        }

        if(i == arr.length-1){
            System.out.println(true);
        } else {
            System.out.print(false);
        }
    }
}
