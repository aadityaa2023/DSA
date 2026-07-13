public class LL{
    Node head;
    
    public void dai(int data, int pos){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(pos == 0){
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i =1; i<pos -1 && temp.next !=null ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        
    }
    public static void main(String[] args) {
        LL list = new LL();
        Node first = new Node(10);
        Node second  = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        
        list.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        
        list.display();
        list.dai(20,2);
        list.display();
        
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next = null;
    }
}
