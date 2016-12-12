package homeworks.hw1;

import java.util.Scanner;

/**
 *
 * This Short program prompts the user for 5 inputs, converts then prints the
 * formatted information.
 *
 * @File HW1Survey
 * @author Ed Fabre
 * @Date 11/6/2016
 */
public class HW1Survey {

    public static void main(String[] args) {
        // Variables
        int EMPLID, age;
        double quiz1, quiz2, quizAvrge, tempInFahrenheit, tempInDegrees;
        Scanner input = new Scanner(System.in); // Creates Scanner utility

        // Prompts
        System.out.print("Enter your Student EMPLID :");
        EMPLID = input.nextInt();
        if (EMPLID < 0 || EMPLID > 999999) {
            do {
                System.out.println("EMPLDID must be between 0-999999 Inclusive");
                System.out.print("Please try again :");
                EMPLID = input.nextInt();

            } while (EMPLID < 0 || EMPLID > 999999);
        }

        System.out.print("Enter your quiz1 percentage score :");
        quiz1 = input.nextDouble();
        if (quiz1 < 0 || quiz1 > 100) {
            do {
                System.out.println("quiz1 percentage must be between 0-100 Inclusive");
                System.out.print("Please try again :");
                quiz1 = input.nextDouble();

            } while (quiz1 < 0 || quiz1 > 100);
        }

        System.out.print("Enter your quiz2 percentage score :");
        quiz2 = input.nextDouble();
        if (quiz2 < 0 || quiz2 > 100) {
            do {
                System.out.println("quiz2 percentage must be between 0-100 Inclusive");
                System.out.print("Please try again :");
                quiz2 = input.nextDouble();

            } while (quiz2 < 0 || quiz2 > 100);
        }

        System.out.print("Enter your age :");
        age = input.nextInt();
        if (age < 0 || age > 120) {
            do {
                System.out.println("Your age must be between 0-120");
                System.out.print("Please try again :");
                age = input.nextInt();

            } while (age < 0 || age > 120);
        }

        System.out.print("Enter the current Temperature in degrees Fahrenheit:");
        tempInFahrenheit = input.nextDouble();

        // Calculations and Conversions.
        quizAvrge = (quiz1 + quiz2) / 2.0;
        tempInDegrees = ((tempInFahrenheit - 32) * 5) / 9;

        // Output
        System.out.println("******* Thank you for completing our survey **********************************");
        System.out.println("Student EMPLID: " + EMPLID);
        System.out.println("Quiz 1 Score: " + quiz1);
        System.out.println("Quiz 2 Score: " + quiz2);
        System.out.println("Average quiz score: " + quizAvrge);
        System.out.printf("Temperature in Celsius: %4.2f\u00b0 %n", tempInDegrees);
        System.out.println("Age: " + age);

    }
}
