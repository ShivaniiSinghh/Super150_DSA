package Assignment_5;

import java.util.Scanner;
import java.util.Stack;

public class Kartik_Coding {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        Stack<Integer> stac = new Stack<>();
        int z = scc.nextInt();
        for (int i = 0; i < z; i++) {
            int elle = scc.nextInt();
            if (elle == 2) {
                int element2 = scc.nextInt();
                stac.push(element2);
            } else {
                if (stac.isEmpty()) {
                    System.out.println("No Code");
                } else {
                    System.out.println(stac.pop());
                }
            }
        }
    }
}
