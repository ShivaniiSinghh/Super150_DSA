package Assignment_3;

import java.util.Scanner;

public class Form_Biggest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            Largest(arr);
            t--;
        }
    }

    public static void Largest(int [] arr){

        String [] str=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            str[i]=String.valueOf(arr[i]);
        }
        int min=0;
        for(int i=0;i<arr.length;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++) {
                String s1=str[min]+str[j];
                String s2=str[j]+str[min];
                if(s2.compareTo(s1)>0){  //if s2 is lexicographically greater than s1
                    min=j;
                }
            }
            String s=str[min];
            str[min]=str[i];
            str[i]=s;
        }

        String str3="";
        for(int i=0;i<arr.length;i++){
            str3+=str[i];
        }
        System.out.println(str3);
    }

}

