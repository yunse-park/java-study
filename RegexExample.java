import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String regex = "010-\\d{4}-\\d{4}";

        String phone1 = "010-1234-5678";
        String phone2 = "010-123-5678";

        System.out.println(Pattern.matches(regex, phone1));
        System.out.println(Pattern.matches(regex, phone2));
    }
}
