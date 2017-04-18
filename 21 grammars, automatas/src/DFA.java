import java.util.*;

/**
 * Created by ma on 13.04.2017.
 */
public class DFA {
    @Override
    public String toString() {
        return "DFA{" +
                "alphabet='" + alphabet + '\'' +
                ", transitions=" + transitions +
                ", startState=" + startState +
                ", finalState=" + finalState +
                '}';
    }

    private String alphabet;
    private Map<CharAndStates, States> transitions = new TreeMap<>();
    private States startState;
    private States finalState;
    public DFA(NFA nfa) {
        alphabet = nfa.getAlphabet();
        startState = new States();
        startState.add(nfa.getStartState());
        Queue<States> q = new LinkedList<>();
        q.offer(startState);
        Map<CharAndState, List<State>> nfaTr = nfa.getTransitions();
        while (!q.isEmpty()) {
            States from = q.poll();

            for (int i = 0; i < alphabet.length(); i++) {
                States to = new States();
                Character c = alphabet.charAt(i);
                for (State state: from) {
                    CharAndState cas = new CharAndState(c, state);
                    List<State> lst = nfaTr.get(cas);
                    if (lst == null)
                        continue;
                    for (State s: lst) {
                        to.add(s);
                    }
                }
                CharAndStates cass = new CharAndStates(c, from);
                transitions.put(cass, to);
                boolean yes = false;
                for (CharAndStates casss: transitions.keySet()) {
                    if (casss.getStates().compareTo(to) == 0) {
                        yes = true;
                        break;
                    }
                }
                if (!yes) {
                    q.offer(to);
                }
            }
        }
    }
}
