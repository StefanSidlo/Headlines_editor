import java.util.Arrays;

/**
 * Class with the main functionality for editing headlines.
 *
 * @author Stefan Sidlovsky
 */
public class Functionality {

    /**
     * Removes all numeric symbols from the String text.
     *
     * @param text String input text
     * @return text without numbers
     */
    public static String removeNumbers(String text) {
        return text.replaceAll("\\d", "");
    }

    /**
     * Capitalizes the first character in the every word in sentence.
     *
     * @param text String input text
     * @return text where first letter of each word is capitalized
     */
    public static String capitalizeWords(String text) {
        StringBuilder result = new StringBuilder();
        boolean firstLetter = true;
        for (int i = 0; i < text.length(); i++) {
            if (firstLetter && Character.isLetter(text.charAt(i))) {
                result.append(Character.toUpperCase(text.charAt(i)));
                firstLetter = false;
                continue;
            }
            if (!Character.isLetter(text.charAt(i))) {
                firstLetter = true;
            }
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    /**
     * Removes numbers, capitalizes first letter of each word and
     * creates a single string by concatenating the strings in the array.
     *
     * @param input String array of headlines
     * @return String of edited headline
     */
    public static String editHeadline(String[] input) {
        String[] edited = Arrays.stream(input)
                .map(Functionality::removeNumbers)
                .map(Functionality::capitalizeWords)
                .filter(s -> !s.isBlank())
                .toArray(String[]::new);
        return String.join("", edited);
    }
}
