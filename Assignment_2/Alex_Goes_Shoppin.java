package Assignment_2;

import java.util.*;
public class Alex_Goes_Shoppin {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int t = sc.nextInt();
        while(t-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            for(int i=0; i<n; i++)
            {
                if(a%arr[i] == 0)
                {
                    count++;
                }
            }
            if(count>=b)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}