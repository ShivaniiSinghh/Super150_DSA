//import java.util.*;
//
//class Node {
//    public int data;
//    public Node next;
//
//    Node(int d) {
//        data = d;
//        next = null;
//    }
//}
//
//class Solution {
//    // head - Head pointer of the Linked List
//    // Return a boolean value indicating the presence of cycle
//    // If the cycle is present, modify the linked list to remove the cycle as well
//    boolean revCyycle(Node head) {
//        Node dheere = head;
//        Node sheegr = head;
//        while(sheegr != null && sheegr.next != null){
//            dheere = dheere.next;
//            sheegr = sheegr.next.next;
//            if(dheere == sheegr) {
//                sheegr = dheere;
//                dheere = head;
//                while(dheere.next != sheegr.next){
//                    dheere = dheere.next;
//                    sheegr = sheegr.next;
//                }
//                sheegr.next = null;
//                return true;
//            }
//        }
//        return false;
//    }
//
//}
//
//
///*
// *
// *
// *   You do not need to refer or modify any code below this.
// *   Only modify the above class definition.
// *	Any modications to code below could lead to a 'Wrong Answer' verdict despite above code being correct.
// *	You do not even need to read or know about the code below.
// *
// *
// *
// */
//
//public class Main {
//
//    public static Node buildCycleList() {
//        Scanner sc = new Scanner(System.in);
//        Hashtable<Integer, Node> hash = new Hashtable<Integer, Node>();
//        int x = sc.nextInt();
//        if (x == -1) {
//            return null;
//        }
//        Node head = new Node(x);
//        hash.put(x, head);
//        Node current = head;
//        while (x != -1) {
//            x = sc.nextInt();
//            if (x == -1)
//                break;
//            if (hash.containsKey(x)) {
//                current.next = hash.get(x);
//                return head;
//            }
//            Node n = new Node(x);
//            current.next = n;
//            current = n;
//            hash.put(x, n);
//        }
//        current.next = null;
//        return head;
//    }
//
//    public static void printLinkedList(Node head) {
//        HashSet<Integer> s = new HashSet<Integer>();
//        while (head != null) {
//            if (s.contains(head.data)) {
//                System.out.println("\nCycle detected at " + head.data);
//                return;
//            }
//            System.out.print(head.data + " ");
//            s.add(head.data);
//            head = head.next;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Node head = buildCycleList();
//        Solution s = new Solution();
//
//        boolean cyclePresent = s.revCyycle(head);
//        if (cyclePresent) {
//            System.out.println("Cycle was present");
//        } else {
//            System.out.println("No cycle");
//        }
//
//        System.out.print("Linked List - ");
//        printLinkedList(head);
//    }
//}
