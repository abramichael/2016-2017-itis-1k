/**
 * Created by ma on 13.04.2017.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class States extends TreeSet<State> implements Comparable<States>{

    @Override
    public int compareTo(States o) {
        if (Arrays.equals(this.toArray(), o.toArray()))
            return 0;
        else
            return 1;
    }
}
