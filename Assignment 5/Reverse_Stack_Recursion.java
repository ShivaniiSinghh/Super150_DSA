package Assignment_5;

import java.util.*;
public class Reverse_Stack_Recursion {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        Stack<Integer> stac = new Stack<>();
        while (p > 0) {
            int ele = scan.nextInt();
            stac.push(ele);
            p--;
        }
        reversse(stac);
        while (!stac.isEmpty()) {
            System.out.println(stac.pop());
        }

    }

    public static void addding(Stack<Integer> stac, int ele) {
        if (stac.isEmpty()) {
            stac.push(ele);
            return;
        }
        int E1 = stac.pop();
        addding(stac, ele);
        stac.push(E1);

    }

    public static void reversse(Stack<Integer> stac) {
        if (stac.isEmpty()) {
            return;
        }
        int elle = stac.pop();
        reversse(stac);
        addding(stac, elle);
    }
}