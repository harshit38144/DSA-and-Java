package FlowOfProgramKK;

import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to display MULTIPLICATION table");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(num+" * "+i+" = "+(num*i));
    }
}
