/**
 * Created by ma on 13.04.2017.
 */
public class State implements Comparable<State> {
    private String state;

    @Override
    public String toString() {
        return "State{" +
                state +
                '}';
    }

    public State(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof State) {
            return state.equals(((State) o).getState());
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(State o) {
        return state.compareTo(o.getState());
    }
}
