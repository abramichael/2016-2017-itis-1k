/**
 * Created by ma on 13.04.2017.
 */
public class CharAndStates implements Comparable<CharAndStates> {
    public Character getChar() {
        return c;
    }

    public void setChar(Character c) {
        this.c = c;
    }

    public States getStates() {
        return states;
    }

    public void setStates(States states) {
        this.states = states;
    }

    public CharAndStates(Character c, States states) {
        this.c = c;
        this.states = states;
    }

    @Override
    public String toString() {
        return "CharAndStates{" +
                "c=" + c +
                ", states=" + states +
                '}';
    }

    private Character c;
    private States states;

    @Override
    public int compareTo(CharAndStates o) {
        if (c != o.getChar()) {
            return c.compareTo(o.getChar());
        } else {
            return states.compareTo(o.getStates());
        }

    }

}
