package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original Array:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Array is already sorted or empty
        }

        int middle = arr.length / 2;

        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        // Populate left and right sub-arrays
        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }
        for (int i = middle; i < arr.length; i++) {
            right[i - middle] = arr[i];
        }

        // Recursively sort the sub-arrays
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted sub-arrays back into the original array
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0; // Index for the left sub-array
        int j = 0; // Index for the right sub-array
        int k = 0; // Index for the merged array

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy any remaining elements from left and right sub-arrays (if any)
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
