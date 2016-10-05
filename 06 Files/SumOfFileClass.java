import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumOfFileClass {

    public static void main(String [] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("input.txt"));

        int s = 0;
        
        do {
            int x = scanner.nextInt();
            s += x;
        }
        while (scanner.hasNextInt());

        System.out.println(s);
        
    }

}