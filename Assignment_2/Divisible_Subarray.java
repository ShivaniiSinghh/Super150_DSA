package Assignment_2;

import java.util.*;
public class Divisible_Subarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] arr = new int[n];
            int [] freq = new int[n];
            long sum=0;
            freq[0]=1;
            for(int i=0;i<freq.length;i++) {
                arr[i]=sc.nextInt();
                sum = sum + arr[i];
                int idx =(int)(sum%n);
                if(idx<0){
                    idx+=n;
                }
                freq[idx]=freq[idx]+1;
            }
            long ans=0;
            for(int i=0;i<freq.length;i++){
                if(freq[i]>=2){
                    long p = freq[i];
                    ans=ans+(p*(p-1))/2;
                }
            }
            System.out.println(ans);
            t--;
        }
    }
}
