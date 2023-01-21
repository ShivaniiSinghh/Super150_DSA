package Assignment_3;

import java.util.*;
public class is_Pallindrome{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int n=str.length();
        boolean flag=true;
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
