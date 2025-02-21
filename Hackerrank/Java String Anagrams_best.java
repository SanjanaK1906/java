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
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean flag = true;
        long count1, count2; 
        if(a.length()!= b.length()){
            flag= false;
        }else{
            for(int i=0;i<a.length();i++){
            final char c= a.charAt(i);
            a=a.toLowerCase();
            b=b.toLowerCase();
            count1 = a.chars().filter(ch -> ch == c).count();
            count2=b.chars().filter(ch->ch == c).count();
            if(count1==count2){
                flag=true;
            }else{
                flag=false;
                break;
            }
        }
        }
        
        return flag;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
