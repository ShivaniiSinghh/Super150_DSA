package Assignment_7;

import java.util.*;
public class Traversal {

    static Scanner scann = new Scanner(System.in);

    public static void main(String[] args) {
        Traversal emm = new Traversal();
        BinaryTree beetee1 = emm.new BinaryTree();
        ArrayList<Integer> nnumm=new ArrayList<>();
        nnumm=beetee1.lArrayLevelList();
        for(int i=0;i<nnumm.size();i++){
            System.out.print(nnumm.get(i)+" ");
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
            this.root = this.input_lelo(null, false);
        }

        public Node input_lelo(Node parent, boolean ilc) {

            int seedata = scann.nextInt();
            Node child = new Node();
            child.data = seedata;
            this.size++;

            // left
            boolean hlc = scann.nextBoolean();

            if (hlc) {
                child.left = this.input_lelo(child, true);
            }

            // right
            boolean hrc = scann.nextBoolean();

            if (hrc) {
                child.right = this.input_lelo(child, false);
            }

            // return
            return child;
        }

        public ArrayList<Integer> lArrayLevelList() {

            // write your code here
            ArrayList<Integer>uttar=new ArrayList<>();
            Queue<Node>kyuuu=new LinkedList<>();

            if(root==null){
                return uttar;
            }

            //add something
            kyuuu.add(root);

            //rstarting bfs
            while(!kyuuu.isEmpty()){

                //find the size pf queue will tell us no.of node at particular level
                int abhi_ka_size=kyuuu.size();

                //process these operation(remove,do something,process children)currentsize times

                while(abhi_ka_size>0){
                    Node abhi_ka_node=kyuuu.poll();
                    uttar.add(abhi_ka_node.data);

                    //process children


                    if(abhi_ka_node.right!=null){
                        kyuuu.add(abhi_ka_node.right);
                    }
                    if(abhi_ka_node.left!=null){
                        kyuuu.add(abhi_ka_node.left);
                    }
                    abhi_ka_size-=1;
                }

            }
            Collections.reverse(uttar);
            return uttar;
        }

    }

}