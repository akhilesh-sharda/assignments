package incermentalassignment7;

import java.io.*;
import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        int value;
        HashMap<Character, Integer> charCount = new HashMap<>();
        String fileName = args[0];
        BufferedReader br = null;
        FileReader fr = null;
        try {

            //br = new BufferedReader(new FileReader(FILENAME));
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
