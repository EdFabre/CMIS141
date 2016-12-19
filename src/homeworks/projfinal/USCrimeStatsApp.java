package homeworks.projfinal;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class USCrimeStatsApp {
    static Scanner input = new Scanner(System.in);
    /**
     * function to display menu to user
     */
    static void displayMenu() {
        String menu = "\nEnter the number of the question you want answered. Enter ‘Q’ to quit the program :\n" +
                        "1. What were the percentages in population growth for each consecutive year from 1994 – 2013?\n" +
                        "2. What year was the Murder rate the highest?\n" +
                        "3. What year was the Murder rate the lowest?\n" +
                        "4. What year was the Robbery rate the highest?\n" +
                        "5. What year was the Robbery rate the lowest?\n" +
                        "6. What was the total percentage change in Motor Vehicle Theft between 1998 and 2012?\n" +
                        "7. What was the total percentage change in property crimes between 2011 and 2013?\n" +
                        "8. What was the total percentage change in murder crimes between 2012 and 2013?\n" +
                        "Q. Quit the program";
        System.out.println(menu);
    }
    
    /**
     * function takes user choice for menu
     * @return returns choice selected by user
     */
    static String getUserInput() {
        String choice;
        System.out.print("\nEnter your selection: ");
        choice = input.next();
        return choice;
    }
    
    /**
     * function returns the highest murder rate for a year
     * @param data
     * @return year with highest murder rate
     */
    static int yearWithHighestMurderRate(USCrimeClass[] data) {
        int year = 0;
        float maxRate = 0;
        for (USCrimeClass crime : data) {
            if (crime.getMurderRate() > maxRate) {
                maxRate = crime.getMurderRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    /**
     * function returns the lowest murder rate for a year
     * @param data
     * @return year with lowest murder rate
     */
    static int yearWithLowestMurderRate(USCrimeClass[] data) {
        int year = 0;
        float minRate = data[0].getMurderRate();
        for (USCrimeClass crime : data) {
            if (crime.getMurderRate() < minRate) {
                minRate = crime.getMurderRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    
    /**
     * function returns year with highest robbery rate
     * @param data
     * @return year with highest robbery rate
     */
    static int yearWithHighestRobberyRate(USCrimeClass[] data) {
        int year = 0;
        float maxRate = 0;
        for (USCrimeClass crime : data) {
            if (crime.getRobberyRate() > maxRate) {
                maxRate = crime.getRobberyRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    
    /**
     * function returns year with lowest robbery rate
     * @param data
     * @return year with lowest robbery rate
     */
    static int yearWithLowestMRobberyRate(USCrimeClass[] data) {
        int year = 0;
        float minRate = data[0].getRobberyRate();
        for (USCrimeClass crime : data) {
            if (crime.getRobberyRate() < minRate) {
                minRate = crime.getRobberyRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    
    /**
     * function calculates the percentage change in motor vehicle theft between 1998-2012
     * @param data
     * @return 
     */
    static float getPercentageChangeInMotorVehicleTheftBetween1998_2012(USCrimeClass[] data) {
        float change;
        int motorVehicleTheftIn1998 = data[4].getMotorVehicleTheft();
        int motorVehicleTheftIn2012 = data[18].getMotorVehicleTheft();
        change = (float)(motorVehicleTheftIn2012 - motorVehicleTheftIn1998) * 100 / motorVehicleTheftIn1998;
        return change;
    }
    
    /**
     * function calculates the percentage change in murder crime rate between 2012 and 2013
     * @param data
     * @return 
     */
    static float getPercentageChangeInMurderCrimeRateBetween2012_2013(USCrimeClass[] data) {
        float change;
        float murderRateIn2012 = data[18].getMurderRate();
        float murderRateIn2013 = data[19].getMurderRate();
        change = (murderRateIn2013 - murderRateIn2012) * 100/murderRateIn2012;
        return change;
    }
    
    /**
     * function calculates the percentage change in property crime rate between 2011-2013
     * @param data
     * @return 
     */
    static float getPercentageChangeInPropertyCrimeBetween2011_2013(USCrimeClass[] data) {
        float change;
        int propertCrimeIn2011 = data[17].getPropertyCrime();
        int propertCrimeIn2013 = data[19].getPropertyCrime();
        change = (float)(propertCrimeIn2013 - propertCrimeIn2011) * 100/propertCrimeIn2011;
        return change;
    }
    
    /**
     * function displays the percentage population for each consecutive year
     * @param data 
     */
    static void displayPercentagePopulationGrowth(USCrimeClass[] data) {
        float growth;
        for(int i = 0; i < data.length - 1; i++) {
            growth = 100* (float)(data[i+1].getPopulation() - data[i].getPopulation())/data[i].getPopulation();
            System.out.println("[" + data[i].getYear() + "-" + data[i+1].getYear() + "]: " + String.format("%.4f",growth) + "%");
        }
    }
    
    /**
     * function handles the choice given by the user
     * @param data 
     */
    static void handleMenu(USCrimeClass[] data) {
        String choice;
        do {
            displayMenu();
            choice = getUserInput();
            System.out.println();
            switch(choice) {
                case "1":
                    displayPercentagePopulationGrowth(data);
                    break;
                case "2":
                    System.out.println("The Murder rate was highest in " + yearWithHighestMurderRate(data));
                    break;
                case "3":
                    System.out.println("The Murder rate was lowest in " + yearWithLowestMurderRate(data));
                    break;
                case "4":
                    System.out.println("The Robbery rate was highest in " + yearWithHighestRobberyRate(data));
                    break;
                case "5":
                    System.out.println("The Robbery rate was lowest in " + yearWithLowestMRobberyRate(data));
                    break;
                case "6":
                    System.out.println("Total Percentage change in motor vehicle theft between(1998-2012) is " + String.format("%.4f",getPercentageChangeInMotorVehicleTheftBetween1998_2012(data)) +"%");
                    break;
                case "7":
                    System.out.println("Total Percentage change in property crimes between 2011 and 2013 is " + String.format("%.4f",getPercentageChangeInPropertyCrimeBetween2011_2013(data)) + "%");
                    break;
                case "8":
                    System.out.println("Total Percentage change in murder crimes between 2012 and 2013 is " + String.format("%.4f",getPercentageChangeInMurderCrimeRateBetween2012_2013(data)) + "%");
                    break;
                case "Q":
                    System.out.println("Thank you for trying the US Crimes Statistics Program.");
                    return;                
                default:
                    System.out.println("Error: Invalid choice selected!! Try again.\n");
            }
        }while(true);
    }
    
    /**
     * function reads the Crime.csv file and returns the USCrime Objects for each year
     * in an array
     * @param filename
     * @return 
     */
    static USCrimeClass[] readFile(String filename) {
        //create an array to store stats data fpr 20 years[1994-2013]
        USCrimeClass[] crimeData = new USCrimeClass[20];
        int count = 0;
        String line;
        try {
            //read file
            Scanner fileReader = new Scanner(new FileInputStream(new File(filename)));
            fileReader.nextLine(); //skip the first line. It contains only labels
            while(fileReader.hasNextLine()) {
                line = fileReader.nextLine();
                //split line ','
                String[] stats = line.split(",");
                crimeData[count] = new USCrimeClass(Integer.parseInt(stats[0]));
                crimeData[count].setPopulation(Integer.parseInt(stats[1]));
                crimeData[count].setMurderRate(Float.parseFloat(stats[5]));
                crimeData[count].setMotorVehicleTheft(Integer.parseInt(stats[18]));
                crimeData[count].pop(Integer.parseInt(stats[12]));
                crimeData[count].setRobberyRate(Float.parseFloat(stats[9]));
                count++;
            }            
        } catch(FileNotFoundException e) { //print exception if file given doesn't exist.
            System.out.println(e);
        }
        return crimeData;
    }
    
    public static void main(String[] args) {
        System.out.println("********** Welcome to the US Crime Statistical Application **************************");
        if(args.length != 1) {
            System.out.println("Usage: \"java UserCrimeStatsApp Crime.csv");
            return;
        }
            
        USCrimeClass[] crimeList = readFile(args[0]);
        handleMenu(crimeList);
    }
    
}
