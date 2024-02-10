package graph;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.*;

public class BFSTraversal {
    private int node;
    private LinkedList<Integer> adj[];
    private Queue<Integer> que;
    private boolean visited[];
    BFSTraversal(int v){
        node = v;
        adj = new LinkedList[v];
        visited = new boolean[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<Integer>();
    }
    void insertEdge(int src,int dest){
        adj[src].add(dest);
        adj[dest].add(src);
    }
    void BFS(int src){
        int a = 0;
        visited[src] = true;
        que.add(src);

        while (que.size() != 0){
            src = que.poll();
            System.out.print(src+" ");
            for (int i=0;i<adj[src].size();i++){
                a = adj[src].get(i);
                if(!visited[a]){
                    visited[a] = true;
                    que.add(a);
                }
            }
        }
    }
    public static void main(String[] args){
          BFSTraversal graph = new BFSTraversal(6);
          graph.insertEdge(0,1);
          graph.insertEdge(0,3);
          graph.insertEdge(0,4);
          graph.insertEdge(4,5);
          graph.insertEdge(3,5);
          graph.insertEdge(1,2);
          graph.insertEdge(1,0);
          graph.insertEdge(2,1);
          graph.insertEdge(4,1);
          graph.insertEdge(3,1);
          graph.insertEdge(5,4);
          graph.insertEdge(5,3);
          graph.BFS(0);
    }
}
