/**
 * Created by ma on 11.04.2017.
 */
class RightSideElem {

    private Character terminal;
    private String nonterminal;

    public RightSideElem(Character terminal, String nonterminal) {
        this.terminal = terminal;
        this.nonterminal = nonterminal;
    }

    public RightSideElem(Character terminal) {
        this.terminal = terminal;
    }

    public Character getTerminal() {
        return terminal;
    }

    public void setTerminal(Character terminal) {
        this.terminal = terminal;
    }

    public String getNonterminal() {
        return nonterminal;
    }

    public void setNonterminal(String nonterminal) {
        this.nonterminal = nonterminal;
    }

    public String toString() {
        return "T:" + terminal + ";NT:" + nonterminal;
    }
}