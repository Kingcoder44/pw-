import java.util.Iterator;
import java.util.LinkedList;

class Dfs {
    // Input: Number of vertices
    int v;
    
    // Adjacency list to represent the graph
    LinkedList<Integer> adj[];
    
    // Constructor to initialize the graph with a given number of vertices
    Dfs(int v) {
        this.v = v;
        adj = new LinkedList[v];

        // Initialize each adjacency list
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    // Method to add a directed edge from vertex 'v' to vertex 'u'
    void addEdge(int v, int u) {
        adj[v].add(u);
    }

    // Recursive utility function for DFS traversal starting from a given vertex
    public void dfsutil(int v, boolean visited[]) {
        // Mark the current vertex as visited and print it
        visited[v] = true;
        System.out.print(v + " ");
    
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> itr = adj[v].listIterator();
        while(itr.hasNext()) {
            int n = itr.next();
            if (!visited[n])
                dfsutil(n, visited);
        }
    }
    
    // Method to perform DFS traversal starting from a given vertex
    void dfsTra(int v) {
        boolean[] visited = new boolean[this.v];
        dfsutil(v, visited);
    }

    // Main method to test the DFS implementation
    public static void main(String args[]) {
        // Create a graph with 4 vertices
        Dfs g = new Dfs(4);

        // Add directed edges to the graph
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        // Perform DFS traversal starting from different vertices
        System.out.println("DFS from vertex 0: ");
        g.dfsTra(0);
        System.err.println();

        System.out.println("DFS from vertex 1: ");
        g.dfsTra(1);
        System.err.println();

        System.out.println("DFS from vertex 2: ");
        g.dfsTra(2);
        System.out.println();
    }
}
