public class MyLinkedIntList {
    private Elem head;

    public void add(int x) {
        addHead(x);
    }

    public void addHead(int x) {
        Elem p = new Elem(x, head);
        head = p;
    }
}
