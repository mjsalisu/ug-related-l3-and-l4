
import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author jamil
 */
public class IOTest {

    static int wordCount = 0;

    static void count_freq(String str) {
        Map<String, Integer> mp = new TreeMap<>();

        // Splitting to find the word
        String arr[] = str.split(" ");

        // Loop to iterate over the words
        for (int i = 0; i < arr.length; i++) {
            // Condition to check if the
            // array element is present
            // the hash-map
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }

        // Loop to iterate over the
        // elements of the map
        for (Map.Entry<String, Integer> entry
                : mp.entrySet()) {
            System.out.println(entry.getKey()
                    + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader txtData = null;
        String line;
        //int wordCount = 0;

        try {
            txtData = new BufferedReader(new FileReader("input.txt"));

            while ((line = txtData.readLine()) != null) {
                String words[] = line.split("\\s+");
                wordCount += words.length;

                String a = null;
                for (int i = 0; i < wordCount; i++) {
                    count_freq(words[i]);
                }

                
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (txtData != null) {
                txtData.close();
            }
        }

        System.out.println(
                "WordCount : " + wordCount + " Number of Words : ");

        String str = "Geeks For Geeks";

        // Function Call
        count_freq(str);

    }
}
