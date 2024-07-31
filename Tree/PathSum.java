package Trees;

public class PathSum {
    int maxSum=0;
    static Node root;
    class Node{
        Node left,right;
        int data;
        Node(int d)
        {
            data=d;
            left=right=null;
        }
    }
    public int Solution(Node root)
    {
        maxPathSum(root);
        return maxSum;
    }
    public int maxPathSum(Node root)
    {
        if(root!=null)
        {
            int ldepth=maxPathSum(root.left);
            int rdepth=maxPathSum(root.right);
            maxSum=Math.max(maxSum,ldepth+rdepth+root.data);
            return root.data+Math.max(ldepth,rdepth);
        }
        return 0;
    }
    public static void main(String[] args) {
        PathSum obj = new PathSum();
        root=obj.new Node(-10);
        root.left=obj.new Node(9);
        root.right=obj.new Node(20);
        root.right.left=obj.new Node(15);
        root.right.right=obj.new Node(7);
//        root.right.left.left=obj.new Node(5);
//        root.right.left.left.left=obj.new Node(9);
//        root.right.right.right=obj.new Node(7);
//        root.right.right.right.right=obj.new Node(8);
       System.out.println(obj.Solution(root));
    }
}
