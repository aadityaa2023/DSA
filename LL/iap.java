public class LL{
    Node head;
    public void iap(int data , int pos){
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        newNode.next =  temp.next;
        temp.next = newNode;
        

    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String []arg){
        LL list = new LL();
        
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        
        list.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        list.iap(25 , 3);
        
        
        
        list.display();
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
