import java.util.Scanner;

public class linkedlistdeletionfromend {
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
            if (head == null) {
                return nn;
            }
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

        Node deleteFromLast(Node head) {
            if (head == null) {
                return null;
            }
            if (head.next == null) {
                return null;
            }
            Node second_last = head;
            while (second_last.next.next != null) {
                second_last = second_last.next;
            }
            second_last.next = null;
            return head;
        }
    }

    public static void main(String[] args) {
        linkedlistdeletionfromend obj = new linkedlistdeletionfromend();
        LinkedList ob = obj.new LinkedList();
        Node head = null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = ob.append(head, data);
        }
        head = ob.deleteFromLast(head);
        ob.print(head);
        sc.close();
    }
}
