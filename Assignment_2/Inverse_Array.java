package Assignment_2;

import java.util.*;
public class Inverse_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int t = a[i];
            b[t] = i;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
