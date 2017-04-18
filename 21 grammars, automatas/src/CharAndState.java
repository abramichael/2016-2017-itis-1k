/**
 * Created by ma on 11.04.2017.
 */
public class CharAndState implements Comparable<CharAndState>{
    public Character getChar() {
        return c;
    }

    public void setChar(Character c) {
        this.c = c;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "CharAndState{" +
                "char=" + c +
                ", state=" + state +
                '}';
    }

    public CharAndState(Character c, State state) {
        this.c = c;
        this.state = state;
    }

    private Character c;
    private State state;

    @Override
    public boolean equals(Object o) {
        if (o instanceof CharAndState) {
            CharAndState cas = (CharAndState) o;
            return (cas.getChar() == c && cas.getState().equals(state));
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(CharAndState o) {
        if (c != o.getChar()) {
            return c.compareTo(o.getChar());
        } else {
            return state.getState().compareTo(o.getState().getState());
        }

    }
}
