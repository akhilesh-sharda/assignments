package incermentalassignment7;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.io.File;

public class CharacterCount {
    public static void main(String[] args) {
        int value;
        HashMap<Character, Integer> charCount = new HashMap<>();
        String fileName = args[0];
        BufferedReader br = null;
        FileReader fr = null;

        //reading string from the file and putting the chracters and their counts on the hashmap.
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String str;
            while ((str = br.readLine()) != null) {
                for (int i = 0; i < str.length(); i++) {
                    if (charCount.containsKey(str.charAt(i))) {
                        value = charCount.get(str.charAt(i));
                        value++;
                        charCount.put(str.charAt(i), value);
                    } else {
                        charCount.put(str.charAt(i), 1);
                    }
                }
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "No file of name '" +
                            fileName + "'");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //writing from the hashmap to a different file.

            try {
                File newFile = new File("/home/user/Documents/CharCount.txt");
                FileWriter fw = new FileWriter(newFile);
                BufferedWriter bw = new BufferedWriter(fw);
                for (Character key : charCount.keySet()) {
                    bw.write(key + "-" + charCount.get(key));
                    bw.newLine();
                }
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
