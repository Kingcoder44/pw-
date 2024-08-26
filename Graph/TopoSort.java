package Graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopoSort {
    int V;
    static LinkedList<Integer> adj[];
    boolean visited[];
    TopoSort(int v)
    {
        V=v;
        adj = new LinkedList[v];
        visited = new boolean[v];
        for (int i=0;i<v;i++)
        {
            adj[i] = new LinkedList<>();
        }
    }
    public static void addEdge(int v1,int v2)
    {
        adj[v1].add(v2);
    }
    public void SortUtil(int v, boolean visited[], Stack<Integer> s)
    {
    visited[v] =true;
    Integer i;
        Iterator<Integer> itr = adj[v].listIterator();
        while(itr.hasNext())
        {
            i=itr.next();
            if(!visited[i])
            {
                SortUtil(i, visited, s);
            }
        }
        s.push(v);
    }
    public void Sorting()
    {
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(visited,false);
        for(int i=0;i<V;i++)
        {
          if(!visited[i])
          {
              SortUtil(i,visited,stack);
          }
        }
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {
        TopoSort g = new TopoSort(6);
        g.addEdge(5,2);
        g.addEdge(5,0 );
        g.addEdge( 4,0);
        g.addEdge( 4,1);
        g.addEdge(2,3);
        g.addEdge( 3,1);
        System.out.println("Toposort:");
        g.Sorting();
    }
}
