//using array
import java.util.Arrays;
public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean flag = false;
        if(a.length()!=b.length()){flag=false;}
        char[]a1 = a.toLowerCase().toCharArray();
        char[]a2 = a.toLowerCase().toCharArray();
        Arrays.sort(a1);
         Arrays.sort(a2);
        flag= Arrays.equals(a1, a2);
        
        return flag;
    }
