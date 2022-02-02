package lab;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author jamil
 */
public class ReverseString {

    public static void main(String[] args) throws IOException {
        try {

            FileInputStream txtData = new FileInputStream("input.txt");
            FileOutputStream txtReWrite = new FileOutputStream("output.txt");

            try (Scanner textRead = new Scanner(txtData)) {
                String txtReverse = "";
                while (textRead.hasNextLine()) {
                    String fread = textRead.next();
                    for (int i = fread.length() - 1; i >= 0; i--) {
                        txtReverse += fread.charAt(i);
                    }
                    txtReverse += " ";
                }
                byte b1[] = txtReverse.getBytes();
                txtReWrite.write(b1);
                txtReWrite.close();
                System.out.println("File read and created successful");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
