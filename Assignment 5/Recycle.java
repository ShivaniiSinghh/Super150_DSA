package Assignment_5;

import java.util.*;
public class Recycle{
    public static int lar_REct(int[] he) {
        int lenth = he.length;
        Stack<Integer> stac = new Stack<>();
        int max_ara = 0;
        for (int i = 0; i <= lenth; i++){
            int h = (i == lenth ? 0 : he[i]);
            if (stac.isEmpty() || h >= he[stac.peek()]) {
                stac.push(i);
            } else {
                int tp = stac.pop();
                max_ara = Math.max(max_ara, he[tp] * (stac.isEmpty() ? i : i - 1 - stac.peek()));
                i--;
            }
        }
        return max_ara;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int rrr[]=new int [y];
        for(int i=0;i<rrr.length;i++){
            rrr[i]=sc.nextInt();
        }
        System.out.println(lar_REct(rrr));
    }
}