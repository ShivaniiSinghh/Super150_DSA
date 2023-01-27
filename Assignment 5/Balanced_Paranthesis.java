package Assignment_5;

import java.util.*;
public class Balanced_Paranthesis {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String strr=scan.next();
        Stack<Character> stac= new Stack<>();
        for(int i=0;i<strr.length();i++)
        {
            if(strr.charAt(i)=='('||strr.charAt(i)=='[' ||strr.charAt(i)=='{')
            {
                stac.push(strr.charAt(i));
            }
            else
            {
                if(stac.isEmpty())
                {
                    System.out.println("No");
                    return;
                }
                else{
                    char x=strr.charAt(i);
                    char y=stac.peek();
                    if((x==')' && y=='(') || (x==']'&& y=='[') || (x=='}' && y=='{'))
                    {
                        stac.pop();
                    }
                }
            }
        }
        if(stac.isEmpty())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}