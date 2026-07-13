public class LL {

    Node head;

    public static void main(String[] args) {

        LL list = new LL();

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        list.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        Node temp = list.head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
