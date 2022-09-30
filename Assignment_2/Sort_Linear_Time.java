package Assignment_2;

import java.util.*;

public class Sort_Linear_Time {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int s[] = sort(arr, max);
        for (int t : s) {
            System.out.print(t+" ");
        }
    }
    public static int[] sort(int arr[], int k) {
        int count[] = new int[k+1];
        int b[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ++count[arr[i]];
        }
        for (int i = 1; i <= k; i++) {
            count[i] = count[i] + count[i - 1];
        }
        for (int i = arr.length - 1; i > -1; i--) {
            b[--count[arr[i]]] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = b[i];
        }
        return arr;
    }
}

