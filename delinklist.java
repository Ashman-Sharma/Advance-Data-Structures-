class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class delinklist {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        int key = 3;
        head = delete(head, key);

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    static Node delete(Node head, int key) {
        if(head == null) return null;
        if(head.data == key) return head.next;
        Node temp = head;
        while(temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if(temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }
}
