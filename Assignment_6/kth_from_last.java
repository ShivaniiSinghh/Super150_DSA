package Assignment_6;

// Java program to find N'th node from
// end of linked list
import java.io.*;
import java.util.Scanner;

public class kth_from_last {
    Node head; // head of the list

    /* Linked List node */
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Function to get the Nth node from the last of a
    linked list */
    void printNthFromLast(int N)
    {
        int len = 0;
        Node temp = head;

        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // check if value of N is not more than length of
        // the linked list
        if (len < N)
            return;

        temp = head;

        // 2) get the (len-N+1)th node from the beginning
        for (int i = 1; i < len - N + 1; i++)
            temp = temp.next;

        System.out.println(temp.data);
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
		/* 1 & 2: Allocate the Node &
				Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    // Driver's code
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        kth_from_last list = new kth_from_last();

        for (int i = 0; i < N; i++) {
            list.push(scn.nextInt());
        }
        // Function call
        list.printNthFromLast(N);
//        list.display();
    }
} // This code is contributed by Rajat Mishra
