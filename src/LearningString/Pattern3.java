package LearningString;

import java.util.Scanner;

/*
bluej
blue
blu
bl
b
 */
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        for(int i=str.length();i>=0;i--){
            System.out.println(str.substring(0,i));
        }
    }
}
