package Assignment_7;

import java.util.*;
public class Level_OOrder {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
       Level_OOrder m = new Level_OOrder();
        BinaryTree bt = m.new BinaryTree();
        bt.levelOrderNewLine();
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node NodeRoot;
        private int size;

        public BinaryTree() {
            this.NodeRoot = this.takeInput(null, false);
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

        public void levelOrderNewLine() {

            // write your code here
            ArrayList<ArrayList<Integer>>uttar_arraylist=new ArrayList<>();
            Queue<Node>kyuu_arraylist=new LinkedList<>();

            if(NodeRoot==null){
                return;
            }

            //add something
            kyuu_arraylist.add(NodeRoot);

            //rstarting bfs
            while(!kyuu_arraylist.isEmpty()){

                //find the size pf queueAns will tell us no.of node at particular level
                int abhi_ka_size=kyuu_arraylist.size();

                //process these operation(remove,do something,process children)currLengthSize times
                ArrayList<Integer>abhi_ka_arraylist=new ArrayList<>();
                while(abhi_ka_size>0){
                    Node abhi_arraylist_node=kyuu_arraylist.poll();
                    abhi_ka_arraylist.add(abhi_arraylist_node.data);

                    //process children

                    if(abhi_arraylist_node.left!=null){
                        kyuu_arraylist.add(abhi_arraylist_node.left);
                    }

                    if(abhi_arraylist_node.right!=null){
                        kyuu_arraylist.add(abhi_arraylist_node.right);
                    }
                    abhi_ka_size-=1;
                }
                for(int i=0;i<abhi_ka_arraylist.size();i++){
                    System.out.print(abhi_ka_arraylist.get(i)+" ");
                }
                System.out.println();
                uttar_arraylist.add(abhi_ka_arraylist);

            }

        }

    }

}