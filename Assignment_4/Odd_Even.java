package Assignment_4;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        print(p);
    }
    public static void print(int p){
        if(p==0){
            return ;
        }
        if(p%2!=0){
            System.out.println(p);

        }
        print(p-1);

        if(p%2==0){
            System.out.println(p);
        }
    }
}