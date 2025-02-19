/*
Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        scanner.close();
         NumberFormat  n = NumberFormat.getCurrencyInstance(Locale.US);
         String us = n.format(d);
         
         NumberFormat  n1 = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
         String in = n1.format(d);
         
         NumberFormat  n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
         
         String ch = n2.format(d);
         
         NumberFormat  n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
         String fr = n3.format(d);
        System.out.println("US: "+us);
        System.out.println("India: "+in);
        System.out.println("China: "+ch);
        System.out.println("France: "+fr);
        
    }
}
