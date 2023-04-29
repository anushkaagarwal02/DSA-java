import java.util.Scanner;

class node1
{
    node1 left;
    node1 right;
    int val;
    node1(int val)
    {
        this.val=val;
    }
}
public class createtree
{  static Scanner s=null;
    public static node1 createtree()
{
    System.out.println("enter data");
    int val=s.nextInt();
    if(val==-1)
    {
  return null;
    }
    node1 root=new node1(val);
    System.out.println("enter val to left of"+val);
    root.left=createtree();
    System.out.println("enter val to right of"+val);
    root.right=createtree();
    return root;
}
    public static void traverseInOrder(node1 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.val);
            traverseInOrder(node.right);
        }
    }
    public static void main(String[] args)
    { s=new Scanner(System.in);
        node1 root=createtree();
        traverseInOrder(root);
    }
}

