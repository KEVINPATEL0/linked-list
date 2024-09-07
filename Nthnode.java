package linkedlist;

public class Nthnode {
    public static  class Node{
        int data;
        Node next;

        public Node(int data){
            this.data =data;
            this.next= null;
        }
    } 

    public static Node head;
    public static Node tail;
    public static int size;

    public void Addfirst(int data){
        Node newnNode =new Node(data);
        size++;

        if (head == null) {
            head=tail=newnNode;
            return;
        }
         newnNode.next =head;
         head=newnNode;
    }
    public void printList(){
        if (head==null) {
          System.out.println("LL is empty");
        }
        Node temp= head;
        while (temp != null) {
           System.out.print(temp.data + "->");
           temp=temp.next;
        }
        System.out.println("null");
      }
      public void RemoveNth(int n){
        Node temp = head;
        int sz=0;
        while (temp != null) {
            temp= temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }
        int i=1;
        int iToidx= (sz-n);
        temp =head;
        while (i<iToidx) {
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;

      }

      public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.Addfirst(5);
        ll.Addfirst(4);
        ll.Addfirst(3);
        ll.Addfirst(2);
        ll.Addfirst(1);
        ll.printList();
        ll.RemoveNth(3);
      }
    
}
