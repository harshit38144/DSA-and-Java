package FlowOfProgramKK;

import java.util.Scanner;

//Write a program to enter a year and check if it is a leap year or not.
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year ");
        long year=sc.nextLong();
        long leap=year%100;
        if(leap==0){
            if(year%400==0)
                System.out.println("It is a century year and a leap year");
            else
                System.out.println("It is a century year but not a leap year");
        }
        else if(leap%4==0)
            System.out.println("It is a leap year");
        else
            System.out.println("It is not a leap year");
    }
}
