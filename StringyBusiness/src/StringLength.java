/**
 * This program demonstrates the String class's length method.
 */
public class StringLength {
    public static void main(String[] args) {

        String name = "Herman Oberth";
        int stringSize;

        stringSize = name.length();
        System.out.println(name + " has " + stringSize + " characters.");
    }
}
/* Also useful: charAt(index) char letter;
                              String name = "Zoli";
                              letter = name.charAt(2) => 'o'
    length() = 4 ; toLowerCase() = "zoli" ; toUpperCase() = "ZOLI"
 */