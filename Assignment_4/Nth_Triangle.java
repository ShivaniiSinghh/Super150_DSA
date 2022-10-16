package Assignment_4;

import java.util.*;

public class Nth_Triangle {
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int g=sc.nextInt();
            System.out.println(printIT(g));
        }
        public static int printIT(int p)
        {
            if(p==0)
                return 0;
            return p+printIT(p-1);
        }
    }
