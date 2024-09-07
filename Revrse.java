

public class Revrse {
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

      public void reverse() {
        Node prev =null;
        Node curr=tail =head;
        Node next;

        while (curr != null) {
            next =curr.next;
            curr.next=prev;
            prev =curr;
            curr=next;
        }
        head=prev;
      }
    

    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.Addfirst(1);
        ll.Addfirst(2);
        ll.Addfirst(3);
        ll.Addfirst(4);
        ll.printList();
        ll.reverse();
        ll.printList();
    }
}
