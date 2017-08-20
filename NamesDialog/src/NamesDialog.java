import javax.swing.*;

/**
 * Using dialogs with JOptionPane
 */
public class NamesDialog {
    public static void main(String[] args) {
        //Declaring String Variables
        String firstName;
        String middleName;
        String lastName;

        // Get user's first name;
        firstName =
                JOptionPane.showInputDialog("What is " +
                        "your first name? ");

        // Get user's second name;
        middleName =
                JOptionPane.showInputDialog("What is " +
                        "your middle name? ");

        // Get user's last name;
        lastName =
                JOptionPane.showInputDialog("What is " +
                        "your last name? ");

        //Display a greeting.
        JOptionPane.showMessageDialog(null, "Hello " +
                firstName + " " +  middleName + " " + lastName + " ");

        System.exit(0);

    }
}
