package LearningString;

import java.util.Scanner;

/*
Write a program to accept a string. Display the new string after reversing each character of the words.
INPUT:  New Delhi is the capital of India
OUTPUT: weN ihleD si eht latipac fo aidnI
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sen=sc.nextLine();
        sen=sen.trim();
        sen+=" ";
        String word=" ", rev,revSen="";
        for(int i=0;i<=sen.length();i++){
            if(sen.charAt(i)==' '){
                rev=ReverseWord(word);
                word=" ";

                revSen+=rev;
        }
            else
                word+=sen.charAt(i);
        }
        System.out.println(revSen);
    }

    public static String ReverseWord(String word) {
        String rev="";
        word=word.trim();
        for(int i=word.length()-1;i>=0;i--)
            rev+=word.charAt(i);
        return rev;
    }
}
