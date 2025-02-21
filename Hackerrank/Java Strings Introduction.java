//This exercise is to test your understanding of Java Strings.
//
//The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.
//
//Output Format
//
//There are three lines of output: 
//For the first line, sum the lengths of A and B. 
//For the second line, write Yes if A is lexicographically larger than B or No if it is not. 
//For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
//
//Sample Input
//
//hello
//java


//Sample Output
//
//9
//No
//Hello Java
//Explanation


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int n = A.length()+B.length();
        System.out.println(n);
        if(A.length()>B.length()){
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
    }
}



