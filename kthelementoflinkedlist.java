import java.util.Scanner;

public class kthelementoflinkedlist {
    static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null; // Initialize next to null
        }
    }

    static class LinkedList {
        Node append(Node head, int val) {
            Node nn = new Node(val);
            if (head == null) {
                return nn; // Return new node if head is null
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nn;
            return head; // Return head of the list
        }

        void print(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " "); // Print data followed by space
                temp = temp.next;
            }
            System.out.println(); // New line at the end of printing
        }

        public static int kth(int k, Node head) {
            if (k <= 0)
                return -1;
            Node current = head;
            int count = 1;
            while (current != null) {
                if (count == k) {
                    return current.data;
                }
                count++;
                current = current.next;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        Scanner sc = new Scanner(System.in);
        LinkedList ob = new LinkedList();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            head = ob.append(head, d);
        }

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        int kthElement = ob.kth(k, head);
        if (kthElement != -1) {
            System.out.println("The " + k + "-th element is: " + kthElement);
        } else {
            System.out.println("Invalid value of k or k is larger than the size of the list.");
        }

        System.out.print("Current Linked List: ");
        ob.print(head);
    }
}
