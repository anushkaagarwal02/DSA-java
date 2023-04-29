import java.util.LinkedList;
import java.util.Queue;

public class preordertreeform {
    public static class Node
    {
        int val;
        Node left;
        Node right;
        Node(int val)
        {
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static class Binarytree {
        static int ptr = -1;

        public static Node buildtree(int[] n) {
            ptr++;
            if (n[ptr] == -1) {
                return null;
            }
            Node n1 = new Node(n[ptr]);
            n1.left = buildtree(n);
            n1.right = buildtree(n);

            return n1;
        }
    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);

}
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
       inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);

    }
    public static void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);


    }
    public static void levelorder(Node root) {
        if(root==null)
        {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println("");
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.println(curr.val);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

public static int count(Node root)
{
    if(root==null)
    {
        return 0;
    }
   int l= count(root.left);
  int r= count(root.right);
  return l+r+1;
}
    public static int countnodeval(Node root) {
        if (root == null) {
            return 0;
        }
        int l =countnodeval(root.left);
        int r = countnodeval(root.right);
        return l + r + root.val;
    }
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int l =height(root.left);
        int r = height(root.right);
        int m=Math.max(l,r);
        return m+1;
    }
public static void main(String[] args)
{
    int[] n={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    Binarytree bt=new Binarytree();
    Node root=bt.buildtree(n);
    System.out.println("root val"+root.val);
    preorder(root);
    System.out.println("inorder");
    inorder(root);
    System.out.println("postorder");
    postorder(root);
    System.out.println("levelorder");
    levelorder(root);
    System.out.println( count(root));
    System.out.println(  countnodeval(root));
    System.out.println(  height(root));
}
}
