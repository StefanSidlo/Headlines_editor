import java.util.Arrays;

/**
 * Class for dealing with correct format.
 *
 * @author Stefan Sidlovsky
 */
public class Format {

    /**
     * Controls if input is array with "[]" brackets.
     *
     * @param input String that represents array of strings (headlines)
     * @return True if format is valid, otherwise false
     */
    public static boolean isValidFormat(String input) {
        return input.charAt(0) == '[' && input.charAt(input.length() - 1) == ']';
    }

    /**
     * Creates Java array of strings from String input.
     *
     * @param input String that represents array of strings (headlines)
     * @return Array of strings
     */
    public static String[] formatInput(String input) {
        // Getting rid of [] brackets
        input = input.substring(1, input.length() - 1);

        // Creating JAVA array of Strings
        String[] javaArray = input.split(", |,");

        return Arrays.stream(javaArray)
                .map(s -> s.replaceAll("\"", ""))
                .filter(s -> !s.isBlank())
                .toArray(String[]::new);
    }
}
