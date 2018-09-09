package assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CustomerForm {

    static void formDate(String s1, String s2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        //LocalDate.parse to convert string to date format.

        LocalDate joinDate = LocalDate.parse(s1, formatter);
        LocalDate currentDate = LocalDate.parse(s2, formatter);
        System.out.println(joinDate);
        System.out.println(currentDate);

        //isBefore is a pre-defined function in LocalDate class. It checks whether one date is occuring before the other date.
        if (currentDate.isBefore(joinDate))
            System.out.println("no range");
        else {

            //getYear is  a pre-defined function in LocalDate class. gets the year.

            int year = currentDate.getYear();

            //withYear is  a pre-defined function in LocalDate class. makes the year of the date the year provided in arguments.

            joinDate = joinDate.withYear(year);

            //minusDays is  a pre-defined function in LocalDate class. gets the year. It subtracts the number of days from the date provided as arguments.

            LocalDate date1 = joinDate.minusDays(30);

            //plusDays is  a pre-defined function in LocalDate class. gets the year. It adds the number of days from the date provided as arguments.

            LocalDate date2 = joinDate.plusDays(30);
            if (date2.isAfter(currentDate))
                date2 = currentDate;
            System.out.print(date1.format(formatter) + " " + date2.format(formatter));
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
