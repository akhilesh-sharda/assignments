/*----Create a java program to search through the home directory and look for files that match a regular expression. The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.---*/


package assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileSearch {

    public static void searchFiles(String pattern, String directory) {
        //reached specified directory
        File dir = new File(directory);
        Pattern p = Pattern.compile(".*" + pattern + ".*");

        int flag = 0;

        //listing all the files in the directory
        File[] files = dir.listFiles();

        for (File file : files) {
            //matching the pattern with the files. If pattern matches printing the path.
            if (file.isFile()) {
                if (p.matcher(file.getName()).matches()) {
                    System.out.println(file.getAbsolutePath());
                    flag = 1;
                }
            }
        }
        if (flag == 0)
            System.out.println("no file with this pattern");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String directory = "/home/user/Documents";
        String end = "0";
        while (true) {
            System.out.println("enter a pattern to find file or 0 to end program");
            String pattern = sc.next();
            if (pattern.equals(end))
                break;
            else {
                searchFiles(pattern, directory);
            }

        }
    }
}
