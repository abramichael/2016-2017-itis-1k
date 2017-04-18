
public class RegexChecker {
    public boolean checkByRegex(String regex, String input) {
        /*
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.matches();
        */
        return input.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println(
                (new RegexChecker()).checkByRegex("[01]0+", "00111")
        );
    }
}
