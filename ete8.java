import java.util.Scanner;

public class ete8 {
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
        }
    }

    Node head; // Head of the linked list

    class LinkedList {
        // Method to append a new node at the end of the linked list
        Node append(Node head, int val) {
            Node nn = new Node(val);
            Node temp = head;
            if (temp == null) {
                return nn; // If head is null, return nn as the new head
            }
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nn;
            return head;
        }
    }

    // Method to find the kth element from the end of the linked list
    int kthLargest(int k) {
        if (head == null || k <= 0) {
            return -1; // Invalid input scenario
        }

        Node slow = head;
        Node fast = head;

        // Move fast pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return -1; // Handle case where k > number of elements
            }
            fast = fast.next;
        }

        // Move both pointers until fast pointer reaches end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Now slow pointer is at kth element from last
        return slow.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ete8 obj = new ete8();
        ete8.LinkedList list = obj.new LinkedList();

        // Read linked list nodes until -1 is encountered
        int value;
        while ((value = sc.nextInt()) != -1) {
            obj.head = list.append(obj.head, value);
        }

        // Read kth element from last
        int k = sc.nextInt();
        sc.close();

        // Find and print kth element from last
        int result = obj.kthLargest(k);
        if (result == -1) {
            System.out.println("Invalid input or k is out of range.");
        } else {
            System.out.println("Kth element from last: " + result);
        }
    }
}
