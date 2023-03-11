package LearningString;

import java.util.Scanner;

/*
Wap to accept a string and display
    i. the number of lower case characters
    ii. the number of upper case characters
    iii. the number of special characters(including spaces)
    iv. the number of digits present in the string
    Sample Input: S.T.D code of New Delhi - 011
    Sample Output:
    The number of lower case characters=12
    The number of upper case characters=5
    The number of special characters=9
    The number of digits present in the string=3
 */
public class CountAndDisplayCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine();
        int cl=0, cu=0,cs=0,cd=0;
        for(int i =0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i)))
                cl++;
            else if(Character.isUpperCase(str.charAt(i)))
                cu++;
            else if(Character.isDigit(str.charAt(i)))
                cd++;
            else
                cs++;
        }
        System.out.println("The number of Lowercase Characters is= "+cl);
        System.out.println("The number of Uppercase Characters is= "+cu);
        System.out.println("The number of Special Characters is= "+cs);
        System.out.println("The number of Digits is="+cd);
    }
}
