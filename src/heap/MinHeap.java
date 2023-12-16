package heap;

public class MinHeap {
    private int[] Heap;
    private int maxSize;
    private int size;

    public MinHeap(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
        Heap = new int[this.maxSize];
    }
    private int parent(int pos){
        return (pos-1)/2;
    }
    private int leftChild(int pos){
        return 2*(pos)+1;
    }
    private int rightChild(int pos){
        return 2*(pos)+2;
    }
    private boolean isLeaf(int pos){
        if(pos > (size)/2 && pos <= size){
            return true;
        }
        return false;
    }
    private void swap(int fpos,int spos){
        int temp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = temp;
    }
    private void minHeapify(int pos){
        if(isLeaf(pos))
            return;

        if(Heap[pos] > Heap[leftChild(pos)] || Heap[pos] > Heap[rightChild(pos)]){
            if(Heap[leftChild(pos)] < Heap[rightChild(pos)]){
                swap(pos,leftChild(pos));
                minHeapify(leftChild(pos));
            } else {
                swap(pos,rightChild(pos));
                minHeapify(rightChild(pos));
            }
        }
    }
    public void insert(int element){
        Heap[size] = element;
        int current = size;
        while(Heap[current] < Heap[parent(current)]){
            swap(current,parent(current));
            current = parent(current);
        }
        size++;
    }

    public void print(){
        for(int i=0;i<size/2;i++){
            System.out.print("Parent Node : "+Heap[i]);
            if(leftChild(i) < size)
                System.out.print(" Left Child Node : "+ Heap[leftChild(i)]);

            if(rightChild(i) < size)
                System.out.print(" Right Child Node : " +Heap[rightChild(i)]);
            System.out.println();
        }
    }
    public int extractMin(){
        int popped = Heap[0];
        Heap[0] = Heap[size--];
        minHeapify(0);
        return popped;
    }

    public static void main(String[] args){
        MinHeap minHeap = new MinHeap(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);

        minHeap.print();

        System.out.println("The min val is : "+ minHeap.extractMin());
    }
}

