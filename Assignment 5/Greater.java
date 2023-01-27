package Assignment_5;

import java.util.*;
public class Greater {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int arrr[] = new int[p];
        for(int i=0;i<p;i++)
        {
            arrr[i]= scan.nextInt();
        }
        Stack<Integer> stac= new Stack<>();
        int s[] = new int[p];
        for(int i=0;i<2*p;i++)
        {
            while(!stac.isEmpty() && arrr[i%p]>arrr[stac.peek()])
            {
                s[stac.peek()]=arrr[i%p];
                stac.pop();
            }
            if(i<p)
            {
                stac.push(i%p);
            }
        }
        while(!stac.isEmpty())
        {
            s[stac.pop()]=-1;
        }
        for(int i:s)
        {
            System.out.print(i+" ");
        }
    }
}