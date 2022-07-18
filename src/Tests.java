import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;


/**
 * Class for testing each method from Format and Functionality class.
 *
 * @author Stefan Sidlovsky
 */
public class Tests {

    @Test
    public void removeNumbersTest() {
        String input1 = "break3ing news5:";
        String input2 = "2Here2 ";
        String input3 = "444444Ph0ot0o o00f t7452h4e day: ";
        String input4 = "Stranger danger";

        assertEquals("breaking news:", Functionality.removeNumbers(input1));
        assertEquals("Here ", Functionality.removeNumbers(input2));
        assertEquals("Photo of the day: ", Functionality.removeNumbers(input3));
        assertEquals("Stranger danger", Functionality.removeNumbers(input4));
    }

    @Test
    public void capitalizeWordsTest() {
        String input1 = "A circle is round!";
        String input2 = "eat;sleep;repeat";
        String input3 = "today#is~a/nice*day";
        String input4 = "Fresh fried fish - fish fresh fried";

        assertEquals("A Circle Is Round!", Functionality.capitalizeWords(input1));
        assertEquals("Eat;Sleep;Repeat", Functionality.capitalizeWords(input2));
        assertEquals("Today#Is~A/Nice*Day", Functionality.capitalizeWords(input3));
        assertEquals("Fresh Fried Fish - Fish Fresh Fried", Functionality.capitalizeWords(input4));
    }

    @Test
    public void editHeadlineTest() {
        String[] input1 = {"break3ing news5:", "1A 1circle is round!"};
        String[] input2 = {"", "Fresh fried fish - fish fresh fried"};
        String[] input3 = {"2Here2 ", "is", " our STRING"};
        String[] input4 = {"123 ", "eat;sleep;repeat", "321"};

        assertEquals("Breaking News:A Circle Is Round!", Functionality.editHeadline(input1));
        assertEquals("Fresh Fried Fish - Fish Fresh Fried", Functionality.editHeadline(input2));
        assertEquals("Here Is Our STRING", Functionality.editHeadline(input3));
        assertEquals("Eat;Sleep;Repeat", Functionality.editHeadline(input4));
    }

    @Test
    public void isValidFormatTest() {
        String input1 = "[\"2Here2 \", \"is\", \" our STRING\"]";
        String input2 = "{\"2Here2 \", \"is\", \" our STRING\"}";
        String input3 = "[\"2Here2 \", \"is\", \" our STRING\"] ";
        String input4 = "     [\"2Here2 \", \"is\", \" our STRING\"]   ";

        assertTrue(Format.isValidFormat(input1));
        assertFalse(Format.isValidFormat(input2));
        assertFalse(Format.isValidFormat(input3));
        assertFalse(Format.isValidFormat(input4));
    }

    @Test
    public void formatInputTest() {
        String input1 = "[\"break3ing news5:\", \"1A 1circle is round!\"]";
        String input2 = "[\"\",\"Fresh fried fish - fish fresh fried\"]";
        String input3 = "[\"2Here2 \", \"is\", \" our STRING\"]";
        String input4 = "[\"123 \",\"eat;sleep;repeat\",\"321\"]";

        String[] expected1 = {"break3ing news5:", "1A 1circle is round!"};
        String[] expected2 = {"Fresh fried fish - fish fresh fried"};
        String[] expected3 = {"2Here2 ", "is", " our STRING"};
        String[] expected4 = {"123 ", "eat;sleep;repeat", "321"};

        assertArrayEquals(expected1, Format.formatInput(input1));
        assertArrayEquals(expected2, Format.formatInput(input2));
        assertArrayEquals(expected3, Format.formatInput(input3));
        assertArrayEquals(expected4, Format.formatInput(input4));
    }
}
