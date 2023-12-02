package graph;

import java.util.ArrayList;

public class WordSearchBoard {
    public static boolean dfs(char[][] grid,int i,int j,String b,int index){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != b.charAt(index))
            return false;

        if(index == b.length()-1)
            return true;

        boolean ans = dfs(grid,i+1,j,b,index+1) || dfs(grid,i,j+1,b,index+1) || dfs(grid,i,j-1,b,index+1) || dfs(grid,i-1,j,b,index+1);
        return ans;
    }

    public static boolean solution(char[][] grid,String b){
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == b.charAt(0) && dfs(grid,i,j,b,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        char[][] grid = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String b = "ABCCED";
        WordSearchBoard result = new WordSearchBoard();
        boolean ans = result.solution(grid,b);
        System.out.println(ans);
    }
}
