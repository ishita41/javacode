import java.util.*;

class linkeslistdeletebeginning {
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
                System.out.print(temp.data);
                temp = temp.next;
            }
        }

        Node deleteNodeFromBeginning(Node head) {
            if (head == null)
                return null;
            return head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkeslistdeletebeginning obj = new linkeslistdeletebeginning();
        LinkedList ob = obj.new LinkedList();
        Node head = null;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            head = ob.append(head, d);
        }
        // ob.print(head);
        head = ob.deleteNodeFromBeginning(head);
        ob.print(head);
    }
}