public class Palindrome {
    public static class  Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    } 
    
    public static Node head;    
    public static Node tail;
    
    public void AddFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }

    public void print(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node Findmid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow =slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public static void main(String[] args) {
        Palindrome ll = new Palindrome();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.print();
    
    }
}
