import java.util.Scanner;

public class linkedlistcycle {
    static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    static class LinkedList {
        Node append(Node head, int val) {
            Node newNode = new Node(val);
            if (head == null) {
                return newNode;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
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

        boolean hasCycle(Node head) {
            if (head == null || head.next == null) {
                return false;
            }
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }

        void createCycle(Node head, int pos) {
            if (head == null || pos <= 0) {
                return;
            }
            Node start = head;
            Node cycleNode = null;
            int count = 1;
            while (start.next != null) {
                if (count == pos) {
                    cycleNode = start;
                }
                start = start.next;
                count++;
            }
            if (cycleNode != null) {
                start.next = cycleNode;
            }
        }
    }

    public static void main(String[] args) {
        linkedlistcycle obj = new linkedlistcycle();
        LinkedList list = new LinkedList();

        Scanner sc = new Scanner(System.in);

        // Input the number of nodes
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // Input the values of the nodes
        System.out.println("Enter the node values:");
        Node head = null;
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = list.append(head, data);
        }

        // Input the position where to create cycle
        System.out.print("Enter the position to create cycle (1-based index): ");
        int pos = sc.nextInt();

        // Create a cycle in the linked list at the specified position
        list.createCycle(head, pos);

        // Check if the linked list contains a cycle
        boolean cycle = list.hasCycle(head);

        if (cycle) {
            System.out.println("The linked list contains a cycle.");
        } else {
            System.out.println("The linked list does not contain a cycle.");
        }

        sc.close();
    }
}
