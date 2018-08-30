package assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CustomerForm {

    static void formDate(String s1, String s2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate joinDate = LocalDate.parse(s1, formatter);
        LocalDate currentDate = LocalDate.parse(s2, formatter);
        System.out.println(joinDate);
        System.out.println(currentDate);

        if (currentDate.isBefore(joinDate))
            System.out.println("no range");
        else {
            int year = currentDate.getYear();
            joinDate = joinDate.withYear(year);
            //System.out.println(joinDate);
            LocalDate date1 = joinDate.minusDays(30);
            LocalDate date2 = joinDate.plusDays(30);
            if (date2.isAfter(currentDate))
                date2 = currentDate;
            //String date11 = date1.toString();
            //
            // String date22 = date2.toString();
            System.out.print(date1.format(formatter) + " " + date2.format(formatter));
            //System.out.println(date2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            formDate(s1, s2);
        }
    }
}
