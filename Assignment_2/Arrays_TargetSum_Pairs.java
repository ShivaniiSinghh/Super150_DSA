package Assignment_2;

import java.util.*;
public class Arrays_TargetSum_Pairs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        Arrays.sort(arr);
        int i=0,j=0;
        while(i<n && j<n){
            if(arr[i]+arr[j]==tar){
                System.out.println(arr[i]+" and "+arr[j]);
                i++;
                j=i+1;
            }
            else if(arr[i]+arr[j]<tar && j<n-1)
            {
                j++;
            }
            else{
                i++;
                j=i+1;
            }
        }
    }
}
