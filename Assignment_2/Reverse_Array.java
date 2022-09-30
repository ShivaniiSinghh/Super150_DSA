package Assignment_2;

import java.util.*;
public class Reverse_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr,n);
    }
    public static void reverse(int a[], int x){
        int [] b = new int[x];
        int j=x;
        for(int i=0;i<x;i++){
            b[j-1]=a[i];
            j--;
        }
        for(int k=0;k<x;k++){
            System.out.println(b[k]);
        }
    }
}
