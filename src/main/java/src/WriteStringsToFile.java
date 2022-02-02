/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author jamil
 */
import java.io.*;

public class WriteStringsToFile {

    public static void main(String args[]) {
        String newline = System.getProperty("line.separator");
// Windows uses "\n", Mac uses "\r", and Linux uses "\r\n" for newline.
        byte b3[] = newline.getBytes();
        try {
            FileOutputStream fout = new FileOutputStream("Example_2.txt");
            String s1 = "This is line 1";
            String s2 = "This is line 2";
            byte b1[] = s1.getBytes();
            byte b2[] = s2.getBytes();
            fout.write(b1);
            fout.write(b3);
            fout.write(b2);
            fout.close();
            System.out.println("File is created");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
} //output: Two lines in the file Example_2.txt
