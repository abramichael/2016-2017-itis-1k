/**
 * Created by ma on 11.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Grammar g = new Grammar();
        System.out.println(g);
        NFA nfa = new NFA(g);
        System.out.println(nfa);
        DFA dfa = new DFA(nfa);
        System.out.println(dfa);
        //dfa.run(String)
    }
}
