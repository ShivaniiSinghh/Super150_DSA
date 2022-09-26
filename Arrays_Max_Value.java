package Assignment_2;

import java.util.*;
public class Arrays_Max_Value {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        max(arr);
    }
    public static void max(int a[]){
        int max = a[0];
        for(int k=0;k<a.length;k++){
            if(a[k]>max){
                max=a[k];
            }
        }
        System.out.println(max);
    }
}

