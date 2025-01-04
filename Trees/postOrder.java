import java.util.Scanner;

public class postOrder {
    TreeNode root;
    
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Method to insert a new node into the tree
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive method to insert data into the tree
    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data); // Create a new node if root is null
            return root;
        }

        // If the data is greater, go to the right subtree
        if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        // If the data is smaller, go to the left subtree
        else if (data < root.data) {
            root.left = insertRec(root.left, data);
        }
        return root;
    }

    // Method to perform pre-order traversal
    public void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    // Recursive method for pre-order traversal (root, left, right)
    private void postOrderRec(TreeNode root) {
        if (root != null) {
            postOrderRec(root.left);  // Traverse left subtree
            postOrderRec(root.right); // Traverse right subtree
            System.out.print(root.data + " ");  // Visit root

        }
    }

    public static void main(String[] args) {
        postOrder obj = new postOrder();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to add:");

        int n = sc.nextInt();

        System.out.println("Enter the elements:");

        // Reading inputs and inserting elements into the tree
        for (int i = 0; i < n; i++) {
            int list = sc.nextInt();
            obj.insert(list);
        }

        System.out.println("Pre-order traversal of the tree:");
        obj.postOrder();  // Performing pre-order traversal
    }
}
