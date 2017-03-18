/**
 * Created by ma on 09.03.2017.
 */
import java.util.*;
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


    private static int counter = 0;

    private static void parseKLP(Node<Integer> root) {
        if (root != null) {
			root.setValue(counter++);
            parseKLP(root.getLeft());
            parseKLP(root.getRight());
        }
    }

	
	public void enumerateAsBFS_LP() {

        Queue<Node<Integer>> q = new LinkedList<>();
        q.offer(root);
        counter = 0;
        while (!q.isEmpty()) {
            Node<Integer> p = q.poll();
            p.setValue(counter++);
            if (p.getLeft()!=null)
                q.offer(p.getLeft());
            if (p.getRight()!=null)
                q.offer(p.getRight());
        }
    }
	
    public void enumerateAsDFS_withStack() {

        Stack<Node<Integer>> q = new Stack<>();
        q.push(root);
        counter = 0;
        while (!q.isEmpty()) {
            Node<Integer> p = q.pop();
            p.setValue(counter++);
            if (p.getLeft()!=null)
                q.push(p.getLeft());
            if (p.getRight()!=null)
                q.push(p.getRight());
        }
    }

    public void enumerateAsKLP() {
        counter = 0;
        parseKLP(root);
    }

    public static void printNode(Node<Integer> root, int h) {
        if (root != null) {

            printNode(root.getRight(), h + 1);

            for (int i = 1; i <= h; i++)
                System.out.print("  ");
            System.out.println(root.getValue());

            
            printNode(root.getLeft(), h + 1);
        }
    }

    public static void main(String[] args) {
        BinaryIntTree bit = new BinaryIntTree(31);
        bit.enumerateAsBFS_LP();
        bit.printTree();
    }

}