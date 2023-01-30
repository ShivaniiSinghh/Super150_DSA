package Assignment_5;

import java.util.*;
public class Stock_Span {
    public static void main(String args[])  {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int []arrr= new int[p];
        for(int i=0;i<p;i++)
        {
            arrr[i]= scan.nextInt();
        }
        Stack<Integer> stac= new Stack<>();
        int rss[] = new int[p];
        for(int i=0;i<p;i++)
        {
            while(!stac.isEmpty() && arrr[i]>=arrr[stac.peek()])
            {
                stac.pop();
            }
            if(!stac.isEmpty())
            {
                rss[i]= i-stac.peek();

            }
            else
            {
                rss[i]=i+1;
            }
            stac.push(i);
        }
        for(int i:rss)
        {
            System.out.print(i+" ");
        }
        System.out.print("END");
    }
}
