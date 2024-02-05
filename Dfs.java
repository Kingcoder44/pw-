import java.util.Iterator;
import java.util.LinkedList;
class Dfs{
    // class Graph{
        int v;
        LinkedList<Integer> adj[];
        Dfs(int v)
        {
            this.v=v;
            adj=new LinkedList[v];

        for(int i=0;i<v;i++)
            adj[i] =new LinkedList<>();
        }
    void addEdge(int v,int u)
    {
        adj[v].add(u);
    }
    public void dfsutil(int v,boolean visited[]){
        visited[v]=true;
        System.out.print(v+" ");
    
        Iterator<Integer> itr = adj[v].listIterator();
        while(itr.hasNext())
        {
            int n = itr.next();
            if(!visited[n])
            dfsutil(n, visited);
        }
    }
    
    void dfsTra(int v)
    {
        boolean[] visited = new boolean[this.v];
        dfsutil(v,visited);
    }
    public static void main(String args[])
    {
        Dfs g = new Dfs(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        System.out.println("Dfs from vertex 0: ");
        g.dfsTra(0);
        System.err.println();
        System.out.println("Dfs from vertex 1: ");
        g.dfsTra(1);
        System.err.println();
        System.out.println("Dfs from vertex 2: ");
        g.dfsTra(2);
        System.out.println();
    }
}