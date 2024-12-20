class reverselinkedlist{

    
    Node head;

    class Node{
        int data;
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

    public void reverse(){
        Node curNode=head;
        Node previous=null;

        while(curNode!=null){
            Node curNext=curNode.next;
            curNode.next=previous;
            previous=curNode;
            curNode=curNext;
        }
        head=previous;
    }

    public void display(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        Node curNode=head;

        while(curNode!=null){
            System.out.print(curNode.data+"->");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {

        reverselinkedlist obj=new reverselinkedlist();

        obj.insertAtHead(10);
        obj.insertAtHead(20);
        obj.insertAtHead(30);
        obj.display();
        obj.reverse();
        obj.display();
        
    }


}