package Assignment_2;

import java.util.*;
public class Arrays_Linear_Search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n;i++){
            a[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int flag=0;
        for(int i=0; i<n;i++){
            if(a[i]==m){
                System.out.println(i);
                flag++;
            }
        }
        if(flag==0)
            System.out.println("-1");
    }
}

