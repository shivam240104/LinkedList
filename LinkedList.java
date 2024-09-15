

public class LinkedList{
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void AddFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }
        newNode.next=head;
        head=newNode;
    }

    public void AddLast(int data){
        Node newNode = new Node(data);
        if(head== null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.print();
        ll.AddFirst(1);
        ll.print();
        ll.AddFirst(2);
        ll.print();
        ll.AddFirst(3);
        ll.print();
       ll.AddLast(7);
       ll.print();
       ll.AddLast(5);
       ll.print();
       ll.AddLast(6);ll.print();
    }
}