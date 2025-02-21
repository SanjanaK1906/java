/*
 palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most  50 lower case english letters.
Sample Input

madam
Sample Output

Yes

*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len = A.length();
        String s1;
        String s2;
        StringBuilder s3= new StringBuilder();
        if (len%2== 0){
            s1 = A.substring(0, len/2);
            s2 = A.substring((len/2)+1, len);
        }else{
            s1 = A.substring(0, (len/2)+1);
            s2 = A.substring((len/2), len);
        }
        s3.append(s2);
        s3.reverse();
        s2= s3.toString();
        if(s1.compareTo(s2)==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}



