package Assignment_2;

import java.util.*;

public class Painter_Partition
{       static int totalSum(int array[], int start, int end)
    {
        int sum = 0;
        for (int i = start; i <= end; i++)
            sum += array[i];
        return sum;
    }


    static int partition(int arr[], int n, int k)
    {
        if (k == 1)
            return totalSum(arr, 0, n - 1);
        if (n == 1)
            return arr[0];
        int b = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++)
            b = Math.min(b, Math.max(partition(arr, i, k - 1),
                    totalSum(arr, i, n - 1)));
        return b;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int k =sc.nextInt();
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(partition(arr, n, k));
    }
}