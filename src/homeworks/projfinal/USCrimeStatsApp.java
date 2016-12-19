package homeworks.projfinal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author
 */
public class USCrimeStatsApp {

    // Grabbing the standard scanner.
    private static Scanner input = new Scanner(System.in);

    // This global ArrayList will store all our USCrimeClass objects.
    private static ArrayList<USCrimeClass> csvList;

    /**
     * This method will display the options available to the user.
     */
    public static void displayMenu() {
        String menu = "Enter the number of the question you want answered. "
                + "Enter ‘Q’ to quit the program :\n\n"
                + "1. What were the percentages in population growth for "
                + "each consecutive year from 1994 – 2013?\n"
                + "2. What year was the Murder rate the highest?\n"
                + "3. What year was the Murder rate the lowest?\n"
                + "4. What year was the Robbery rate the highest?\n"
                + "5. What year was the Robbery rate the lowest?\n"
                + "6. What was the total percentage change in Motor Vehicle "
                + "Theft between 1998 and 2012?\n"
                + "7. What was the total percentage change in property crimes "
                + "between 2011 and 2013?\n"
                + "8. What was the total percentage change in murder crimes "
                + "between 2012 and 2013?\n"
                + "Q. Quit the program";
        System.out.println(menu);
    }

    /**
     * function returns the highest murder rate for a year
     *
     * @param data
     * @return year with highest murder rate
     */
    static int yearWithHighestMurderRate() {
        int year = -1;
        float currRate = -1;
        for (int i = 0; i < csvList.size(); i++) {
            if (csvList.get(i).getMurderRates() > currRate) {
                currRate = csvList.get(i).getMurderRates();
                year = csvList.get(i).getYear();
            }
        }
        return year;
    }

    /**
     * function returns the lowest murder rate for a year
     *
     * @param data
     * @return year with lowest murder rate
     */
    static int yearWithLowestMurderRate() {
        int year = -1;
        float currRate = 999999; // A insanely high number is used to test.
        for (int i = 0; i < csvList.size(); i++) {
            if (csvList.get(i).getMurderRates() < currRate) {
                currRate = csvList.get(i).getMurderRates();
                year = csvList.get(i).getYear();
            }
        }
        return year;
    }

    /**
     * function returns year with highest robbery rate
     *
     * @param data
     * @return year with highest robbery rate
     */
    static int yearWithHighestRobberyRate() {
       int year = -1;
        float currRate = -1; // A insanely low number is used to test.
        for (int i = 0; i < csvList.size(); i++) {
            if (csvList.get(i).getRobberyRate()> currRate) {
                currRate = csvList.get(i).getRobberyRate();
                year = csvList.get(i).getYear();
            }
        }
        return year;
    }

    /**
     * function returns year with lowest robbery rate
     *
     * @param data
     * @return year with lowest robbery rate
     */
    static int yearWithLowestMRobberyRate() {
        int year = -1;
        float currRate = 999999; // A insanely high number is used to test.
        for (int i = 0; i < csvList.size(); i++) {
            if (csvList.get(i).getRobberyRate() < currRate) {
                currRate = csvList.get(i).getRobberyRate();
                year = csvList.get(i).getYear();
            }
        }
        return year;
    }
//
//    /**
//     * function calculates the percentage change in motor vehicle theft between
//     * 1998-2012
//     *
//     * @param data
//     * @return
//     */
//    static float getPercentageChangeInMotorVehicleTheftBetween1998_2012(USCrimeClass[] data) {
//        float change;
//        int motorVehicleTheftIn1998 = data[4].getMotorVehicleTheft();
//        int motorVehicleTheftIn2012 = data[18].getMotorVehicleTheft();
//        change = (float) (motorVehicleTheftIn2012 - motorVehicleTheftIn1998) * 100 / motorVehicleTheftIn1998;
//        return change;
//    }
//
//    /**
//     * function calculates the percentage change in murder crime rate between
//     * 2012 and 2013
//     *
//     * @param data
//     * @return
//     */
//    static float getPercentageChangeInMurderCrimeRateBetween2012_2013(USCrimeClass[] data) {
//        float change;
//        float murderRateIn2012 = data[18].getRateOfMurder();
//        float murderRateIn2013 = data[19].getRateOfMurder();
//        change = (murderRateIn2013 - murderRateIn2012) * 100 / murderRateIn2012;
//        return change;
//    }
//
//    /**
//     * function calculates the percentage change in property crime rate between
//     * 2011-2013
//     *
//     * @param data
//     * @return
//     */
//    static float getPercentageChangeInPropertyCrimeBetween2011_2013(USCrimeClass[] data) {
//        float change;
//        int propertCrimeIn2011 = data[17].getPropertyCrime();
//        int propertCrimeIn2013 = data[19].getPropertyCrime();
//        change = (float) (propertCrimeIn2013 - propertCrimeIn2011) * 100 / propertCrimeIn2011;
//        return change;
//    }

    /**
     * function displays the percentage population for each consecutive year
     *
     * @param data
     */
    static void displayPercentagePopulationGrowth(USCrimeClass[] data) {
        float growth;
        for (int i = 0; i < data.length - 1; i++) {
            growth = 100 * (float) (data[i + 1].getPopulation() - data[i].getPopulation()) / data[i].getPopulation();
            System.out.println("[" + data[i].getYear() + "-" + data[i + 1].getYear() + "]: " + String.format("%.4f", growth) + "%");
        }
    }

    /**
     * Grabs the input from user
     *
     * @return The choice.
     */
    public static String getUserInput() {
        String choice;
        System.out.println("Enter your selection: ");
        choice = input.next();
        return choice;
    }

    public static void inputManager(Map<Integer, USCrimeClass> map) {
        String choice = null;
        while (choice.toLowerCase() != "q") {

            // Displays the possible inputs.
            displayMenu();

            // This calls on the private method to grab users choice.
            choice = getUserInput();
            System.out.println();

//            switch (choice) {
//                case "1":
//                    displayPercentagePopulationGrowth(data);
//                    break;
//                case "2":
//                    System.out.println("The Murder rate was highest in " + yearWithHighestMurderRate());
//                    break;
//                case "3":
//                    System.out.println("The Murder rate was lowest in " + yearWithLowestMurderRate());
//                    break;
//                case "4":
//                    System.out.println("The Robbery rate was highest in " + yearWithHighestRobberyRate());
//                    break;
//                case "5":
//                    System.out.println("The Robbery rate was lowest in " + yearWithLowestMRobberyRate());
//                    break;
//                case "6":
//                    System.out.println("Total Percentage change in motor vehicle theft between(1998-2012) is " + String.format("%.4f", getPercentageChangeInMotorVehicleTheftBetween1998_2012(data)) + "%");
//                    break;
//                case "7":
//                    System.out.println("Total Percentage change in property crimes between 2011 and 2013 is " + String.format("%.4f", getPercentageChangeInPropertyCrimeBetween2011_2013(data)) + "%");
//                    break;
//                case "8":
//                    System.out.println("Total Percentage change in murder crimes between 2012 and 2013 is " + String.format("%.4f", getPercentageChangeInMurderCrimeRateBetween2012_2013(data)) + "%");
//                    break;
//                case "Q":
//                    System.out.println("Thank you for trying the US Crimes Statistics Program.");
//                    return;
//                default:
//                    System.out.println("Error: Invalid choice selected!! Try again.\n");
//            }
        }
    }

    /**
     * Reads the Crime.csv file and returns a map of all USCrimeClass objects
     * which are accessible using their years as keys.
     *
     * @param filename
     * @return
     */
    static ArrayList<USCrimeClass> readFile(String filename) {
        // Makes sure the map is empty before adding objects.
        csvList = new ArrayList<>();

        // This string represents a csv row including delimiters.
        String line;

        try {
            // Initialize a file reader to read the file.
            Scanner fileReader = new Scanner(new FileInputStream(
                    new File(filename)));

            // Skip headers
            fileReader.nextLine();

            /* This loop will continue until it reaches a blank row. 
               It will then add the record to the map.
             */
            while (fileReader.hasNextLine()) {
                line = fileReader.nextLine();

                USCrimeClass record = new USCrimeClass(line);
                csvList.add(record);
            }
        } catch (FileNotFoundException e) {
            // Catches file not found exception.
            System.out.println(e);
        }
        return csvList;
    }

    /**
     * This is used forJUNIT testing to make sure the program stored necessary
     * number of map objects.
     *
     * @return
     */
    public static int getSize() {
        return csvList.size();
    }

    public static void main(String[] args) {
        System.out.println("********** Welcome to the US Crime Statistical "
                + "Application **************************" + "\n");

        if (args.length != 1) {
            System.out.println("Usage: \"java UserCrimeStatsApp Crime.csv");
            return;
        }

        // Grabs the crime list.
        ArrayList<USCrimeClass> crimeList = readFile(args[0]);
        System.out.println("Size is " + getSize());
        System.out.println(crimeList);
        System.out.println("The Year with max murder rate is " + yearWithLowestMRobberyRate());
        
    }

}
