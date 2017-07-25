/**
 * This program demonstrates a few of the String methods.
 */
public class StringMethods {
    public static void main(String[] args) {
        String message = "Shiit is getting complicated!";
        //message is the name of the String
        String upper = message.toUpperCase();
        String lower = message.toLowerCase();
        char letter = message.charAt(4);
        int stringSize = message.length();
        // "upper" "lower" "letter" "stringSize" are variable names. (I guess)

        System.out.println(message);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(letter);
        System.out.println(stringSize);

        //REFORMAT with Ctrl+Alt+L   RUN with Ctrl+Shift+F10


    }
}
