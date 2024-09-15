

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
    public static int size;

    public void AddFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return ;
        }
        newNode.next=head;
        head=newNode;
    }

    public void AddLast(int data){
        Node newNode = new Node(data);
        size++;

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

    // add int middle of linkedlist
    public void add(int idx, int data){
        if(idx==0){
            AddFirst(data);
            return ;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next= newNode;
    }
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.AddFirst(3);
        
        ll.AddFirst(2);
    
        ll.AddFirst(1);

       ll.AddLast(4);
    
       ll.AddLast(5);
      
       ll.AddLast(6);
       ll.print();
       ll.add(2, 8);
       ll.print();
       System.out.println(ll.size);
    }
}