package Assignment_4;

import java.util.*;
public class Chessboard_Path {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println("\n"+ path(y, y - 1, y - 1, 0, 0, ""));

    }
    public static int path(int y, int r, int c, int rc, int ccc, String sol)
    {
        if (ccc == c && rc == r)
        {
            System.out.print(sol + "{" + rc + "-" + ccc + "} ");
            return 1;
        }

        if (ccc >= y || rc >= y)
        {
            return 0;
        }
        int flag=0;

        flag+= path(y, r, c, rc + 2, ccc + 1, sol + "{" + rc + "-" + ccc + "}K");
        flag+= path(y, r, c, rc + 1, ccc + 2, sol + "{" + rc + "-" + ccc + "}K");
        if (ccc == 0 || rc == 0 || ccc == y - 1 || rc == y - 1)
        {
            for (int i = 1; i <= r; i++)
            {
                flag+= path(y, r, c, rc, ccc + i, sol + "{" + rc + "-" + ccc + "}R");

            }
            for (int i = 1; i <= r; i++)
            {
                flag+= path(y, r, c, rc + i, ccc, sol + "{" + rc + "-" + ccc + "}R");

            }
        }
        if (ccc == rc || ccc + rc == r)
        {
            for (int i = 1; i <= r; i++)
            {
                flag+= path(y, r, c, rc + i, ccc + i, sol + "{" + rc + "-" + ccc + "}B");

            }
        }
        return flag;
    }
}