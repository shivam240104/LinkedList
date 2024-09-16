public class Reverse {
    public static class Node{
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
            Node newNode= new Node(data);
            if(head==null){
                head=tail=newNode;
                return ;
            }
            newNode.next=head;
            head= newNode;

        }

        public void Print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void Reverse(){
            Node prev=null;
            Node curr = tail =head;
            Node next;
            while(curr!=null){
                next =curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head = prev;
        }
    public static void main(String[] args) {
        Reverse ll= new Reverse();
        ll.AddFirst(5);
        ll.AddFirst(4);
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.Print();
        ll.Reverse();
        ll.Print();

    }
    
}
