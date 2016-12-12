package discussions.wk7;

import java.util.Random;

/**
 * This class generates X amount random numbers between 0 and upperBound.
 *
 * @author Ed Fabre
 */
public class Week7GenerateRandom {

    /**
     * The args String array is how users input information via commandline.
     *
     * @param args
     */
    public static void main(String[] args) {
        // Initializes a new Random object.
        Random randoms = new Random();

        // Declare two integer variables which will hold the input values.
        int amount;
        int upperBound;

        // This string represents the amount parsed to integer.
        amount = Integer.parseInt(args[0]);

        // This string represents the upper bound parsed to integer.
        upperBound = Integer.parseInt(args[1]);

        // Prints out a title message before printing numbers
        System.out.println("Now printing " + amount
                + " random numbers between "
                + "0 and " + upperBound + ".");

        // This loop prints up to the amount of numbers specified by args[0].
        for (int i = 0; i < amount; i++) {
            // Random number generated from 0 to args[1] upperbound.
            int randomNumber = randoms.nextInt(upperBound);
            System.out.println(randomNumber);
        }
    }

}
