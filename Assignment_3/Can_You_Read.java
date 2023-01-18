package Assignment_3;

import java.util.Scanner;
public class Can_You_Read {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int end =0,start=0;
        boolean f=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A'&& str.charAt(i)<='Z'){
                if(f){
                    end=i;
                    System.out.println(str.substring(start,end));
                    start=i;
                }
                else{
                    start=i;
                    f=true;
                }
            }
        }
        System.out.println(str.substring(start));
    }
}