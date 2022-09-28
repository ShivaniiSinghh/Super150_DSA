package Assignment_2;

import java.util.Scanner;

public class Max_Cir_Sum {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();

        while(k >0)

        {
            int n;
            n=sc.nextInt();
            int arr[]=new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int p= subarraymax(arr);
            int t=0;
            for(int i=0;i<arr.length;i++)
            {
                t+=arr[i];

                arr[i]=arr[i]*(-1);
            }
            int a= subarraymax(arr);
            int b=t+a;
            System.out.println(Math.max(p,b));
            k--;}}

    public static int subarraymax(int arr[])
    {
        int curr =0;
        int m =0;
        for(int i=0;i<arr.length;i++)
        {
            curr +=arr[i];
            if(curr > m)
            {
                m = curr;
            }
            if(curr <0)
            {
                curr =0;
            }
        }
        return m;
    }
}