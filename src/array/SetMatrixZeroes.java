package array;

import java.util.HashSet;

public class SetMatrixZeroes {
    public static void main(String[] args){
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        int m = arr.length;
        int n = arr[0].length;

        HashSet<Integer> addRows = new HashSet<>();
        HashSet<Integer> addColumns = new HashSet<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == 0){
                    addRows.add(i);
                    addColumns.add(j);
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(addRows.contains(i) || addColumns.contains(j)){
                    arr[i][j] = 0;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
