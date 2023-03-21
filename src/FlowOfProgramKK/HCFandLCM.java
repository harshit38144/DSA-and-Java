package FlowOfProgramKK;

import java.util.Scanner;

// Wap to input two numbers and find their HCF and LCM
public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int h= hcf(a,b);
        int l=lcm(a,b,h);
        System.out.println("H.C.F of two numbers is "+h);
        System.out.println("L.C.M. of two numbers is "+l);
    }

    public static int lcm(int a, int b, int l) {
        return (a*b)/l;
    }

    public static int hcf(int a, int b) {
        int l=1, p=a*b;
        for(int i=1;i<=p;i++){
            if(a%i==0 && b%i==0)
                l=i;
        }
        return l;
    }
}
