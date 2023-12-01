package graph;

import java.util.*;

public class DFSTraversal {
    private int node;
    private LinkedList<Integer> adj[];
    private boolean visited[];

    DFSTraversal(int v){
        node = v;
        adj = new LinkedList[v];
        visited = new boolean[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }

    }
    void insertEdge(int src,int dest){
        adj[src].add(dest);
    }

    void DFS(int src){
        visited[src] = true;
        System.out.print(src+" ");
        int a = 0;
        for(int i=0;i<adj[src].size();i++){
            a = adj[src].get(i);
            if(!visited[a]){
                DFS(a);
            }
        }
    }

    public static void main(String[] args){
           DFSTraversal graph = new DFSTraversal(6);
        graph.insertEdge(0,1);
        graph.insertEdge(0,2);
        graph.insertEdge(1,0);
        graph.insertEdge(1,3);
        graph.insertEdge(2,0);
        graph.insertEdge(2,3);
        graph.insertEdge(3,4);
        graph.insertEdge(3,5);
        graph.insertEdge(4,3);
        graph.insertEdge(5,3);
        graph.DFS(0);
    }
}
