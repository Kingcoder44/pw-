package Trees;

public class Diameter {
    static Node root;
    int maxDia=0;
    class Node{
        Node left,right;
        int data;
        Node(int d)
        {
            data=d;
            left=right=null;
        }
    }
    public int diameter(Node root)
    {
        if(root!=null)
        {
            int ldepth=diameter(root.left);
            int rdepth=diameter(root.right);
            maxDia=Math.max(maxDia,ldepth+rdepth);
            return 1+Math.max(ldepth,rdepth);
        }
        return 0;
    }
    public static void main(String[] args) {
        Diameter obj = new Diameter();
        root=obj.new Node(1);
        root.left=obj.new Node(2);
        root.right=obj.new Node(3);
        root.right.left=obj.new Node(4);
        root.right.right=obj.new Node(6);
        root.right.left.left=obj.new Node(5);
        root.right.left.left.left=obj.new Node(9);
        root.right.right.right=obj.new Node(7);
        root.right.right.right.right=obj.new Node(8);
        System.out.println("Diameter of Tree = "+obj.diameter(root));
    }
}
