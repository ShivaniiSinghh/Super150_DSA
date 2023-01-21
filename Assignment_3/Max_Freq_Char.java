package Assignment_3;

import java.util.Scanner;

public class Max_Freq_Char{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(s.charAt(freq(s)));
    }

    public static int freq(String a){
        int l=a.length();
        int [] f= new int[26];
        for(int i=0;i<l;i++){
            f[a.charAt(i)-'a']++;
        }
        int m=0,res=0;
        for(int i=0;i<l;i++){
            int in=a.charAt(i)-'a';
            if(f[in]>m){
                m=f[in];
                res=i;
            }
        }
        return res;
    }
}