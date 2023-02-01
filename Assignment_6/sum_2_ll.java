//package Assignment_6;
//
//import java.util.*;
//
//class Main {
//    class LinkedList {
//        private Node addListsRecursive(Node node1, Node node2, int carry)
//        {
//            // base case: If we are done with adding both lists
//            if (node1 == null && node2 == null)
//            {
//                if (carry > 0)
//                {
//                    return new Node(carry);
//                }
//                return null;
//            }
//
//            // if a node is null, we consider its value as 0
//            int value1 = (node1 != null) ? node1.data: 0;
//            int value2 = (node2 != null) ? node2.data : 0;
//
//            // calculate sum and carry by using values of corresponding nodes
//            int sum = (value1 + value2 + carry) % 10;
//            carry   = (value1 + value2 + carry) / 10;
//
//            // create a new node with value as sum.
//            Node currentHead = new Node(sum);
//
//            // get the next nodes for respective linked lists
//            Node node1Next = (node1 != null) ? node1.next : null;
//            Node node2Next = (node2 != null) ? node2.next : null;
//
//
//            // now add list segments after node1 and node2.
//            // append the result to currentHead(obtained by adding node1 and node2)
//            currentHead.next = addListsRecursive(node1Next, node2Next, carry);
//
//            return currentHead;
//        }
//    }
//        private class Node {
//            int data;
//            Node next;
//
//            Node(int data, Node next) {
//                this.data = data;
//                this.next = next;
//            }
//        }
//
//        private Node head;
//        private Node tail;
//        private int size;
//
//        public LinkedList() {
//            this.head = null;
//            this.tail = null;
//            this.size = 0;
//        }
//
//        public LinkedList(Node head, Node tail, int size) {
//            this.head = head;
//            this.tail = tail;
//            this.size = size;
//        }
//
//        // O(1)
//        public int size() {
//            return this.size;
//        }
//
//        // O(1)
//        public boolean isEmpty() {
//            return this.size() == 0;
//        }
//
//        // O(1)
//        public int getFirst() throws Exception {
//            if (this.isEmpty()) {
//                throw new Exception("List is empty.");
//            }
//
//            return this.head.data;
//        }
//
//        // O(1)
//        public int getLast() throws Exception {
//            if (this.isEmpty()) {
//                throw new Exception("List is empty.");
//            }
//
//            return this.tail.data;
//        }
//
//        // O👎
//        public int getAt(int idx) throws Exception {
//            Node temp = this.getNodeAt(idx);
//            return temp.data;
//        }
//
//        // O👎
//        private Node getNodeAt(int idx) throws Exception {
//            if (this.isEmpty()) {
//                throw new Exception("List is empty");
//            }
//
//            if (idx < 0 || idx >= this.size()) {
//                throw new Exception("Invalid arguments");
//            }
//
//            Node retVal = this.head;
//            for (int i = 0; i < idx; i++) {
//                retVal = retVal.next;
//            }
//
//            return retVal;
//        }
//
//        // O(1)
//        public void addFirst(int data) {
//            Node node = new Node(data, this.head);
//
//            if (this.size() == 0) {
//                this.head = node;
//                this.tail = node;
//            } else {
//                this.head = node;
//            }
//
//            this.size++;
//        }
//
//        // O(1)
//        public void addLast(int data) {
//            Node node = new Node(data, null);
//
//            if (this.size() == 0) {
//                this.head = node;
//                this.tail = node;
//            } else {
//                this.tail.next = node;
//                this.tail = node;
//            }
//
//            this.size++;
//        }
//
//        // O👎
//        public void addAt(int idx, int data) throws Exception {
//            if (idx < 0 || idx > this.size()) {
//                throw new Exception("Invalid arguments");
//            }
//
//            if (idx == 0) {
//                this.addFirst(data);
//            } else if (idx == this.size()) {
//                this.addLast(data);
//            } else {
//                Node nm1 = this.getNodeAt(idx - 1);
//                Node n = nm1.next;
//
//                Node node = new Node(data, n);
//                nm1.next = node;
//
//                this.size++;
//            }
//        }
//
//        // O(1)
//        public int removeFirst() throws Exception {
//            if (this.isEmpty()) {
//                throw new Exception("List is empty");
//            }
//
//            int retVal = this.head.data;
//
//            if (this.size() == 1) {
//                this.head = null;
//                this.tail = null;
//            } else {
//                this.head = this.head.next;
//            }
//
//            this.size--;
//            return retVal;
//        }
//
//        // O👎
//        public int removeLast() throws Exception {
//            if (this.isEmpty()) {
//                throw new Exception("List is empty");
//            }
//
//            int retVal = this.tail.data;
//
//            if (this.size() == 1) {
//                this.head = null;
//                this.tail = null;
//            } else {
//                Node sm2 = this.getNodeAt(this.size() - 2);
//                sm2.next = null;
//                this.tail = sm2;
//            }
//
//            this.size--;
//            return retVal;
//        }
//
//        // O👎
//        public int removeAt(int idx) throws Exception {
//            if (this.isEmpty()) {
//                throw new Exception("List is empty");
//            }
//
//            if (idx < 0 || idx >= this.size()) {
//                throw new Exception("Invalid arguments");
//            }
//
//            if (idx == 0) {
//                return this.removeFirst();
//            } else if (idx == this.size() - 1) {
//                return this.removeLast();
//            } else {
//                Node nm1 = this.getNodeAt(idx - 1);
//                Node n = nm1.next;
//                Node np1 = n.next;
//
//                nm1.next = np1;
//                this.size--;
//
//                return n.data;
//            }
//        }
//
//        public void display() {
//            Node node = this.head;
//
//            while (node != null) {
//                System.out.print(node.data + " ");
//                node = node.next;
//            }
//
//            // System.out.println("END");
//        }
//    public static void main(String[] args) throws Exception {
//
//        Scanner scn = new Scanner(System.in);
//        int N = scn.nextInt();
//
//        LinkedList list = new LinkedList();
//
//        for (int i = 0; i < N; i++) {
//            list.addLast(scn.nextInt());
//        }
//
//        list. ();
//        list.display();
//    }
//    }
//}
