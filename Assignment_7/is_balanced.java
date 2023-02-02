package Assignment_7;

import java.util.*;
public class is_balanced {

    static Scanner scn = new Scanner(System.in);
    static boolean check = true;

    public static void main(String[] args) {
       is_balanced m = new is_balanced();
        BinaryTree bt = m.new BinaryTree();
        System.out.println(bt.isBalanced());
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

        public boolean isBalanced() {
            return this.isBalanced(this.root).isBalanced;
        }

        private BalancedPair isBalanced(Node node) {
            // write your code here
            BalancedPair payer = new BalancedPair();
            payer.height = balancecheck(root,0);
            payer.isBalanced = check;
            return payer;
        }

        private int balancecheck(Node root,int gehrai){
            if(root == null)
                return gehrai;

            int ulta= balancecheck(root.left,gehrai+1);
            int seedha= balancecheck(root.right,gehrai+1);

            if(Math.abs(ulta-seedha)>1)
                check = false;

            return Math.max(ulta,seedha);
        }

        private class BalancedPair {
            int height;
            boolean isBalanced;
        }

    }
}