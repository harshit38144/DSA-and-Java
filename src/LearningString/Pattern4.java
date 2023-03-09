package LearningString;

import java.util.Scanner;
/*
j
ee
uuu
llll
bbbbb
 */
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();
        for(int i=0;i<=str.length()-1;i++){
            for(int j=0;j<=i;j++)
                System.out.print(str.charAt(str.length()-i-1));
            System.out.println();
        }
    }
}
