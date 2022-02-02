
package src;

/**
 * @author jamil
 */

import java.io.*;
public class ReadStringsFromFile {
    public static void main(String[] args) {
        File file = new File("ReadStringsFromFile.java"); //create a file object
        int ch; // variable to store the current byte
        try {
            FileInputStream fin = new FileInputStream(file); // 1
            while( (ch = fin.read()) != -1) // 2
            System.out.print((char) ch); // convert to char and display it
            fin.close(); // 3
        }
        catch(FileNotFoundException e) {
            System.out.println("File " + file.getAbsolutePath() + " could not be found on file system");
        }
        catch(IOException ioe) {
            System.out.println("Exception while reading the file" + ioe);
        }
        System.out.println("\n Program is finished.");
    }
} // Output: lines of the ReadStringsFromFile.java file