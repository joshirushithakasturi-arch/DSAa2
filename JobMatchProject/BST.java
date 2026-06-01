class BSTNode {
    Candidate data;
    BSTNode left, right;

    BSTNode(Candidate data) {
        this.data = data;
    }
}

public class BST {

    BSTNode root;

    BSTNode insert(BSTNode root, Candidate data) {

        if (root == null)
            return new BSTNode(data);

        if (data.id < root.data.id)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    void inorder(BSTNode root) {

        if (root != null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
}