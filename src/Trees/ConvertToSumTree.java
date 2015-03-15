package Trees;

public class ConvertToSumTree {

    public static void main(String[] args) {

        Node root = Input.treeInput();
        traversal.pre_Order(root);
        convert(root);
        System.out.println();
        traversal.pre_Order(root);

    }

    private static int convert(Node root) {

        if (root == null) {
            return 0;
        }

        int old_val = root.info;

        root.info = convert(root.left) + convert(root.right);

        return old_val + root.info;

    }

}