import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class Node1 {
    int val;
    Node1 right;
    Node1 left;
    Node1(int val) {
        this.val = val;
    }
}
    public class preordertreetrav {
        Node1 root;
        public void add(int val) {
            Node1 n = new Node1(val);
            if (root == null) {
                root = n;
            }
            else {
                Node1 focusnode = root;
                Node1 parent;
                while (true) {
                    parent = focusnode;
                    if (focusnode.val < val) {
                        n = focusnode.right;
                        if (focusnode.right == null) {
                            parent.right = n;
                        }
                    }
                    if (focusnode.val > val) {
                        n = focusnode.left;
                        if (focusnode.left == null) {
                            parent.left = n;
                        }
                    }
                }
            }
        }

        public List<Integer> preOrderTraversal(Node1 root) {
            List<Integer> list = new ArrayList<Integer>();
            if (root == null)
                return list;
            Stack<Node1> s = new Stack<>();
            s.push(root);
            while(!s.empty())
            {
                s.pop();
                list.add(root.val);
                if(root.right==null)
                    s.push(root.right);
                if(root.left==null)
                    s.push(root.left);
            }
            return list;
        }


        public static void main(String[] args) {
            preordertreetrav tree = new preordertreetrav();

            tree.add(50);
            tree.add(25);
            tree.add(75);
            tree.add(12);
            tree.add(37);
            tree.add(43);
            tree.add(30);

            tree.preOrderTraversal(tree.root);
    }
}