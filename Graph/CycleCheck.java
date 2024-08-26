package Graph;
import java.util.*;
public class CycleCheck {
    int V;
    LinkedList<Integer>[] adj;
    int visited[];
    int pathvisited[];

    CycleCheck(int v) {
        V = v;
        adj = new LinkedList[v+1];
        visited = new int[v+1];
        pathvisited = new int[v+1];
        for (int i = 1; i <=v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v1, int v2) {
        adj[v1].add(v2);
    }

    public boolean cycleCheck(int node, int[] visited, int[] pathvisited) {
        visited[node] = 1;
        pathvisited[node] = 1;
        //traverse for adjacent nodes
        Iterator<Integer> itr = adj[node].listIterator();
        while (itr.hasNext()) {

            int n = itr.next();
            if (visited[n] == 0){
                if (cycleCheck(n, visited, pathvisited)) {
                    return true;
                }
            }
            else if (pathvisited[n] == 1)
                return true;
        }
        pathvisited[node] = 0;
        return false;
    }

    public boolean isCycle() {
        Arrays.fill(visited, 0);
        Arrays.fill(pathvisited, 0);
        for (int i = 1; i <= V; i++) {
            if(visited[i]==0)
                if(cycleCheck(i, visited, pathvisited))
                    return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CycleCheck g = new CycleCheck(3);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 1); // Creates a cycle (1 -> 2 -> 3 -> 1)
        System.out.println("Is cycle present: " + g.isCycle()); // Should print true
    }

}
