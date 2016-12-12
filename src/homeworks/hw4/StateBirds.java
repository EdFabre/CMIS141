package homeworks.hw4;

import homeworks.hw4.StateBirdFlowers;
import java.util.Scanner;

/**
 * This class prompts the user for the state name or none.
 * 
 * @author Ed Fabre
 */
public class StateBirds {
    public static void main(String args[]) {
        // This will of course initialize our scanner object.
        Scanner scanner = new Scanner(System.in);

        // Continue's to prompt the user for a state until "None" entered.
        while (true) {
            System.out.println("Enter a State or None to exit:");
            String inputState = scanner.nextLine();
            
            // This checks to see if the user inputted the string "None".
            if (inputState.toLowerCase().equals("none")) {
                break;
            }

            // If all the checks pass we will attempt to grab the info.
            StateBirdFlowers s = new StateBirdFlowers(inputState);
            System.out.println(s.getBirdAndFlower());
        }
    }
}

