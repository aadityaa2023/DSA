public class LL{
    Node head;
    
    public void search(int data){
        Node temp = head;
        int index =1;
        
        while(temp.next!=null){
            if(temp.data == data){
                System.out.println(data + " is found at " + index + "rd index");
            }
            temp = temp.next;
            index++;
        }

        
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
        
        list.search(30);
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
