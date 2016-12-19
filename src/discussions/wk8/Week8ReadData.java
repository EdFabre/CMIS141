package discussions.wk8;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ed Fabre
 */
public class Week8ReadData {

    /**
     * Input the name of the file including it's extension.
     *
     * @param nameOfFile
     */
    private static void fileRead(String nameOfFile) {
        // 
        try {
            //Grabs file from src directory.
            File directory = new File(".");
            File file = new File(directory.getCanonicalPath() 
                    + File.separator + nameOfFile);
            BufferedReader buffReader = new BufferedReader(new FileReader(file));
            int count = 0;
            String readLine = null;
            // Checks that the line is not empty.
            while ((readLine = buffReader.readLine()) != null) {
                System.out.println(readLine);
                count++;
            }
            System.out.println("A total of " + count + " lines were read.");
            // Must always close the reader.
            buffReader.close();

        } catch (IOException ex) {
            System.out.println("Your program threw exception: "
                    + ex.getMessage());
        }

    }

    public static void main(String[] args) {
        fileRead("Test.txt");
    }
}
