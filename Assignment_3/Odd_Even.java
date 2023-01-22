package Assignment_3;

import java.util.*;
public class Odd_Even {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        replace(str);
    }
    public static void replace(String s){
        char [] str1 = s.toCharArray();
        for(int i=0;i<str1.length;i++){
            int val = str1[i];
            if(i%2==0){
                val++;
                str1[i]=(char)val;
            }
            else{
                val--;
                str1[i]=(char)val;
            }
        }
        System.out.println(str1);
    }
}