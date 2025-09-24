class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class dirlinklist {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Original: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

        System.out.print("direction change: ");
        temp = head;
        while (temp != null) {
            if (temp.next != null)
                System.out.print(temp.data + "<-");
            else
                System.out.print(temp.data + "<-null");
            temp = temp.next;
        }
    }
}
