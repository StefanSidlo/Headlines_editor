import java.util.Scanner;

/**
 * Demo class with main method for running the program.
 *
 * @author Stefan Sidlovsky
 */
public class Demo {

    /**
     * Main method for running the program.
     * Firstly it asks user for input for Scanner
     * and then controls the input.
     * After that, user gets the edited headline printed
     * on the command line.
     *
     * @param args Arguments passed to command line when running the program
     */
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Your input (format [\"string1\", \"string2\", \"string3\", ...]):");
        String headline = inputScanner.nextLine();

        if (!Format.isValidFormat(headline)) {
            System.out.println("Wrong format");
            return;
        }

        String[] inputJavaArray = Format.formatInput(headline);
        System.out.println("Edited headline:");
        System.out.println(Functionality.editHeadline(inputJavaArray));
    }

}
