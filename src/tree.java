class Node {
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
    }

}
public class tree {
    Node root;
    public void add(int val) {
        Node n = new Node(val);
        if (root == null) {
            root = n;
        } else {
            Node focusnode = root;
            Node parent;
            while (true) {
                parent = focusnode;
                if (val < focusnode.val) {
                    focusnode = focusnode.left;
                    if (focusnode == null) {
                        parent.left = n;
                        return;
                    }
                } else {
                        focusnode = focusnode.right;
                        if (focusnode == null) {
                            parent.right = n;
                            return;
                        }
                    }
                }
            }
        }

    public static void main(String[] args)
    {
        tree tree = new tree();

        tree.add(50);
        tree.add(25);
        tree.add(75);
        tree.add(12);
        tree.add(37);
        tree.add(43);
        tree.add(30);

        tree.preOrderTraversal(tree.root);
    }


    public void preOrderTraversal(Node focusNode) {
        if (focusNode != null) {
            System.out.print(focusNode.val + " ");
            preOrderTraversal(focusNode.left);
            preOrderTraversal(focusNode.right);
        }
    }


}

