public class LL{
    Node head;
    public void iab(int data){
        Node newNode = new Node(data);
        
        newNode.next = head;
        head = newNode;
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
        list.iab(10);
        list.iab(20);
        list.iab(30);
        list.iab(40);
        
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
