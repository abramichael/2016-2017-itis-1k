/**
 * Created by ma on 09.03.2017.
 */
public class Task01 {
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 2; i <= n; i++ ) {
            int k = i;
            while (k % 2 == 0) {
                k = k / 2;
            }
            while (k % 3 == 0) {
                k = k / 3;
            }
            while (k % 5 == 0) {
                k = k / 5;
            }
            if (k == 1) {
                System.out.println(i);
            }
        }

    }
}
