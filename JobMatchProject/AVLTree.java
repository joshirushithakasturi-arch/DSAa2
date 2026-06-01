class AVLNode {
    Candidate data;
    AVLNode left, right;
    int height;

    AVLNode(Candidate data) {
        this.data = data;
        height = 1;
    }
}

public class AVLTree {

    int height(AVLNode n) {
        return n == null ? 0 : n.height;
    }

    int balance(AVLNode n) {
        return n == null ? 0 :
                height(n.left) - height(n.right);
    }

    AVLNode rightRotate(AVLNode y) {

        AVLNode x = y.left;
        AVLNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height =
                Math.max(height(y.left),
                        height(y.right)) + 1;

        x.height =
                Math.max(height(x.left),
                        height(x.right)) + 1;

        return x;
    }

    AVLNode leftRotate(AVLNode x) {

        AVLNode y = x.right;
        AVLNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height =
                Math.max(height(x.left),
                        height(x.right)) + 1;

        y.height =
                Math.max(height(y.left),
                        height(y.right)) + 1;

        return y;
    }

    AVLNode insert(AVLNode node, Candidate data) {

        if (node == null)
            return new AVLNode(data);

        if (data.id < node.data.id)
            node.left = insert(node.left, data);
        else if (data.id > node.data.id)
            node.right = insert(node.right, data);
        else
            return node;

        node.height =
                1 + Math.max(height(node.left),
                        height(node.right));

        int bal = balance(node);

        if (bal > 1 &&
                data.id < node.left.data.id)
            return rightRotate(node);

        if (bal < -1 &&
                data.id > node.right.data.id)
            return leftRotate(node);

        return node;
    }

    void preorder(AVLNode root) {

        if (root != null) {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
}