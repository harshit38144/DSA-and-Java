package LearningString;

import java.util.Scanner;
/*
Write a program to accept a name and display the initials along with the surname
Sample Input:Mohandas karamchand Gandhi
Sample OUtput:M. K. Gandhi
 */
public class InitialsAndSurname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your full name ");
        String name=sc.nextLine();
        String finalName, initials;
        name=name.trim();
        initials=name.charAt(0)+".";
        int p=name.lastIndexOf(" ");
        String lastName=name.substring(p+1,name.length());
       // System.out.println(lastName);
        for(int i=0;i<p;i++){
            if(name.charAt(i)==' ')
                initials+=name.charAt(i+1)+".";
        }
        finalName=initials+" "+ lastName;
        System.out.println(finalName);
    }
}
