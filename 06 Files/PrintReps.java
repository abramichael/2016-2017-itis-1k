import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class PrintReps {

    public static void main(String [] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("reps.txt"));
        PrintWriter pw = new PrintWriter("repsNewFormat.txt");

        do {
            String s = sc.nextLine();
            String [] strings = s.split("%");
            String name = strings[0].substring(2);
            pw.println(name);
            pw.println(strings[1]);
        }
        while (sc.hasNextLine());

        pw.close();

    }

}