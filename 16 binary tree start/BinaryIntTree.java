/**
 * Created by ma on 09.03.2017.
 */
public class BinaryIntTree {

    private Node<Integer> root;

    private static void makeTreeOnNode(Node<Integer> node, int n) {
        int nLeft = n / 2;
        int nRight = n - 1 - nLeft;
        node.setValue(n);
        if (nLeft > 0) {
            node.setLeft(new Node<Integer>());
            makeTreeOnNode(node.getLeft(), nLeft);
        }
        if (nRight > 0) {
            node.setRight(new Node<Integer>());
            makeTreeOnNode(node.getRight(), nRight);
        }
    }

    public BinaryIntTree(int n) {
        root = new Node<Integer>();
        makeTreeOnNode(root, n);
    }

    public void printTree() {
        printNode(root, 0);
    }
    public static void printNode(Node<Integer> root, int h) {
        if (root != null) {

            printNode(root.getLeft(), h + 1);

            for (int i = 1; i <= h; i++)
                System.out.print("  ");
            System.out.println(root.getValue());

            printNode(root.getRight(), h + 1);
        }
    }

    public static void main(String[] args) {
        BinaryIntTree bit = new BinaryIntTree(31);
        bit.printTree();
    }

}
