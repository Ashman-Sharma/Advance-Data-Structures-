class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Linklist {
    public static Node insertEnd(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static Node insertAtPos(Node head, int val, int pos) {
        Node newNode = new Node(val);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return head;
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        
        print(head);

        head = insertEnd(head, 8);
        System.out.println("inserting 8 at end:");
        print(head);

        head = insertAtPos(head, 99, 3);
        System.out.println(" inserting 99 at pos 3:");
        print(head);
    }
}
