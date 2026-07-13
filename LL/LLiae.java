public class LL{
    Node head;
    public void iae(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp= temp.next;
        }
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
        list.iae(10);
        list.iae(20);
        list.iae(30);
        list.iae(40);
        
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
