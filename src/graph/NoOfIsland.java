package graph;

public class NoOfIsland {
    public static void dfs(char arr[][],int i,int j,int visited[][]){
      if(i < 0 || j < 0 || i >= arr.length || j >= arr[0].length)
          return;

      if(visited[i][j] == 1 || arr[i][j] == '0')
          return;

      visited[i][j] = 1;
      dfs(arr,i,j+1,visited);
      dfs(arr,i+1,j,visited);
      dfs(arr,i,j-1,visited);
      dfs(arr,i-1,j,visited);
    }
    public static int numIslands(char[][] arr){
        int ans = 0;
        int n = arr.length;
        int m = arr[0].length;

        int visited[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                visited[i][j] = -1;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == '1' && visited[i][j] == -1){
                    ans++;
                    dfs(arr,i,j,visited);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        char[][] arr = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '0'},
                {'0', '0', '0', '1', '1'},

        };
        NoOfIsland island = new NoOfIsland();
        int count = island.numIslands(arr);
        System.out.println(count);
    }
}
