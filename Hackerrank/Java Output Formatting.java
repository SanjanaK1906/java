/*Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.
Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================
------------------------------------------------------------------------------------------
*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                // System.out.println(s1.length());
                // System.out.print(x);
                int len = s1.length();
                if(len<=10 && (x>=0 && x<=999)){
                    int leftlen= 15 - len;
                    System.out.print(s1);
                    for(int j=0;j<leftlen;j++){
                    System.out.print(" ");    
                    }
                    if(x<=9){
                        System.out.printf("%03d%n", x);
                    }else if(x>=10 && x<=99){
                        System.out.printf("%03d%n", x);
                    }else{
                        System.out.println(x);
                    }
                }
                
            }
            System.out.println("================================");

    }
}
