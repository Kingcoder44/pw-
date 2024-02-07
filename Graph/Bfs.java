import java.util.*;
class Bfs{
   public int v;
    public LinkedList<Integer> adj[];
    Bfs(int v)
    {
        this.v=v;
        adj= new LinkedList[this.v];
        
        for(int i=0;i<v; ++i)
        {
            adj[i]  = new LinkedList<Integer>();
        }
        
    }
    public void addEdge(int v,int u)
    {
        adj[v].add(u);
    }
    public void BfsTra(int s)
    {
        boolean[] visited = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while(queue.size()!=0)
        {
            s= queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> itr = adj[s].listIterator();
            while(itr.hasNext())
            {
                int n = itr.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }
     public static void main(String args[]) {
        // Create a graph with 4 vertices
        Bfs g = new Bfs(4);

        // Add directed edges to the graph
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        // Perform DFS traversal starting from different vertices
        System.out.println("BFS from vertex 0: ");
        g.BfsTra(0);
        System.err.println();

        System.out.println("BFS from vertex 1: ");
        g.BfsTra(1);
        System.err.println();

        System.out.println("BFS from vertex 2: ");
        g.BfsTra(2);
        System.out.println();
    }
    
}
