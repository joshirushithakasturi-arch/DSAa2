public class Main {

    public static void main(String[] args) {

        System.out.println(
                "JOBMATCH RECRUITMENT SYSTEM");

        BST bst = new BST();

        bst.root =
                bst.insert(bst.root,
                        new Candidate(
                                101,
                                "Rahul",
                                "Java",
                                3));

        bst.root =
                bst.insert(bst.root,
                        new Candidate(
                                102,
                                "Sneha",
                                "Python",
                                2));

        System.out.println(
                "\nBST Traversal");

        bst.inorder(bst.root);

        System.out.println(
                "\nProject Executed Successfully");
    }
}