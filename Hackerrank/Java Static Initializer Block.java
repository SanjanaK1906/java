/*
Input Format
There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.
Constraints
Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
Sample input 1
1
3
Sample output 1
3
Sample input 2
-1
2
Sample output 2
java.lang.Exception: Breadth and height must be positive
  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int B=sc.nextInt();
        int H= sc.nextInt();
        try{
            if(B<=0 || H<=0){
                throw new IllegalArgumentException("java.lang.Exception: Breadth and height must be positive");
            }
                System.out.println(B*H);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
