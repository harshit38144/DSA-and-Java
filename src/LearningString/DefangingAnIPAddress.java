package LearningString;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
    Given a valid (IPv4) IP address, return a defanged version of that IP address.

      A defanged IP address replaces every period "." with "[.]".
Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
 */
public class DefangingAnIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid IP Address: ");
        String str = sc.next();
        System.out.println(defang(str));

    }
    public  static String defang(String str) {
      return   str.replace(".","[.]");
    }
}
