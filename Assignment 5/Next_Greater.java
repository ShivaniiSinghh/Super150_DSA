package Assignment_5;

import java.util.*;

public class Next_Greater {
    public static void main(String[] args) {
        Scanner scasn = new Scanner(System.in);
        int m = scasn.nextInt();
        while (m > 0) {
            int o = scasn.nextInt();
            int[] rrr = new int[o];
            for (int i = 0; i < rrr.length; i++)
                rrr[i] = scasn.nextInt();
            gret_NUM(rrr,o);
            m--;
        }
    }
    // Function to print Next Greater Element for each element of the array
    public static void gret_NUM(int[] arrr, int k) {
        Stack<Integer> stac= new Stack<>();
        int ans[] =new int[k];
        for(int i=0;i<k;i++)
        {
            while(!stac.isEmpty() && arrr[i]>arrr[stac.peek()])
            {
                ans[stac.peek()]=arrr[i];
                stac.pop();
            }
            stac.push(i);
        }
        while(!stac.isEmpty())
        {
            ans[stac.peek()]=-1;
            stac.pop();
        }
        for(int i=0;i<k;i++)
        {
            System.out.println(arrr[i]+","+ans[i]);
        }
    }
}
