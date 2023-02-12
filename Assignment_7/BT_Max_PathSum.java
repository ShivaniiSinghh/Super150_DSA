package Assignment_7;

import java.util.*;
public class BT_Max_PathSum {
        Scanner sacann = new Scanner(System.in);
        static class Node {
            int data;
            Node ulta;
            Node seeedha;

        }
        static private Node root;
        static int rizzz =Integer.MIN_VALUE;
    BT_Max_PathSum()
        {
            TreeBanao1();
        }
        private void TreeBanao1()
        {
            Queue<Node> kyuuu= new LinkedList<>();
            int aitam = sacann.nextInt();
            Node eenn = new Node();
            eenn.data = aitam;
            this.root= eenn;
            kyuuu.add(eenn);
            while(!kyuuu.isEmpty()){
                Node rv = kyuuu.remove();
                int enn1 = sacann.nextInt();
                int enn2 = sacann.nextInt();
                if(enn1!= -1)
                {
                    Node nnnn = new Node();
                    nnnn.data= enn1;
                    rv.ulta = nnnn;
                    kyuuu.add(nnnn);
                }
                if(enn2 != -1)
                {
                    Node ennnnn = new Node();
                    ennnnn.data = enn2;
                    rv.seeedha = ennnnn;
                    kyuuu.add(ennnnn);
                }

            }
        }

        public int sabseJyadaRasteGuna(Node root)
        {
            ehhtee(root);
            return rizzz;
        }

        public int ehhtee(Node ennn)
        {
            if(ennn == null)
                return -1;

            int ellehh = Math.max(0, ehhtee(ennn.ulta));
            int arrehh = Math.max(0, ehhtee(ennn.seeedha));
            rizzz = Math.max(rizzz,ellehh+arrehh+ennn.data);
            return Math.max(ellehh,arrehh)+ennn.data;
        }
        public static void main (String args[]) {
            BT_Max_PathSum maaaal = new BT_Max_PathSum();
            System.out.print(maaaal.sabseJyadaRasteGuna(root));
        }
    }
