package Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_Roses
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int a = 0; a < t; a++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            int nums=sc.nextInt();
            int p1=0,p2=0;
            int min=Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(arr[i]+arr[j]==nums && i!=j) {
                        if(min>Math.abs(arr[i]-arr[j]))
                        {
                            min=Math.abs(arr[i]-arr[j]);
                            p1=arr[i];
                            p2=arr[j];
                        }
                    }
                }
            }
            System.out.println("Deepak should buy roses whose prices are "+p1+" and "+p2+".");
        }
    }
}