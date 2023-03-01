package LearningString;

import java.util.Scanner;

/*
Write a program to accept a character and check it's case otherwise check wheter it is a digit or a special character.
 */
public class CheckCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        int ch=sc.next().trim().charAt(0);
        if(Character.isLetter(ch)==true){
            if(Character.isUpperCase(ch)){
                System.out.println((char)ch+" is an Upper case letter.");
            }else
                System.out.println((char)ch+" is a lower case letter");
        } else if (Character.isDigit(ch)) {
            System.out.println((char)ch+" is a digit");
        }else
            System.out.println( (char)ch +" is a special character.");
    }
}
