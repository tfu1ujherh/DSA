public class removenthnode {

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

    public void display(){
        if(head==null){
            System.out.print("Linked list is empty");
        }

            Node curNode=head;
            while(curNode!=null){
                System.out.print(curNode.data+"->");
                curNode=curNode.next;
            }
            System.out.println("NULL");
       
    }

    public void deletenode(int n){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        Node dummyNode=new Node(0);
        dummyNode.next=head;
        Node fast=dummyNode;
        Node slow=dummyNode;

        for(int i=0;i<=n;i++){
            fast=fast.next;
        }

        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        if(slow.next!=null){
        slow.next=slow.next.next;
        }else{
            System.out.println("Unable to delete the node");
        }

    }

    public static void main(String[] args) {
        

        removenthnode obj=new removenthnode();

        obj.insertAtHead(10);
        obj.insertAtHead(20);
        obj.insertAtHead(30);
        obj.insertAtHead(40);
        obj.insertAtHead(50);
        obj.display();

        obj.deletenode(3);
        obj.display();
    }
    
}
