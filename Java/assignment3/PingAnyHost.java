/*---
Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
----*/

package assignment3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.Scanner;

public class PingAnyHost {

    static void letsPing(String host) throws IOException {
        InetAddress inet = null;
        int time1 = Calendar.getInstance().get(Calendar.MILLISECOND);
        try {
            inet = InetAddress.getByName(host);
            if (inet.isReachable(5000)) {
                int time2 = Calendar.getInstance().get(Calendar.MILLISECOND);

                System.out.println("time taken to ping is " + (time2 - time1) + "ms");
            } else
                System.out.println("sorry host cant be reached");

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the IP you wanna ping");
        String host = sc.next();
        letsPing(host);
    }
}
