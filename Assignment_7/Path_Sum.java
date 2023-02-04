package Assignment_7;

import java.util.*;
public class Path_Sum {

    static Scanner sacan = new Scanner(System.in);
    static int sbse_jyada =-9999999;
    public static void main(String[] args) {

        Node nodenew= input_lo(0);

        FunctionCall(nodenew);

        System.out.println(sbse_jyada);
    }
    static Node input_lo(int i){
        String ee= sacan.next();
        if(ee.equals("NULL"))
            return null;
        Node jagah=new Node(Integer.parseInt(ee) );
        jagah.left= input_lo(i+1);
        jagah.right= input_lo(i+1);
        return jagah;
    }
    private static int FunctionCall(Node naya_node){
        if(naya_node==null)
            return -9999999;
        if(naya_node.left==null&&naya_node.right==null)
            return naya_node.data;

        int ess1=FunctionCall(naya_node.left);
        int ess2=FunctionCall(naya_node.right);
        sbse_jyada =Math.max(Math.max(sbse_jyada,Math.max(ess1,ess2)),ess1+ess2+naya_node.data);

        return Math.max(Math.max(ess1,ess2)+naya_node.data,naya_node.data);
    }
    static void print(Node exxnode){
        if(exxnode==null)return;
        System.out.print(exxnode.data+" ");
        print(exxnode.left);
        print(exxnode.right);
    }

}
class Node {
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
    }
}
