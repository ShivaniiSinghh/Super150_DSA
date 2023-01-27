package Assignment_5;

import java.util.*;
public class Deque_Efficient {
    public static void main(String args[]) {
        Scanner scan =  new Scanner(System.in);
        int y = scan.nextInt();
        Stack<Integer> t1= new Stack<>();
        Stack<Integer> t2= new Stack<>();
        for(int i =0;i<y;i++)
        {
            t1.push(i);
        }
        for(int i =0;i<y;i++)
        {
            t2.push(t1.pop());
        }
        for(int i =0;i<y;i++)
        {
            System.out.print(t2.pop()+" ");
        }
    }
}
