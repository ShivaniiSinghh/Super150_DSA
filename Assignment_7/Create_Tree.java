package Assignment_7;

import java.util.*;
public class Create_Tree {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Create_Tree m = new Create_Tree();
        int[] preorder= takeInput();
        int[] inorder= takeInput();
        BinaryTree bt = m.new BinaryTree(preorder, inorder);
        bt.display();
    }

    public static int[] takeInput() {
        int n = scn.nextInt();

        int[] rv = new int[n];
        for (int i = 0; i < rv.length; i++) {
            rv[i] = scn.nextInt();
        }

        return rv;
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree(int[] preorder, int[] inorder) {
            this.root = this.construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        }
        int preind=0;
        private Node construct(int[] preorder, int plo, int phi, int[] inorder, int ilo, int ihi) {
            if(plo>phi || ilo>ihi)
                return null;
            Node naya_node=new Node();
            naya_node.data=preorder[plo];
            int jgh = search(inorder, ilo, ihi, naya_node.data);
            int guna=jgh-ilo;
            naya_node.left=construct(preorder,plo+1,plo+guna,inorder,ilo,jgh-1);
            naya_node.right=construct(preorder,plo+guna+1,phi,inorder,jgh+1,ihi);
            return naya_node;
            // write your code here
        }
        int search(int arr[], int strt, int end, int value)
        {
            int i;
            for (i = strt; i <= end; i++) {
                if (arr[i] == value)
                    return i;
            }
            return i;
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

    }

}