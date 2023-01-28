package Assignment_5;

import java.util.*;
public class Kartik_Celeb {
    static int[][] matt;

    static boolean already_know(int p, int q)
    {
        boolean rss = (matt[p][q] == 1) ?
                true :
                false;
        return rss;
    }
    static int cleeb_find(int j[][], int o)
    {
        Stack<Integer> stac = new Stack<>();
        for(int i=0;i<o;i++){
            stac.push(i);
        }
        while(stac.size() > 1){
            int a = stac.pop();
            int b = stac.pop();

            if(already_know(a,b))
                stac.push(b);
            else
                stac.push(a);
        }
        int cunt;
        if(stac.empty())
            return -1;
        cunt = stac.pop();
        for (int i = 0; i < o; i++)
        {
            if (i != cunt && (already_know(cunt, i) ||
                    !already_know(i, cunt)))
                return -1;
        }
        return cunt;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        matt = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matt[i][j] = sc.nextInt();
            }
        }
        int rult = cleeb_find(matt, n);
        if (rult == -1)
        {
            System.out.println("No Celebrity");
        }
        else
            System.out.println(rult);
    }
}

