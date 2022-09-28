package Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class Murthal_Parantha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nop = sc.nextInt();
        int noc = sc.nextInt();
        int[] arr = new int[noc];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(minimumtime(arr, nop));
    }
    public static int minimumtime(int[] ranks, int Parantha) {
        int l = 0;
        int h = (ranks[ranks.length - 1] * (Parantha * (Parantha + 1))) / 2;
        int ans = 0;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (isitpossible(ranks, mid, Parantha)) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] arr, int mid, int nop) {
        int paratha = 1;
        int time = 0;
        int p = 0;
        int i = 0;
        while (i < arr.length) {
            if (time + paratha * arr[i] <= mid) {
                time = time + paratha * arr[i];
                paratha++;
                p++;
            } else {
                i++;
                paratha = 1;
                time = 0;
            }
            if (p == nop) {
                return true;
            }
        }
        return false;
    }
}