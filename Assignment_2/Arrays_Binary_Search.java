package Assignment_2;

import java.util.*;
import java.util.Arrays;
public class Arrays_Binary_Search {
    public static int search(int[] nums, int target){
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-1)/2;
            if(nums[mid]>target)
                r=mid-1;
            else if(nums[mid]<target)
                l=mid+1;
            else if(nums[mid]==target)
                return mid;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] a =  new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int q = search(a,t);
        System.out.println(q);
    }
}
