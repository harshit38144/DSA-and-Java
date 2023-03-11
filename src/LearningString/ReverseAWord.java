package LearningString;

import java.util.Scanner;

public class ReverseAWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String str=sc.next();
        String rev=reverseWord(str);
        System.out.println("Reverse of the word is "+rev);
    }

    public static String reverseWord(String str) {
        str=str.trim();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
}
