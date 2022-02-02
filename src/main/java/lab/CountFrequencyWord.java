package lab;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 * @author Jamilusalism
 */
class CountFrequencyWord {

    public static void main(String[] args) throws IOException {

        Scanner txtData = null;
        String[] listOfWords;
        int wordCounter = 0, sumOfFrequencyWord = 0;
        float ration;

        try {
            BufferedReader txtToRead = new BufferedReader(new FileReader("input.txt"));
            txtData = new Scanner(txtToRead);
            BufferedWriter txtTempWriter = new BufferedWriter(new FileWriter("output_q2.txt"));

            try (PrintWriter txtDisplayFrequency = new PrintWriter(txtTempWriter)) {
                listOfWords = new String[216];

                while (txtData.hasNext()) {
                    listOfWords[wordCounter] = txtData.next();
                    wordCounter++;
                }

                String[] frequencyWords = new String[listOfWords.length];
                frequencyWords[0] = listOfWords[0];

                int uniqueWordCounter = 1;
                for (int i = 1; i < listOfWords.length; i++) {
                    boolean wordExist = false;

                    /* loop throught and check if the WORD doesn't exist in the array */
                    for (int j = 0; j <= uniqueWordCounter; j++) {
                        if (listOfWords[i].equals(frequencyWords[j])) {
                            wordExist = true;
                        }
                    }//end for unique_word check

                    /* add the word to the array since it does exist */
                    if (!wordExist) {
                        frequencyWords[uniqueWordCounter] = listOfWords[i];
                        uniqueWordCounter++;
                    }

                }//end for

                txtDisplayFrequency.println("WordCount: " + wordCounter
                        + ", Number of Words: " + uniqueWordCounter);

                //loop and count frequency word 
                for (String frequencyWord : frequencyWords) {
                    if (null == frequencyWord) {
                        /* will break only once (refer to line 29: frequencyWords = listOfWords) */
                        break;
                    }
                    for (String word : listOfWords) {
                        if (frequencyWord.equals(word)) {
                            sumOfFrequencyWord++;
                        }
                    }

                    ration = sumOfFrequencyWord / (float) wordCounter;
                    txtDisplayFrequency.println(frequencyWord + ": " + sumOfFrequencyWord + ", " + ration);
                    sumOfFrequencyWord = 0;
                }//end for
                
                //System.out.println("Frequency word counted successful");
                JOptionPane.showMessageDialog(null, "Frequency word counted successful", "Status", INFORMATION_MESSAGE);
            }//end try PrintStream 
        } finally {
            if (txtData != null) {
                txtData.close();
            }
        }//end finally

    }//end method main
}//end class CountFrequencyWord
