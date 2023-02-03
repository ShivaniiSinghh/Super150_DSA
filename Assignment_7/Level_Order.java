package Assignment_7;

import java.util.*;
public class Level_Order {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Level_Order m = new Level_Order();
        BinaryTree bt = m.new BinaryTree();
        List<List<Integer>> ans=bt.levelOrderZigZag();
        for(int i=0;i<ans.size();i++)
        {
            for(int j=0;j<ans.get(i).size();j++)
            {
                System.out.print(ans.get(i).get(j)+" ");
            }
        }

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

        public List<List<Integer>> levelOrderZigZag() {

            if (root == null) {
                return new ArrayList<>();
            }

            boolean ulta = true;
            Queue<Node> kyyu= new LinkedList<>();
            List<List<Integer>>farzi= new ArrayList<>();
            kyyu.add(root);
            while (!kyyu.isEmpty()) {
                int size = kyyu.size();
                List<Integer> karzi = new ArrayList<>();
                while (size != 0) {
                    Node abhi_wala_node = kyyu.remove();
                    karzi.add(abhi_wala_node.data);

                    if (abhi_wala_node.left != null) {
                        kyyu.add(abhi_wala_node.left);
                    }
                    if (abhi_wala_node.right != null) {
                        kyyu.add(abhi_wala_node.right);
                    }
                    size--;
                }

                if (!ulta) {
                    Collections.reverse(karzi);
                }
                ulta = !ulta;
                farzi.add(karzi);
            }

            return farzi;
        }

    }

}