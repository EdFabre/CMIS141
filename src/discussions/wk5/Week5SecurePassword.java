package discussions.wk5;

import java.util.Scanner;

/**
 *
 * @author EDDY
 */
public class Week5SecurePassword {

    public static void main(String[] args) {
        char[] password;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your passaword. "
                + "MAX Length is 16 characters. "
                + "Password must be Alphanumeric.");
        password = input.next().toCharArray();

        // This loops will loop through the array of characters to determine
        // if the password is a valid alphanumeric.
        for (int i = 0; i < password.length; i++) {
            if (!Character.isDigit(password[i])
                    && !Character.isAlphabetic(password[i])) {
                System.out.println("Password invalid due to character "
                        + password[i]
                        + " at index " + i);
            }
        }

        // This bit of code checks to make sure our password is
        // of appropriate length.
        if (password.length > 16) {
            // This determines and prints out the length of the array.
            System.out.println("The password is too long. Length is "
                    + password.length);
        } else {
            // This determines and prints out the length of the array.
            System.out.println("The length of this password is "
                    + password.length);
        }

    }

}
