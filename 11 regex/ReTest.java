package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 1 on 16.12.2016.
 */
public class ReTest {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(?<hours>[0-1][0-9]|2[0-3]):(?<minutes>[0-5][0-9])");
        Matcher m = p.matcher("" +
                "Every day I wake up at 10:00, but today I woke up " +
                "at 07:30. Brhargh!!"
        );
        //System.out.println(m.matches());
        while (m.find()) {
            System.out.println(m.group()+
            //", Hours: " + m.group(1) + ", Minutes: " + m.group(2)
            ", Hours: " + m.group("hours") + ", Minutes: " + m.group("minutes")
            );

        }

    }
}
