package array;

public class PeakElementInMatrix {
    public static void main(String[] args){
        int[][] matrix = {

                {1,  4,  3},
                {3,  2,  5},

        };

        int result = findPeak(matrix);
        System.out.print(result);
    }
    public static int findPeak(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = cols-1;

        while(left <= right){
            int midCol = left + (right-left)/2;  // middle column

            int maxRow = 0;
            for(int i=1;i<rows;i++){          // find maximum element in middle column
                if(matrix[i][midCol] > matrix[maxRow][midCol]){
                    maxRow = i;
                }
            }
            if((midCol == 0 || matrix[maxRow][midCol] >= matrix[maxRow][midCol-1]) && (midCol == cols-1 || matrix[maxRow][midCol] >= matrix[maxRow][midCol+1])){  // peak found
                return matrix[maxRow][midCol];
            } else if(midCol > 0 && matrix[maxRow][midCol-1] > matrix[maxRow][midCol]){
                right = midCol-1;
            } else {
                left = midCol+1;
            }
        }
        return -1; // no peak element found
    }
}
