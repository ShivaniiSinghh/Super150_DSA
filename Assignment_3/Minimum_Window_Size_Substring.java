package Assignment_3;

import java.util.*;

class Minimum_Window_Size_Substring{


    public static void Minimum_Window(char []s, char []t)
    {

        int m[] = new int[256];
        int ans = Integer.MAX_VALUE;
        int start = 0;
        int count = 0;

        for (int i = 0; i < t.length; i++) {
            if (m[t[i]] == 0)
                count++;
            m[t[i]]++;
        }


        int i = 0;
        int j = 0;

        while (j < s.length)
        {
            m[s[j]]--;
            if (m[s[j]] == 0)
                count--;

            if (count == 0)
            {
                while (count == 0)
                {
                    if (ans > j - i + 1)
                    {
                        ans = Math.min(ans, j - i + 1);
                        start = i;
                    }

                    m[s[i]]++;
                    if (m[s[i]] > 0)
                        count++;

                    i++;
                }
            }
            j++;
        }

        if (ans != Integer.MAX_VALUE)
            System.out.print(String.valueOf(s).substring(start, ans+start));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        Minimum_Window(s.toCharArray(), t.toCharArray());

    }
}