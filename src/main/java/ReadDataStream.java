/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamil
 */
import java.io.*;

public class ReadDataStream {

    static final String dataFile = "invoicedata";

    public static void main(String[] args) throws IOException {
        DataInputStream in = null;
        double total = 0.0; // for the total price of the items in the file
        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));
            double price;
            int unit;
            String desc;
            try {
                while (true) {
                    price = in.readDouble();
                    unit = in.readInt();
                    desc = in.readUTF();
                    System.out.format("You ordered %d units of %s at $%.2f%n", unit, desc, price);
                    total += unit * price;
                }
            } catch (EOFException e) {
            }
            System.out.format("The total price is $%.2f%n", total);
        } catch(Exception e) {
            System.out.println("Error occur" + e);
        }
        finally {
            in.close();
        }
    }
}
