package heap;

public class MinHeapToMaxHeap {

    public static void MaxHeapify(int[] arr, int i ,int N){
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        int largest = i;
        if(leftChild < N && arr[leftChild] > arr[largest]){
            largest = leftChild;
        }
        if(rightChild < N && arr[rightChild] > arr[largest]){
            largest = rightChild;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            MaxHeapify(arr,largest,N);
        }
    }
    public static void convertMaxHeap(int arr[],int N){
        for(int i=(N-2)/2;i>=0;i-- ){
            MaxHeapify(arr,i,N);
        }
    }
    public static void print(int arr[], int N){
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {3, 5, 9, 6,8, 20, 10, 12, 18, 9};
        int N = arr.length;

        MinHeapToMaxHeap minHeapToMaxHeap =  new MinHeapToMaxHeap();
        minHeapToMaxHeap.convertMaxHeap(arr,N);

        minHeapToMaxHeap.print(arr,N);
    }
}
