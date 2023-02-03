package Assignment_7;
    import java.util.*;
    public class Lowest_Common_Ancestor {
        static Scanner dcc = new Scanner(System.in);

        public static void main(String[] args) {
            Lowest_Common_Ancestor m = new Lowest_Common_Ancestor();
            BinaryTree binaryyTree = m.new BinaryTree();

            System.out.println(binaryyTree.call().data);
        }

        private class BinaryTree {
            private class Node {
                int data;
                Node left;
                Node right;
            }

            private Node root;
            private int size;
            int h, i;
            public BinaryTree() {
                this.root = this.getInputt(null, false);
                h = dcc.nextInt();
                i = dcc.nextInt();
            }

            private Node getInputt(Node papa, boolean lic) {

                int cd = dcc.nextInt();
                Node beta = new Node();
                beta.data = cd;
                this.size++;

                // left
                boolean lhc = dcc.nextBoolean();

                if (lhc) {
                    beta.left = this.getInputt(beta, true);
                }

                // right
                boolean hrc = dcc.nextBoolean();

                if (hrc) {
                    beta.right = this.getInputt(beta, false);
                }

                // return
                return beta;
            }
            public Node call() {
                return this.call(this.root, h, i) ;
            }
            private Node call(Node root, int a, int b) {
                if(root==null){
                    return root;
                }
                if(root.data==a || root.data==b){
                    return root;

                }
                Node ultitrf= call(root.left,a,b);
                Node seedhitrf= call(root.right,a,b);
                if(ultitrf!=null && seedhitrf!=null){
                    return root;
                }
                else if(ultitrf!=null){
                    return ultitrf;
                }
                else{
                    return seedhitrf;
                }
            }
        }
    }

