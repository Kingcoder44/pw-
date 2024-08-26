package Graph;

import java.util.*;
public class DFS {

        static int V;
        LinkedList<Integer> adj[];
        static boolean visited[] ;
        DFS(int v)
        {
            V=v;
            adj = new LinkedList[v];
            visited= new boolean[V];
            //to create adjacency list for storign traversal
            for(int i=0;i<v;i++)
            {
                adj[i] = new LinkedList<>();
            }
        }
        public void addEdge(int v1,int v2)
        {
            adj[v1].add(v2);
        }
        public void dfsTrav(int v,boolean visited[])
        {
            visited[v]=true;
            System.out.print(v+" ");
            Iterator<Integer> i = adj[v].listIterator();
            while(i.hasNext())
            {
                int n = i.next();
                if(!visited[n])
                    dfsTrav(n, visited);
            }
        }

        public static void main(String[] args) {
                DFS g = new DFS(4);
                g.addEdge(0,1);
            g.addEdge(0,2 );
            g.addEdge( 1,2);
            g.addEdge(2,3);
            g.addEdge( 2,0);
            g.addEdge(3,3);
            System.out.println();
            System.out.println("DFS from vertex 2 ");
            g.dfsTrav(2,visited);

        }
    }
