package LearningString;

import java.util.Scanner;

/*
Write a program to accept a string and change the case of each letter of the string. Display the new String
Example
Input:WelComE TO School
Output:wELcOMe to sCHOOL
 */
public class ChangeCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))
                System.out.print(Character.toLowerCase(str.charAt(i)));
            else if (Character.isLowerCase(str.charAt(i)))
                System.out.print(Character.toUpperCase(str.charAt(i)));
            else
                System.out.print(str.charAt(i));
        }
    }
}
