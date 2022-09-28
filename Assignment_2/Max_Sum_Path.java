package Assignment_2;

 import java.util .*;
import java.lang.Math;
public class Max_Sum_Path {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int nums = sc.nextInt();
            int nums1 = sc.nextInt();
            int arr[] = new int[nums];
            int arr1[] = new int[nums1];
            for (int i = 0; i < nums; i++) {
                arr[i] = sc.nextInt();
            }
            for (int j = 0; j < nums1; j++) {
                arr1[j] = sc.nextInt();
            }
            int s1 = 0, s2 = 0, total = 0;
            int i = 0, j = 0;
            while (i < arr.length && j < arr1.length) {
                if (arr[i] < arr1[j]) {
                    s1 += arr[i];
                    i++;
                } else if (arr[i] > arr1[j]) {
                    s2 += arr1[j];
                    j++;
                } else if (arr[i] == arr1[j]) {
                    total += arr[i];
                    total += Math.max(s1, s2);
                    s1 = 0;
                    s2 = 0;
                    i++;
                    j++;
                }
            }
            while (i < arr.length) {
                s1 += arr[i];
                i++;
            }
            while (j < arr1.length) {
                s2 += arr1[j];
                j++;
                }
            total += Math.max(s1, s2);
            System.out.println(total);
        }
    }
}

