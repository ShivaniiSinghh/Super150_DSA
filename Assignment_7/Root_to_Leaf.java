package Assignment_7;

import java.util.*;
@SuppressWarnings("unchecked")
public class Root_to_Leaf {
    public class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;


    public Root_to_Leaf() {
        this.root = Create_Tree();
    }
    static int sum_Total =0;
    private Node Create_Tree() {
        Scanner scnn = new Scanner(System.in);
        Queue<Node> kyuu = new LinkedList<>();
        Node enn = new Node();
        enn.data = scnn.nextInt();
        root = enn;
        kyuu.add(enn);
        while (!kyuu.isEmpty()) {
            Node exx = kyuu.remove();
            int see1 = scnn.nextInt();
            int see2 = scnn.nextInt();
            if (see1 != -1) {
                Node node = new Node();
                node.data = see1;
                exx.left = node;
                kyuu.add(node);
            }
            if (see2 != -1) {
                Node node = new Node();
                node.data = see2;
                exx.right = node;
                kyuu.add(node);
            }
        }
        sum_Total =scnn.nextInt();
        return root;
    }



    public void Path_root_se_leaf(Node root) {


        List<Integer> ell2=new ArrayList();
        List<List<Integer>>uttar=new ArrayList<>();
        raasta_LL(root, sum_Total,ell2,uttar);
        System.out.println(uttar.size());
    }
    public void raasta_LL(Node root, int sum_Total, List<Integer> ell2, List<List<Integer>>uttar)
    {
        if(root==null)
        {
            return;
        }
        ell2.add(root.data);
        if(root.left==null && root.right==null)
        {
            if(sum_Total-root.data==0)
            {
                uttar.add(new ArrayList(ell2));
                return;
            }
        }

        if(root.left!=null)
        {
            raasta_LL(root.left,sum_Total-root.data,ell2,uttar);
            ell2.remove(ell2.size()-1);
        }
        if(root.right!=null)
        {
            raasta_LL(root.right,sum_Total-root.data,ell2,uttar);
            ell2.remove(ell2.size()-1);
        }
    }
    public static void main(String[] args) {
        Root_to_Leaf obj = new Root_to_Leaf();

        obj.Path_root_se_leaf(obj.root);
    }
}