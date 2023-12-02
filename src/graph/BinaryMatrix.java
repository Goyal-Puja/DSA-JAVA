package graph;

public class BinaryMatrix {
    public static int dfs(char[][] grid,int i,int j,int visited[][]){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return 0;
        if(visited[i][j] == 1 || grid[i][j] == '0')
            return 0;

        visited[i][j] = 1;
        return 1+dfs(grid,i+1,j,visited)+dfs(grid,i,j+1,visited)+dfs(grid,i-1,j,visited)+dfs(grid,i,j-1,visited)+dfs(grid,i-1,j-1,visited)+dfs(grid,i+1,j+1,visited)
                +dfs(grid,i+1,j-1,visited)+dfs(grid,i-1,j+1,visited);
    }

    public static int largestRegion(char[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int maxx = Integer.MIN_VALUE;
        int[][] visited = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                visited[i][j] = -1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && visited[i][j] == -1){
                    int ans = dfs(grid,i,j,visited);
                    maxx = Math.max(maxx,ans);
                }
            }
        }
        return maxx;
    }
    public static void main(String[] args){
        char[][] grid = {
                {'0', '0', '1', '1','0'},
                {'1', '0', '1', '1','0'},
                {'0', '1', '0', '0','0'},
                {'0', '0', '0', '0','1'}
        };
        BinaryMatrix matrix = new BinaryMatrix();
        int result = matrix.largestRegion(grid);
        System.out.println(result);
    }
}
