/*Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
------------------------------------------
*/
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // System.out.println(a+" "+b+" "+n);
            int sum=a;//0
            int mul =1;
            for(int j=1;j<=n;j++){
                sum = sum+(mul*b);
                mul = mul*2; 
                System.out.print(sum+" ");
            }
            System.out.println(" ");
        }
        in.close();
    }
}
