package Assignment_5;

import java.util.*;

class GF_Dearrangements {
    public static void main (String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        System.out.println(
                +arrange(t));
    }
    static int arrange(int t)
    {
        if (t == 1) return 0;
        if (t == 2) return 1;
        return (t - 1) * (arrange(t- 1) +
                arrange(t - 2));
    }
}

