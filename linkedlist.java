import java.util.Scanner;

public class linkedlist {

    // Inner class Node to represent each element in the linked list
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    // Inner class Linked to handle linked list operations
    class Linked {
        public Node append(Node head, int value) {
            Node nn = new Node(value);
            if (head == null)
                return nn;
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nn;
            return head;
        }

        public void print(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist listDemo = new linkedlist(); // Create instance of LinkedListDemo to access inner classes
        linkedlist.Linked ob = listDemo.new Linked(); // Create instance of Linked class
        Node head = null;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            head = ob.append(head, d);
        }
        ob.print(head);
        sc.close(); // Close the scanner to prevent resource leak
    }
}
