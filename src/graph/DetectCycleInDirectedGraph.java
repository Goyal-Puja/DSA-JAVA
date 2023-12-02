package graph;

import java.util.*;

public class DetectCycleInDirectedGraph {
    private int node;
    private LinkedList<Integer> adj[];
    private Boolean visited[];
    DetectCycleInDirectedGraph(int v){
        node = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
        visited = new Boolean[v];
    }
    void insertEdge(int src,int dest){
        adj[src].add(dest);
    }
    Boolean isCyclicUtil(int src){
        visited[src] = true;
        int a = 0;
        for(int i=0;i<adj[src].size();i++){
            a = adj[src].get(i);
            if(!visited[a]){
                if(isCyclicUtil(a))
                    return true;
            }
        }
        return false;
    }
    Boolean isCyclic(){
        for(int i=0;i<node;i++){
            visited[i] = false;
        }
        for(int u=0;u<node;u++) {
            if (!visited[u]) {
                if (isCyclicUtil(u))
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
       DetectCycleInDirectedGraph graph = new DetectCycleInDirectedGraph(6);
       graph.insertEdge(1,2);
       graph.insertEdge(4,1);
       graph.insertEdge(2,4);
       graph.insertEdge(3,4);
       graph.insertEdge(5,2);
       graph.insertEdge(1,3);

       if(graph.isCyclic()){
           System.out.println("Contain Cycle");
       } else {
           System.out.println("Does not contain cycle");
       }
    }
}
