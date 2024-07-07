import java.util.Scanner;

public class linkedlistrotatek {
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
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        Node rotateNode(Node head, int k) {
            if (head == null || head.next == null || k == 0)
                return head;

            // Find the length of the linked list
            Node temp = head;
            int length = 1;
            while (temp.next != null) {
                temp = temp.next;
                length++;
            }

            // Link the last node to the head to make it circular
            temp.next = head;

            // Calculate the effective number of rotations needed
            k = k % length;
            int stepsToNewHead = length - k;

            // Find the new tail and new head
            temp = head;
            for (int i = 0; i < stepsToNewHead - 1; i++) {
                temp = temp.next;
            }

            Node newHead = temp.next;
            temp.next = null;

            return newHead;
        }
    }

    public static void main(String[] args) {
        linkedlistrotatek obj = new linkedlistrotatek();
        LinkedList ob = obj.new LinkedList();
        Node head = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter the node values:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = ob.append(head, data);
        }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        head = ob.rotateNode(head, k);
        System.out.println("Rotated linked list:");
        ob.print(head);

        sc.close();
    }
}
