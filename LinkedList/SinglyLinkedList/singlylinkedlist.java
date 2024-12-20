public class singlylinkedlist {
    Node head;

    // Inner Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at tail
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    // Insert at a specific position
    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Position should be greater than or equal to 0");
            return;
        }

        if (position == 0) {
            insertAtHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node curNode = head;

        for (int i = 0; i < position - 1; i++) {
            if (curNode == null) {
                System.out.println("Position is greater than the length of the list");
                return;
            }
            curNode = curNode.next;
        }

        if (curNode == null) {
            System.out.println("Position is greater than the length of the list");
            return;
        }

        newNode.next = curNode.next;
        curNode.next = newNode;
    }

    // Delete the head node
    public void deleteHead() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        head = head.next;
    }

    // Delete the tail node
    public void deleteTail() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head.next == null) { // Single node case
            head = null;
            return;
        }
        Node curNode = head;
        while (curNode.next.next != null) { // Stop at the second-to-last node
            curNode = curNode.next;
        }
        curNode.next = null; // Remove the last node
    }

    // Delete a node at a specific position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        if (position < 0) {
            System.out.println("Position should be greater than or equal to 0");
            return;
        }

        if (position == 0) { // Deleting the head node
            deleteHead();
            return;
        }

        Node curNode = head;

        for (int i = 0; i < position - 1; i++) {
            if (curNode == null || curNode.next == null) {
                System.out.println("Position is greater than the length of the list");
                return;
            }
            curNode = curNode.next;
        }

        if (curNode.next == null) {
            System.out.println("Position is greater than the length of the list");
            return;
        }

        curNode.next = curNode.next.next; // Skip the node at the specified position
    }

    // Display the list
    public void displayList() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    // Main method for testing
    public static void main(String[] args) {
        singlylinkedlist list = new singlylinkedlist();

        // Insertion operations
        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtPosition(15, 1);
        list.insertAtPosition(5, 0);
        list.insertAtPosition(40, 5); // Out-of-range position
        list.insertAtHead(100);

        // Display the list
        System.out.println("Linked list after insertions:");
        list.displayList(); // Expected output: 5 -> 10 -> 15 -> 20 -> 30 -> NULL

        // Deletion operations
        list.deleteHead();
        System.out.println("After deleting head:");
        list.displayList(); // Expected output: 10 -> 15 -> 20 -> 30 -> NULL

        list.deleteTail();
        System.out.println("After deleting tail:");
        list.displayList(); // Expected output: 10 -> 15 -> 20 -> NULL

        list.deleteAtPosition(1);
        System.out.println("After deleting at position 1:");
        list.displayList(); // Expected output: 10 -> 20 -> NULL

        list.deleteAtPosition(5); // Out-of-range position
        list.displayList();
    }
}
