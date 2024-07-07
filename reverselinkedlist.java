import java.util.Scanner;

public class reverselinkedlist {
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

        Node insertAtBeginning(Node head, int k) {
            Node nn = new Node(k);
            nn.next = head;
            return nn;
        }

        void print(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(); // for a new line after printing the list
        }

        Node reverse(Node head) {
            Node prev = null;
            Node current = head;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }
    }

    public static void main(String[] args) {
        reverselinkedlist ob = new reverselinkedlist();
        reverselinkedlist.LinkedList oob = ob.new LinkedList();
        Node head = null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = oob.append(head, data);
        }
        int k = sc.nextInt();
        head = oob.insertAtBeginning(head, k);
        head = oob.reverse(head);
        oob.print(head);
        sc.close();
    }
}
