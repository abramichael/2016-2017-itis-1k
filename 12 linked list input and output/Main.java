import java.util.Scanner;

/**
 * Created by ma on 09.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Elem head = null;
        Elem p;

        int n = 5;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            p = new Elem();
            p.setValue(sc.nextInt());
            p.setNext(head);
            head = p;
        }


        p = head; // i = 0
        while (p != null) { // i < n
            System.out.println(p.getValue());
            p = p.getNext(); //i++
        }

        int s = 0;
        for (p = head; p != null; p = p.getNext()) {
            s += p.getValue();
        }

    }
}
