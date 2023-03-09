package LearningString;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String str=sc.nextLine();
        for(int i =0;i<str.length();i++){
             char j=Character.toLowerCase(str.charAt(i));
             if(j=='e'){
                 System.out.print("*");
             }else
                 System.out.print(j);

        }
    }
}
