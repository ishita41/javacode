import java.util.*;

public class linkedsearch {
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
        }
    }

    class LinkedList {
        Node append(Node head, int val) {
            Node nn = new Node(val);
            if (head == null)
                return nn;
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nn;
            return head;
        }

        void print(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int search(Node head, int val) {
            if (head == null)
                return -1;
            Node temp = head;
            int position = 0;
            while (temp != null) {
                if (temp.data == val)
                    return position;
                temp = temp.next;
                position++;
            }
            return -1; // Return -1 if the value is not found

        }
    }

    public static void main(String[] args) {
        linkedsearch obj = new linkedsearch();
        LinkedList ob = obj.new LinkedList();
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = ob.append(head, data);
        }
        ob.print(head);
        int k = sc.nextInt();
        System.out.println(ob.search(head, k));
    }
}
