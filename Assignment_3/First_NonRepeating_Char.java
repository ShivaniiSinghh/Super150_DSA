package Assignment_3;

import java.util.*;
public class First_NonRepeating_Char {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n=str.length();
        for(int i=0;i<n;i++){
            boolean unique = true;
            for(int j=0;j<n;j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    unique=false;
                    break;
                }
            }
            if(unique){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}