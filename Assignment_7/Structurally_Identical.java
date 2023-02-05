package Assignment_7;

import java.util.*;
public class Structurally_Identical {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Structurally_Identical m = new Structurally_Identical();
        BinaryTree bt1 = m.new BinaryTree();
        BinaryTree bt2 = m.new BinaryTree();
        System.out.println(bt1.structurallyIdentical(bt2));
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

        public boolean structurallyIdentical(BinaryTree other) {
            return this.structurallyIdentical(this.root, other.root);
        }

        private boolean structurallyIdentical(Node pii, Node kyyu) {
            // write your code here
            if(pii==null && kyyu==null){
                return true;
            }
            if(pii==null || kyyu==null || pii.data==kyyu.data){
                return true;
            }

            if(pii==null || kyyu==null || pii.data!=kyyu.data){
                return false;
            }
            return structurallyIdentical(pii.left,kyyu.left) && structurallyIdentical(pii.right,kyyu.right);
        }

    }
}