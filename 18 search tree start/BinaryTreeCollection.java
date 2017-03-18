import java.util.Iterator;

/**
 * Created by ma on 16.03.2017.
 */
public class BinaryTreeCollection<T extends Comparable<T>>
        implements MyCollection<T>, Iterable<T> {

    class Node<T> {
        private T value;
        private Node<T> left, right;

        public Node(T e) {
            this.value = e;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getLeft() {
            return left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }
    }

    private Node<T> root = null;
    private int size = 0;

    @Override
    public boolean add(T e) {
        if (root == null) {
            root = new Node<T>(e);
            return true;
        }
        Node<T> p = root;
        boolean go = true;
        boolean isLeft = true;
        while (go) {
            if (e.compareTo(p.getValue()) < 0) {
                isLeft = true;
                if (p.getLeft() != null) {
                    p = p.getLeft();
                } else {
                    go = false;
                }
            } else {
                isLeft = false;
                if (p.getRight() != null) {
                    p = p.getRight();
                } else {
                    go = false;
                }
            }
        }
        if (isLeft) {
            p.setLeft(new Node<T>(e));
        } else {
            p.setRight(new Node<T>(e));
        }
        return true;
    }

    public void printTree() {
        printNode(root, 0);
    }

    private void printNode(Node<T> p, int h) {
        if (p != null) {
            printNode(p.getRight(), h + 1);

            for (int i = 0; i < h; i++) {
                System.out.print("  ");
            }
            System.out.println(p.getValue());
            printNode(p.getLeft(), h + 1);

        }
    }

    @Override
    public void remove(T e) {

    }



    @Override
    public boolean contains(T e) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
