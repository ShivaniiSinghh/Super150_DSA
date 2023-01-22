package Assignment_3;

import java.util.*;
public class Pallindromic_Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(substring(s));
    }
    public static int substring(String str) {
        int c=0;
        for(int i=0;i<str.length();i++){
            c+=palindrome(str,i,i);
            c+=palindrome(str,i,i+1);
        }
        return c;
    }
    public static int palindrome(String str, int l, int r){
        int c=0;
        while(l>=0 && r<str.length()&& (str.charAt(l)==str.charAt(r))){
            l--;
            r++;
            c++;
        }
        return c;
    }

}