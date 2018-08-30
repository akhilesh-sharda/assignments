package incrementalassignment5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        Pattern p = Pattern.compile("^[A-Z].*[.+]");
        Pattern p1 = Pattern.compile(".");
        Matcher m = p.matcher(str);
        Matcher m1 = p1.matcher(str);
        if (m.matches()) {
            System.out.println("the string starts with a capital alphabet and ends with a period");
        } else
            System.out.println("the string doesnt start with a capital alphabet and ends with a period");
    }
}

