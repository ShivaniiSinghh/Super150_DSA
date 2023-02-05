package Assignment_7;

import java.util.*;
public class Sum_Bin_Tree {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Sum_Bin_Tree emm = new Sum_Bin_Tree();
        BinaryTree beetee = emm.new BinaryTree();
        System.out.println(beetee.Node_ka_Sum());
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

        public Node takeInput(Node papa, boolean lic) {

            int seedata = scn.nextInt();
            Node beta = new Node();
            beta.data = seedata;
            this.size++;

            // left
            boolean lhc = scn.nextBoolean();

            if (lhc) {
                beta.left = this.takeInput(beta, true);
            }

            // right
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                beta.right = this.takeInput(beta, false);
            }

            // return
            return beta;
        }
        public int Node_ka_Sum() {
            return this.Node_ka_Sum(this.root) ;
        }

        private int Node_ka_Sum(Node node) {

            if(node == null)
            {
                return 0;
            }

            int ellennn = Node_ka_Sum(node.left);
            int arrenn = Node_ka_Sum(node.right);

            return ellennn + arrenn + node.data;

        }
    }
}