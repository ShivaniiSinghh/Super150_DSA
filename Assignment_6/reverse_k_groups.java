package Assignment_6;

    import java.util.*;
public class reverse_k_groups {
        public class Node{
            int val;
            Node next;
        }
        private Node head;
        public void addlast(int item) {
            Node nn = new Node();
            nn.val = item;
            if(head == null) {
                head = nn;
                return;
            }
            Node temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = nn;
        }
        public void display() {
            Node temp = head;
            while(temp!=null) {
                System.out.print(temp.val+" ");
                temp= temp.next;
            }
            System.out.println();
        }
        public Node reverse(Node head, int k)
        {
            Stack<Node> st = new Stack<>();
            Node Dummy = new Node();
            Node tmp=Dummy;
            Node start=null;
            while(head!=null)
            {
                if(st.size()==0){
                    start=head;
                }
                st.push(head);
                if(st.size()==k)
                {
                    while(!st.isEmpty())
                    {

                        Node new_node = new Node();
                        new_node.val = st.pop().val;
                        Dummy.next=new_node;
                        Dummy=Dummy.next;
                    }
                }
                head=head.next;
            }
            if(st.size()>0)
                Dummy.next=start;
            return tmp.next;
        }

        public static void main (String args[]) {
            Scanner sc=new Scanner(System.in);
            reverse_k_groups list = new reverse_k_groups();
            int n=sc.nextInt();
            int k=sc.nextInt();
            for(int i=0; i<n; i++)
                list.addlast(sc.nextInt());
            reverse_k_groups obj = new reverse_k_groups();
            obj.head = obj.reverse(list.head, k);
            obj.display();
        }
    }
