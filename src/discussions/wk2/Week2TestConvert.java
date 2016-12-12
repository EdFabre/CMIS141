package discussions.wk2;

import java.util.Scanner;

/**
 *
 * @author EDDY
 */
public class Week2TestConvert {

    public static void main(String[] args) {
        double score;
        Scanner input = new Scanner(System.in);

        System.out.println("Input your score: ");
        score = input.nextDouble();
        letterGrade(score);
    }

    /**
     * This method converts a precise grade to a letter grade; ex. A, B, C, D, E
     * then outputs a message including the letter grade.
     */
    public static void letterGrade(double percentage) {
        char grade = 0;

        if ((percentage / 10) >= 9) {
            grade = 'A';
        } else if ((percentage / 10) == 8) {
            grade = 'B';
        } else if ((percentage / 10) == 7) {
            grade = 'C';
        } else if ((percentage / 10) == 6) {
            grade = 'D';
        } else if ((percentage / 10) <= 5) {
            grade = 'F';
        } else {
            System.out.println("If you made it here there's a problem:");
        }

        switch (grade) {
            case 'A':
                System.out.println("Grade: " + grade);
                System.out.println("Excellent Job");
                break;
            case 'B':
                System.out.println("Grade: " + grade);
                System.out.println("Good Job");
                break;
            case 'C':
                System.out.println("Grade: " + grade);
                System.out.println("Average Job");
                break;
            case 'D':
                System.out.println("Grade: " + grade);
                System.out.println("Below Average Job");
                break;
            case 'F':
                System.out.println("Grade: " + grade);
                System.out.println("Did you study?");
                break;
            default:
                break;
        }
    }
}
