package LearningString;

import java.util.Scanner;

/*
B
L
U
E
J
 */
public class StraightLinePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String st=sc.next();
        for(int i =0;i<st.length();i++){
            System.out.println(st.charAt(i));
        }
    }
}
