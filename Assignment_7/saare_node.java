package Assignment_7;

import java.util.*;
public class saare_node {
    public class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sacan = new Scanner(System.in);

    public saare_node() {
        this.root = bnao_tree();
    }

    private Node bnao_tree() {
        Queue<Node> kyyuu = new LinkedList<>();
        Node enn = new Node();
        enn.data = sacan.nextInt();
        root = enn;
        kyyuu.add(enn);
        while (!kyyuu.isEmpty()) {
            Node exx = kyyuu.remove();
            int see1 = sacan.nextInt();
            int see2 = sacan.nextInt();
            if (see1 != -1) {
                Node node = new Node();
                node.data = see1;
                exx.left = node;
                kyyuu.add(node);
            }
            if (see2 != -1) {
                Node node = new Node();
                node.data = see2;
                exx.right = node;
                kyyuu.add(node);
            }
        }
        return root;
    }


    private static void Print_kro(Node root)
    {
        if(root.left==null && root.right==null)
        {
            System.out.print(root.data+" ");
        }

        if(root.left!=null)
        {
            Print_kro(root.left);
        }
        if(root.right!=null)
        {
            Print_kro(root.right);
        }

    }

    public static void main(String[] args) {
        saare_node obj = new saare_node();
        Print_kro(obj.root);
    }
}