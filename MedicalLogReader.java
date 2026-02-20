/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package groups.medicallogreader;

/**
 *
 * @author user
 */
import java.io.*;
import java.util.Scanner;
public class MedicalLogReader {




    public static void main(String[] args) {
        File medicalLogFile = new File("medicalLog.txt");
        Scanner reader = null;

        try {
            // Attempt to read the file
            reader = new Scanner(medicalLogFile);
            System.out.println("--- Medical Log Content ---");
            
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } 
        catch (FileNotFoundException e) {
            System.err.println("Error: The medical log file was not found.");
        } 
        catch (Exception e) {
            // Catching general IO or other unexpected issues
            System.err.println("An I/O error occurred while reading the file: " + e.getMessage());
        } 
        finally {
            // Ensure the scanner is closed to release system resources
            if (reader != null) {
                reader.close();
                System.out.println("--- Connection Closed ---");
            }
        }
    }
}