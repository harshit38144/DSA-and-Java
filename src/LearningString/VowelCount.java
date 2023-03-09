package LearningString;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
WAP to input a Sentence and count the number of Vowels in it
 */
public class VowelCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'
            ||str.charAt(i)=='A'|| str.charAt(i)=='I'||str.charAt(i)=='E'||str.charAt(i)=='O'||str.charAt(i)=='U')
                count++;
        }
        System.out.println("The number of vowels in the sentence is "+count);
    }
}
