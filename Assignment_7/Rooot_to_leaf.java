package Assignment_7;

import java.util.*;
public class Rooot_to_leaf {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Rooot_to_leaf emm = new Rooot_to_leaf();
        BinaryTree beetee1 = emm.new BinaryTree();
        beetee1.raasta_root_se_leaf();
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

        public Node input_lelo(Node papa, boolean ulta) {

            int seedata = scanner.nextInt();
            Node beat = new Node();
            beat.data = seedata;
            this.size++;

            // left
            boolean hulta = scanner.nextBoolean();

            if (hulta) {
                beat.left = this.input_lelo(beat, true);
            }

            // right
            boolean hrc = scanner.nextBoolean();

            if (hrc) {
                beat.right = this.input_lelo(beat, false);
            }

            // return
            return beat;
        }
        public void raasta_root_se_leaf(){
            raasta_root_se_leaf(this.root,scanner.nextInt(),0,"");
        }
        private void raasta_root_se_leaf(Node jagah, int kayy, int guna, String path_ka_raasta){
            if(jagah == null){
                return;
            }
            if(jagah.left == null && jagah.right == null){
                guna += jagah.data;
                if(guna == kayy){
                    System.out.println(path_ka_raasta + jagah.data);
                }
                return;
            }
            raasta_root_se_leaf(jagah.left,kayy,guna+jagah.data,path_ka_raasta+jagah.data+" ");
            raasta_root_se_leaf(jagah.right,kayy,guna+jagah.data,path_ka_raasta+jagah.data+" ");
        }
    }

}
