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

public class CreateDataStream {

    static final String dataFile = "invoicedata";
    static final double[] prices = {19.99, 9.99, 15.99};
    static final int[] units = {12, 8, 13};
    static final String[] descs = {"Java T-shirt", "Java Mug", "Duke Juggling Dolls"};

    public static void main(String[] args) throws IOException {
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
            for (int i = 0; i < prices.length; i++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
        } finally {
            out.close();
        }
    }
}
