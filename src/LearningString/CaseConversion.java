package LearningString;

/*
Write a program to enter a letter. Display the new letter by changing it's case and its ASCII code.
 */
import java.util.Scanner;

public class CaseConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a letter");
        char ch=sc.next().trim().charAt(0);
        if(Character.isLetter(ch)){
            if(Character.isLowerCase(ch)){
                System.out.println(Character.toUpperCase(ch));
                System.out.println("The ASCII CODE is :-"+(int)ch);
            }else if(Character.isUpperCase(ch)){
                System.out.println(Character.toLowerCase(ch));
                System.out.println("The ASCII CODE is :-"+(int)ch);
            }
        }else
            System.out.println("The input character is not a letter.");
    }
}
