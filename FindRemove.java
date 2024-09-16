public class FindRemove {
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
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void RemovefromEnd(int n){
        int sz=0;
        Node temp=head;
        while(temp != null){
            temp =temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next;
            return;
        }

         int i=1;
         int iTofind=sz-n;
         Node prev =head;
         while(i<iTofind){
            prev = prev.next;
            i++;
         }
         prev.next=prev.next.next;
         return;
         
    }


   
    public static void main(String[] args) {
        FindRemove ll= new FindRemove();
        ll.AddFirst(5);
        ll.AddFirst(4);
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.print();
        ll.RemovefromEnd(3);
        ll.print();
    }
}
