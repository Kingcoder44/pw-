package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static int V;
    static LinkedList<Integer> adj[];
    static boolean visited[];
    BFS(int v)
    {
        V=v;
        adj = new LinkedList[v];
        visited = new boolean[v];
        for(int i=0;i<v;i++)
        {
            adj[i] = new LinkedList<>();
        }

    }
    public void addEdge(int v1, int v2)
    {
        adj[v1].add(v2);
    }
    public void bfsTrav(int v)
    {
        Queue<Integer> q = new LinkedList<>();
        visited[v] = true;
        q.add(v);
        while(!q.isEmpty())
        {
            v=q.poll();
            System.out.print(v+" ");
            Iterator<Integer> itr = adj[v].listIterator();
            while(itr.hasNext())
            {
                int n = itr.next();
                        if(!visited[n])
                        {
                            visited[n] = true;
                            q.add(n);
                        }
            }

        }
    }
    public static void main(String[] args) {
        BFS g = new BFS(4);
        g.addEdge(0,1);
        g.addEdge(0,2 );
        g.addEdge( 1,2);
        g.addEdge( 1,2);
        g.addEdge(1,3);
        g.addEdge( 2,0);
        g.addEdge(3,3);
        System.out.println();
        System.out.println("BFS from vertex 2 ");
        g.bfsTrav(0);

    }
}
