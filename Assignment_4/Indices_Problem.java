package Assignment_4;

import java.util.*;

public class Indices_Problem {
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int y=sc.nextInt();
            int []t=new int[y];
            for(int i=0;i<y;i++)
                t[i]=sc.nextInt();
            int w=sc.nextInt();
            solve(t,w,0);
        }
        public static void solve(int g[],int p,int i)
        {
            if(i==g.length)
                return;
            if(g[i]==p)
                System.out.print(i+" ");
            solve(g,p,i+1);
        }
    }
