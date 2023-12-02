package graph;

import java.util.*;

public class DetectCycle {
    private int node;
    private LinkedList<Integer> adj[];
    private Boolean visited[];
    DetectCycle(int v){
        node = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
        visited = new Boolean[v];
    }
    void insertEdge(int src,int dest){      // undirected graph
        adj[src].add(dest);
        adj[dest].add(src);
    }
    Boolean isCyclicUtil(int src,int parent){
        visited[src] = true;
        int a = 0;
        for(int i=0;i<adj[src].size();i++){
            a = adj[src].get(i);
            if(!visited[a]){
                if (isCyclicUtil(a,parent))
                    return true;
            } else if(a != parent){
                return true;
            }
        }
        return false;
    }
    Boolean isCyclic(){
        for(int i=0;i<node;i++){
            visited[i] = false;
        }
        for(int u=0;u<node;u++){
            if(!visited[u]){
                if(isCyclicUtil(u,-1))
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
          DetectCycle graph = new DetectCycle(5);
          graph.insertEdge(1,0);
          graph.insertEdge(0,2);
          graph.insertEdge(2,1);
          graph.insertEdge(0,3);
          graph.insertEdge(3,4);
          if(graph.isCyclic()){
              System.out.println("Contain Cycle");
          } else {
              System.out.println("Does not contain cycle");
          }
    }
}
