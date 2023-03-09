package LearningString;

import java.util.Scanner;

/*
 bluej
 luej
 uej
 ej
 j
 */
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.next();
            for(int j=0;j<=str.length();j++)
                System.out.println(str.substring(j,str.length()));

    }
}
