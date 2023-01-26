package Assignment_3;

import java.util.Scanner;

public class SubarrayProd_less_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Product(arr,k);
    }

    public static void Product(int [] array,int k){
        int count = 0;
        int i, j, mul;

        for (i = 0; i < array.length; i++) {
            if (array[i] < k)
                count++;

            mul = array[i];

            for (j = i + 1; j < array.length; j++) {
                mul = mul * array[j];
                if (mul < k)
                    count++;
                else
                    break;
            }
        }

        System.out.println(count);
    }
}

