package LearningString;

import java.util.Scanner;

/*
You are given a string s and an integer array indices of the same length. The string s will be shuffled
such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.
Example 1:
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"

 */
public class ShuffleString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String s=sc.nextLine();
        // int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int [] arr =new int[] {4,5,6,7,0,1,2,3};
       // System.out.println(restoreString(s,arr));
        restoreString(s,arr);
    }
    public static void restoreString(String s, int[] indices) {
        for(int i=0;i<=indices.length-1;i++){
            int j = indices[i];
            System.out.print(s.charAt(j));
        }
           // return (String)(s.charAt(i));
    }
}
// leet code solutions
/*
 public String restoreString(String s, int[] indices) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<indices.length;i++){
            int j=indices[i];
            str.append(s.charAt(j));
        }
        return str.toString();
    }
 */