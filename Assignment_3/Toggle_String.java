package Assignment_3;

import java.util.*;
public class Toggle_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        char []  str = str1.toCharArray();
        for(int i=0;i<str1.length();i++){
            if(str[i]>='a' && str[i]<='z'){
                str[i]=(char)(str[i]+'A'-'a');
            }
            else if(str[i]>='A' && str[i]<='Z'){
                str[i]=(char)(str[i]+'a'-'A');
            }
        }
        for(int i=0;i<str1.length();i++){
            System.out.print(str[i]);
        }
    }
}
