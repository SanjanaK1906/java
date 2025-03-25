package interviewprep.String.StringReverse;

import java.util.HashMap;

public class FreqOfEleInString {
	public HashMap<Character,Integer> Freqofele(String s){
		HashMap<Character, Integer> hs= new HashMap<>();
		for (int i=0;i<s.length();i++) {
			char c= s.charAt(i);
				  	int j= hs.containsKey(c)?hs.get(c)+1:1;
				  	hs.put(c, j);
		}
		return hs;
		}
	public static void main(String[] args) {
		FreqOfEleInString fs= new FreqOfEleInString();
		System.out.println(fs.Freqofele("hello"));
	}
}
