public class Search {
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
        Node newNode = new Node(data);
        if(head==null){
            head =tail=newNode;
            return;
        }
        newNode.next=head;
        head= newNode;

    }
    public void print(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Iterative search in linkedlist
    public int itrsearch(int key){
        Node temp = head;
        int i=0;
        while(temp !=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;

        }
        return -1;
    }

    // Recursive search
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data== key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }
    public static void main(String[] args) {
        Search ll = new Search();
        ll.AddFirst(5);
        ll.AddFirst(4);
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.print();
        System.out.println(ll.itrsearch(5));
        System.err.println(ll.recSearch(10));

    }
}
