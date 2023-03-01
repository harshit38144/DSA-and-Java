package LearningString;

import java.util.Scanner;

/*
b
bl
blu
blue
bluej
 */
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String str=sc.next();
        for(int i =0;i<=str.length();i++)
            System.out.println(str.substring(0,i));
    }
}
