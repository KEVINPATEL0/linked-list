package linkedlist;

//basic of ll 

public class LinkedList {
    public static class Node {
    int data;
    Node next;
     
      public Node(int data){
        this.data=data;
        this.next=null;
      }   
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void Addfirst(int data){
      //step 1 create newnode
      Node newnode=new Node(data);
      size++;
      if (head == null) {
        head=tail=newnode;
        return;
      }
      //S2 assign next to head
      newnode.next=head;
      //S3 change head(shift) to newnode
      head=newnode;
    }

    public void Addlast(int data){
      //step 1 create newnode
      Node newnode=new Node(data);
      size++;
      if (head == null) {
        head=tail=newnode;
        return;
      }
      //S2 assign  tail's next to newnode
      tail.next=newnode;
      //S3 change tail(shift) to newnode
      tail=newnode;
    }

    public void Addmid(int idx,int data){
      if (idx==0) {
        Addfirst(data);
        return;
      }
      Node newNode=new Node(data);
      size++;
      Node temp=head;
      int i=0;
      while (i< idx-1) {
        temp=temp.next;
        i++;
      }
      newNode.next=temp.next;
      temp.next=newNode;
    }

    public int Removefirst() {
      int val =head.data;
      if (size == 0) {
        System.out.println("empty ll");
        return Integer.MIN_VALUE;
      }else if (size==1) {
        head=tail=null;
        size =0;
        return val;
      }
        head=head.next;
        size--;
        return val; 
    }

    public int RemoveLast(){
      if (size==0) {
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
      }else if (size==1) {
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
      }
      Node prev=head;
        for(int i=0;i<size-2;i++){
          prev=prev.next;
        }
        int val=prev.next.data; // tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int helper(Node head,int key){
      if (head ==null) {
        return -1;
      }
      if (head.data == key) {
        return 0;
      }
      int idx = helper(head.next, key);
      if (idx == -1) {
        return -1;
      }
      return idx+1;
    }
    
    public int recsearch(int key){
      return helper(head,key);
    }

    public int search(int key){
      Node temp= head;
      int i=0;
      while (temp != null) {
        if (key == temp.data) {
          return i;
        }
        temp =temp.next;
        i++;
      }

      return -1;
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
    // public void reverse() {
    //   Node prev =null;
    //   Node curr=tail =head;
    //   Node next;

    //   while (curr != null) {
    //       next =curr.next;
    //       curr.next=prev;
    //       prev =curr;
    //       curr=next;
    //   }
    //   head=prev;
    // }

    
   
    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
     
        ll.Addfirst(1);    
     
        ll.Addfirst(2);
     
        ll.Addfirst(3);
       
        ll.Addlast(4);
        ll.printList();
      //  ll.reverse();
        ll.printList();
        }

       
                                  
}