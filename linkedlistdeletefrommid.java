import java.util.Scanner;

public class linkedlistdeletefrommid {
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
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
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        void deletefrommid(Node head, int p) {
            if (head == null)
                return;
            Node temp = head;
            if (p == 0) {
                head = temp.next;
                return;
            }
            for (int i = 0; temp != null && i < p - 1; i++) {
                temp = temp.next;
            }
            if (temp == null || temp.next == null)
                return;
            Node next = temp.next.next;
            temp.next = next;
        }
    }

    public static void main(String[] args) {
        linkedlistdeletefrommid obj = new linkedlistdeletefrommid();
        LinkedList ob = obj.new LinkedList();
        Node head = null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = ob.append(head, data);
        }
        int k = sc.nextInt();
        ob.deletefrommid(head, k);
        ob.print(head);
        sc.close();
    }
}
