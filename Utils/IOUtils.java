package ProgettoAlgo2021.Utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class IOUtils {

    /**
     * Runs a function that takes and returns a single string by passing an input line from System.in and printing the return value to System.out
     * @param f function to run
     */
    public static void RunIOFunction(IOFunction f) {
        System.out.println(f.RunIO(scanInputString()));
    }

    /**
     * Reads and returns one line of input from System.in
     * @return the input string
     */
    public static String scanInputString() {
        return scanString(new Scanner(System.in));
    }

    /**
     * Reads a string from the given scanner
     * @param in scanner to be used
     * @return the scanned string
     */
    public static String scanString(Scanner in) {
        return in.nextLine();
    }

    /**
     * Reads an array of strings from the given scanner separated by " " (white space)
     * @param in scanner to be used
     * @return the scanned strings
     */
    public static ArrayList<String> scanStringArray(Scanner in) {

        // scan line of text
        String line = in.nextLine();

        // convert line of text into array of strings (tokens)
        String[] tokens = line.split(" ");

        // convert array of strings into array of integers
        ArrayList<String> arr = new ArrayList<String>();
        for (String token : tokens) {
            if (!token.isEmpty()) // some tokens may be empty (e.g. with trailing spaces)
                arr.add(token);
        }

        return arr;

    }

    /**
     * Reads and parses an array of ints from the given scanner separated by " " (white space)
     * @param in scanner to be used
     * @return the scanned ints
     */
    public static ArrayList<Integer> scanIntArray(Scanner in) {
        // scan line of text
        String line = in.nextLine();

        // convert line of text into array of strings (tokens)
        String[] tokens = line.split(" ");

        // convert array of strings into array of integers
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (String token : tokens) {
            if (!token.isEmpty()) // some tokens may be empty (e.g. with trailing spaces)
                arr.add(Integer.parseInt(token));
        }

        return arr;
    }

    /**
     * Writes the given double matrix to a CSV file of the given name with "|" as the separator character and "\n" as the line separator
     * @param data
     * @param fileName
     */
    public static void saveAsCSV(double[][] data, String fileName) {

        try {

            FileWriter newWriter = new FileWriter(fileName + ".csv");

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    newWriter.write(data[i][j] + "|");
                }
                newWriter.write("\n");
            }

            newWriter.close();
            System.out.print("Successfully saved data to CSV file");

        } catch (IOException e) {
            System.out.println("An error occured when trying to write the CSV file");
            e.printStackTrace();
        }
        
    }
    
}
