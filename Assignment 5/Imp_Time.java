package Assignment_5;
//
//import java.util.*;
//public class Imp_Time {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int l = scan.nextInt();
//        int[] arrr1 = new int[l];
//        int[] arrr2 = new int[l];
//        for (int i = 0; i < arrr1.length; i++) {
//            arrr1[i] = scan.nextInt();
//        }
//        for (int i = 0; i < arrr2.length; i++) {
//            arrr2[i] = scan.nextInt();
//        }
//        System.out.println(impo_time(arrr1, arrr2));
//    }
//    private static int impo_time(int[] arrr1, int[] arrr2) {
//        int ti = 0;
//        qiee<Integer> quee1 = new LinkedList<>();
//        qiee<Integer> quee2 = new LinkedList<>();
//        for (int i = 0; i < arrr1.length; i++) {
//            quee1.add(arrr1[i]);
//        }
//        for (int i = 0; i < arrr2.length; i++) {
//            quee2.add(arrr2[i]);
//        }
//        while (!quee1.isEmpty()) {
//            if (quee1.peek() == quee2.peek()) {
//                ti++;
//                quee1.poll();
//                quee2.poll();
//            } else {
//                int ii = quee1.poll();
//                quee1.add(ii);
//                ti++;
//            }
//        }
//        return ti;
//    }
//}
