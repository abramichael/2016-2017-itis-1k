import java.util.*;

/**
 * Created by ma on 11.04.2017.
 */
public class NFA {
    private Map<CharAndState, List<State>> transitions = new TreeMap<>();
    private State startState;
    private String alphabet;

    public Map<CharAndState, List<State>> getTransitions() {
        return transitions;
    }

    public State getStartState() {
        return startState;
    }

    public State getFinalState() {
        return finalState;
    }

    private State finalState = new State("$%@KJS#1".hashCode() + "");
    public NFA(Grammar g) {
        alphabet = g.getTerminals();
        startState = new State(g.getStartNonterminal());
        Map<String, List<RightSideElem>> prods = g.getProductions();
        for (String leftSide : prods.keySet()) {
            State from = new State(leftSide);
            for (RightSideElem rse: prods.get(leftSide)) {
                // terminal always in right side
                Character c = rse.getTerminal();
                CharAndState cas = new CharAndState(c, from);
                State to;
                if (rse.getNonterminal().equals("")) {
                    to = finalState;
                } else {
                    to = new State(rse.getNonterminal());
                }
                if (transitions.containsKey(cas)) {
                    List<State> lst = transitions.get(cas);
                    lst.add(to);
                } else {
                    List<State> lst = new ArrayList<>();
                    lst.add(to);
                    transitions.put(cas, lst);
                }


            }
        }
    }

    @Override
    public String toString() {
        return "NFA{" +
                "transitions=" + transitions +
                ", startState=" + startState +
                ", finalState=" + finalState +
                '}';
    }

    public String getAlphabet() {
        return alphabet;
    }
}
