public class addtwonumbers {
    Node head;

    class Node{
        Node data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertAtHead(int data){
        Node newNode=new Node(data);

        newNode.next=head;
        head=newNode;
    }

    public void display(){
        if(head==null){
            System.out.println("Linked List is empty");
        }
        Node curNode=head;

        while(curNode!=null){
            System.out.println(curNode.data+"->");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }






    public static void main(String[] args) {

        addtwonumbers obj=new addtwonumbers();

        obj.insertAtHead(10);
        obj.insertAtHead(20);
        obj.insertAtHead(30);
        obj.display();
        
    }
}
