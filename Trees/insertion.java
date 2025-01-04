class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    // Constructor to initialize a new node
    public TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

public class insertion {
    private TreeNode root;

    // Method to insert a value into the BST
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive helper method to insert a value into the BST
    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value > root.value) {
            root.right = insertRec(root.right, value);
        } else if (value < root.value) {
            root.left = insertRec(root.left, value);
        }

        return root;
    }

    // Method to perform an inorder traversal of the BST
    public void inOrder() {
        inOrder(root);
        System.out.println(); // Print a newline after traversal
    }

    // Recursive helper method for inorder traversal
    private void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value + " "); // Print on the same line
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        insertion obj = new insertion();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);

        // Perform inorder traversal
        System.out.println("Inorder Traversal:");
        obj.inOrder();
    }
}




