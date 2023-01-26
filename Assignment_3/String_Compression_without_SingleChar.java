package Assignment_3;

import java.util.*;
public class String_Compression_without_SingleChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s+" ";
        String s1 = "";
        Compress(s,s1);
    }
    public static void Compress(String s, String s1){
        int n=s.length();
        int i=0,j=1;
        int c=1;
        while(i<n && j<n){
            if(s.charAt(i)==s.charAt(j)){
                c++;
                j++;
            }
            else if((s.charAt(i)!=s.charAt(i+1))){
                s1 = s1+s.charAt(i);
                c=1;
                i=j;
                j=i+1;
            }
            else{
                s1 = s1+s.charAt(i)+c;
                c=1;
                i=j;
                j=i+1;
            }
        }
        System.out.println(s1);
    }
}

