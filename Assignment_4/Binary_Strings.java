package Assignment_4;

import java.util.*;

public class Binary_Strings {
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int o=sc.nextInt();
            while(o-->0)
            {
                String sti=sc.next();
                solve(sti,"",0);
                System.out.println();
            }
        }
        public static void solve(String s,String n,int i)
        {
            if(i==s.length())
            {
                System.out.print(n+" ");
                return;
            }
            char ch=s.charAt(i);
            if(ch=='?')
            {
                solve(s,n+'0',i+1);
                solve(s,n+'1',i+1);
            }
            else
                solve(s,n+ch,i+1);
        }
    }

