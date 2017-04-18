import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Grammar {

    private String defaultFilename = "grammar.txt";
    private String terminals;
    private List<String> nonTerminals;
    private String startNonterminal;
    private Map<String, List<RightSideElem>> productions;

    public Grammar() {
        readGrammar(defaultFilename);
    }

    private void readGrammar(String filename) {
        try {
            Scanner sc = new Scanner(new File(filename));
            terminals = sc.nextLine();
            nonTerminals = Arrays.asList(sc.nextLine().split(" "));
            startNonterminal = sc.nextLine();
            productions = new HashMap<>();
            while (sc.hasNextLine()) {
                String[] args = sc.nextLine().split(" -> ");
                String[] rightSides = args[1].split("\\|");

                List<RightSideElem> lst = Arrays.stream(rightSides)
                        .map((x) -> new RightSideElem(
                                            x.charAt(0),
                                            x.substring(1)
                                    ))
                        .collect(Collectors.toList());
                productions.put(args[0], lst);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Grammar{" +
                "terminals='" + terminals + '\'' +
                ", nonTerminals=" + nonTerminals +
                ", startNonTerminal='" + startNonterminal + '\'' +
                ", productions=" + productions +
                '}';
    }

    public String getStartNonterminal() {
        return startNonterminal;
    }

    public Map<String, List<RightSideElem>> getProductions() {
        return productions;
    }

    public String getTerminals() {
        return terminals;
    }
}