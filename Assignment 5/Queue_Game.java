package Assignment_5;

import java.util.LinkedList;
import java.util.Scanner;

public class Queue_Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        while (m-- > 0) {
            int n = scan.nextInt();
            int[] arrr = new int[n];
            for (int i = 0; i < arrr.length; i++) {
                arrr[i] = scan.nextInt();
            }
            if (val(arrr)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
    public static boolean val(int [] arrr) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < arrr.length; i++) {
            if(arrr[i]==1) {
                list.add(1);
            }
            else {
                if(list.isEmpty()) {
                    return false;
                }
                else {
                    list.remove();
                }
            }
        }
        return true;
    }
}
