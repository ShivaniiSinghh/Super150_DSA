package Assignment_2;

import java.util.Scanner;

public class Calculate_Sum_By_Rotate {
    public static void rotate(int n, int[] arr)
    {
        for (int j = 0; j < n; j++) {
            int t=arr.length;
            int temp=arr[t-1];
            for (int i = t-2; i >=0; i--) {
                arr[i+1]=arr[i];
            }
            arr[0]=temp;
        }
//        print(arr);
    }
    public static void print(int[] arr){
        for (int n:arr) {
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int nums[]=new int[k];
        for (int i = 0; i < k; i++) {
            nums[i]=sc.nextInt();
        }
        int nums1[]=arr.clone();

        for (int p:nums ) {
            rotate(p,arr);
            for (int i = 0; i < arr.length ; i++) {
                arr[i]+=nums1[i];
            }
            nums1=arr;
        }

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        System.out.println(sum % (int) (Math.pow(10,9)+7) );

    }
}