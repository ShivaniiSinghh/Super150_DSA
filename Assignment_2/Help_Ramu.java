package Assignment_2;

import java.util.Scanner;

public class Help_Ramu {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int p = sc.nextInt();// Rickshaw
            int q = sc.nextInt();// Cab
            int nums[] = new int[p];
            int nums1[] = new int[q];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = sc.nextInt();
            }
            int tr = 0;
            int tc = 0;
            for (int i = 0; i < nums.length; i++) {
                tr += Math.min(nums[i] * a, b);
            }
            for (int i = 0; i < nums1.length; i++) {
                tc += Math.min(nums1[i] * a, b);

            }
            tr = Math.min(tr, c);
            tc = Math.min(tc, c);
            int ans = Math.min(d, tc + tr);
            System.out.println(ans);
        }
    }
}