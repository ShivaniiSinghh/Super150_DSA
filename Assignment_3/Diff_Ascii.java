package Assignment_3;
import java.util.Scanner;

public class Diff_Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String s1="";
        int i;
        for( i=0;i<s.length()-1;i++){
            s1+=s.charAt(i);
            int diff= s.charAt(i+1)-s.charAt(i);
            s1+=diff;
        }
        s1+=s.charAt(i);
        System.out.println(s1);
    }
}
