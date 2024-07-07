import java.util.Scanner;

public class linkedlistinsertatbeginning {
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
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        Node insertAtBeginning(Node head, int val) {
            Node nn = new Node(val);
            nn.next = head;
            return nn;
        }

    }

    public static void main(String[] args) {
        linkedlistinsertatbeginning oob = new linkedlistinsertatbeginning();
        linkedlistinsertatbeginning.LinkedList ob = oob.new LinkedList();
        Node head = null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            head = ob.append(head, d);
        }
        int k = sc.nextInt();
        head = ob.insertAtBeginning(head, k);
        ob.print(head);
    }
}
