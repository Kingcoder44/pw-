import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
class TopoSort{
    int v;
    LinkedList<Integer> adj[];
    public TopoSort(int v)
    {
        this.v=v;
        adj = new LinkedList[v];

        for(int i=0;i<v;++i)
        {
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int v,int u)
    {
        adj[v].add(u);
    }
    public void SortUtil(int v,boolean[] visited, Stack<Integer> stack)
    {
        visited[v] = true;
        Integer i;
        Iterator<Integer> itr = adj[v].iterator();
        while(itr.hasNext())
        {
            i=itr.next();
            if(!visited[i])
            {
                SortUtil(i,visited,stack);
            }
        }
        stack.push(v);
    }
    public void Sorting()
    {
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(!visited[i])
            {
                SortUtil(i, visited, stack);
            }
        }
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String args[])
    {
        TopoSort g1 = new TopoSort(6);
        g1.addEdge(5,2);
        g1.addEdge(5,0);
        g1.addEdge(4,0);
        g1.addEdge(4,1);
        g1.addEdge(2,3);
        g1.addEdge(3,1);

        System.out.println("TopoSort ");
        g1.Sorting();
    }
    
}