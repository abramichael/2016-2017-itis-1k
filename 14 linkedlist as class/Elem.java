
public class Elem {
    private int value;
    private Elem next;

    public Elem(){}

    public Elem(int value, Elem next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Elem getNext() {
        return next;
    }

    public void setNext(Elem next) {
        this.next = next;
    }
}
