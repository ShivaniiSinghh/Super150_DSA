package Assignment_5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Play_Cards{
    public static void pay_CARDS(Stack<Integer> x, int y) {
        Stack<Integer> stac1 = new Stack<>();
        Stack<Integer> stac2 = new Stack<>();
        ArrayList<Integer> leest = new ArrayList<>();
        solu(leest);
        for (int i = 1; i <= y; i++) {
            int p = leest.get(i - 1);
            while (!x.isEmpty()) {
                int ii = x.pop();
                if (ii % p == 0) {
                    stac2.push(ii);
                } else {
                    stac1.push(ii);
                }
            }
            while (!stac2.isEmpty()) {
                System.out.println(stac2.pop());
            }
            x = stac1;
            stac1 = new Stack<>();
        }
        while (!x.isEmpty()) {
            System.out.println(x.pop());
        }
    }
    public static void solu(ArrayList<Integer> primee) {
        boolean[] pp = new boolean[100001];
        pp[0] = true;
        pp[1] = true;
        for (int i = 2; i * i <= 100000; i++) {
            if (pp[i] == false) {
                primee.add(i);
                for (int mul = 2; mul * i <= 100000; mul++) {
                    pp[i * mul] = true;
                }
            }
        }
        for (int i = 2; i <= 100000; i++) {
            if (!pp[i]) {
                primee.add(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int u = scan.nextInt();
        int v = scan.nextInt();
        Stack<Integer> stacc = new Stack<>();
        for (int i = 0; i < u; i++) {
            stacc.push(scan.nextInt());
        }
        pay_CARDS(stacc, v);
    }
}