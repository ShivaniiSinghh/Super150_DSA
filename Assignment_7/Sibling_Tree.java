package Assignment_7;

import java.util.*;
public class Sibling_Tree {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
       Sibling_Tree m = new Sibling_Tree();
        BinaryTree bt = m.new BinaryTree();
        bt.sibling_ka_jghNode();
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node NodeRoot;
        private int size;

        public BinaryTree() {
            this.NodeRoot = this.takeInput(null, false);
        }

        public Node takeInput(Node parent, boolean ilc) {

            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;

            // left
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.takeInput(child, true);
            }

            // right
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.takeInput(child, false);
            }

            // return
            return child;
        }

        public void sibling_ka_jghNode() {
            this.sibling_ka_jghNode(this.NodeRoot);
        }

        private void sibling_ka_jghNode(Node root_ka_node) {
            if(root_ka_node==null){
                return;
            }
            if(root_ka_node.left!=null && root_ka_node.right==null){
                System.out.print(root_ka_node.left.data+" ");
            }
            if(root_ka_node.right!=null && root_ka_node.left==null){
                System.out.print(root_ka_node.right.data+" ");
            }
            sibling_ka_jghNode(root_ka_node.left);
            sibling_ka_jghNode(root_ka_node.right);
        }

    }

}
