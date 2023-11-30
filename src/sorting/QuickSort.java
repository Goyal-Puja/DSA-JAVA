package sorting;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr,0,arr.length-1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low < high){
            int pivotIndex = partition(arr,low,high);

            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = high;
        int index = low;
        for(int i=low;i<high;i++){
            if(arr[i] < arr[pivot]){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }
        int temp1 = arr[index];
        arr[index] = arr[pivot];
        arr[pivot] = temp1;
        return index;

    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
