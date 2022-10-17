package Assignment_4;

import java.util.*;

public class Replace_0s {
        public static void main (String args[]) {
            Scanner sc=new Scanner(System.in);
            String p=sc.next();
            SolveIT(p,"");
        }
        public static void SolveIT(String q,String o)
        {
            if(q.isEmpty())
            {
                System.out.println(o);
                return;
            }
            char ch=q.charAt(0);
            if(ch=='0')
                SolveIT(q.substring(1),o+'5');
            else
                SolveIT(q.substring(1),o+ch);
        }
    }
