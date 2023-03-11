package LearningString;

import java.util.Scanner;
import java.util.Set;

/*
Write a program to extract words from a sentence
 */
public class ExtractWordsFromSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //StringBuilder sb=new StringBuilder();
        System.out.println("Enter a string ");
        String str = sc.nextLine();
        str = str.trim();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                System.out.println();
            else{
                System.out.print(str.charAt(i));
            }
    }
    }
}
