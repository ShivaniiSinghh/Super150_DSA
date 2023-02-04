package Assignment_7;

import java.util.*;
public class Remove_Leave{

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Remove_Leave m = new Remove_Leave();
        BinaryTree bt = m.new BinaryTree();
        bt.removesLeaf();
        bt.display();
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree() {
            this.root = this.takeInput(null, false);
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

        public void display() {
            this.display(this.root);
        }

        private void display(Node node) {
            if (node == null) {
                return;
            }

            String str = "";

            if (node.left != null) {
                str += node.left.data;
            } else {
                str += "END";
            }

            str += " => " + node.data + " <= ";

            if (node.right != null) {
                str += node.right.data;
            } else {
                str += "END";
            }

            System.out.println(str);

            this.display(node.left);
            this.display(node.right);
        }

        public void removesLeaf() {
            this.removesLeaf(null, this.root, false);
        }

        private void removesLeaf(Node parent_ka_node, Node child_ka_node, boolean patti_hai) {
            if(child_ka_node==null){
                return;
            }
            if(child_ka_node.left==null && child_ka_node.right==null){
                if(patti_hai==true){
                    parent_ka_node.left=null;
                }
                else{
                    parent_ka_node.right=null;
                }
                return;

            }

            removesLeaf(child_ka_node,child_ka_node.left,true);
            removesLeaf(child_ka_node,child_ka_node.right,false);
        }

    }

}