package Assignment_7;

import java.util.*;
public class ArrayList_of_Levels {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList_of_Levels m = new ArrayList_of_Levels();
        BinaryTree bt1 = m.new BinaryTree();
        System.out.println(bt1.levelArrayList());
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

        public ArrayList<ArrayList<Integer>> levelArrayList() {

            // write your code here
            ArrayList<ArrayList<Integer>>uttar=new ArrayList<>();
            Queue<Node> kyuu=new LinkedList<>();

            if(root==null){
                return uttar;
            }

            //add something
            kyuu.add(root);

            //rstarting bfs
            while(!kyuu.isEmpty()){

                //find the size pf kyuu will tell us no.of node at particular level
                int abhi_ka_size=kyuu.size();

                //process these operation(remove,do something,process children)currentsize times
                ArrayList<Integer> abhi_ka_lvl=new ArrayList<>();

                while(abhi_ka_size>0){
                    Node abhi_ka_node=kyuu.poll();
                     abhi_ka_lvl.add(abhi_ka_node.data);

                    //process children

                    if(abhi_ka_node.left!=null){
                        kyuu.add(abhi_ka_node.left);
                    }

                    if(abhi_ka_node.right!=null){
                        kyuu.add(abhi_ka_node.right);
                    }
                    abhi_ka_size-=1;
                }
                uttar.add( abhi_ka_lvl);

            }
            return uttar;
        }

    }

}
