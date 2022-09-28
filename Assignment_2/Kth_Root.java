package Assignment_2;

import java.util.*;
public class Kth_Root {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            int k=sc.nextInt();
            System.out.println(Root(n,k));
            t--;
        }
    }
    public static long Root(long n,int k){
        int low=1;
        long high=n;
        long ans=0;

        while(low<=high){
            int mid= (int) ((low+(high-low)/2));
            if(Math.pow(mid,k)<=n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
