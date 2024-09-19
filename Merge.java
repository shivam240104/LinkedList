public class Merge {
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
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2){
        Node mergedll = new Node(-1);
        Node temp = mergedll;

        while(head1 != null && head2 != null){
          if(head1.data <= head2.data){
            temp.next = head1;
            head1 = head.next;
            temp = temp.next;
          } else{
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
          }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;

    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);

    }
    public static void main(String[] args) {
        Merge ll= new Merge();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.AddFirst(5);
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
}
