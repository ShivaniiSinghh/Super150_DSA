package Assignment_7;

import java.util.*;
public class Mirror_Tree {
    public class Node {
        int data;
        Node left;
        Node right;
    }

    public Node root;
    Scanner scnn = new Scanner(System.in);

    public Mirror_Tree() {
        this.root = Create_Tree();
    }

    private Node Create_Tree() {
        Queue<Node> kyu = new LinkedList<>();
        Node enn = new Node();
        enn.data = scnn.nextInt();
        root = enn;
        kyu.add(enn);
        while (!kyu.isEmpty()) {
            Node exx = kyu.remove();
            int see1 = scnn.nextInt();
            int see2 = scnn.nextInt();
            if (see1 != -1) {
                Node node = new Node();
                node.data = see1;
                exx.left = node;
                kyu.add(node);
            }
            if (see2 != -1) {
                Node node = new Node();
                node.data = see2;
                exx.right = node;
                kyu.add(node);
            }
        }
        return root;
    }


    static boolean mirrortree(Node h,Node j)
    {
        if(h==null && j==null)
        {
            return true;
        }
        if(h==null || j==null || h.data!=j.data)
        {
            return false;
        }


        boolean ulta=mirrortree(h.left,j.right);
        boolean seedha=mirrortree(h.right,j.left);

        return ulta && seedha;
    }

    public static void main(String[] args) {
        Mirror_Tree obj = new Mirror_Tree();
        if(mirrortree(obj.root,obj.root))
        {
            System.out.println("YES");
        }
        else
        {

            System.out.println("NO");
        }
    }
}