package interviewprep.Array;
import java.util.HashMap;

public class FreqOfEleInArray {
	public <T> HashMap<T,Integer> FreqOfElearr(T[]arr) {
		HashMap<T,Integer> hs= new HashMap<>();
		for(int i=0;i<arr.length;i++){
			int k= hs.containsKey(arr[i])?hs.get(arr[i])+1:1;
			hs.put(arr[i], k);
		}
		return hs;
	}
	public static void main(String[] args) {
		FreqOfEleInArray fa= new FreqOfEleInArray();
		// Convert int[] to Integer[] for generic method
		//Generics (<T>) don't work directly with primitive arrays like int[]
		Integer[]arr1= {1,2,4,4,5,2};
		System.out.println(fa.FreqOfElearr(arr1));
		
		Character[]arr2= {'s','i','k','k','i','m'};
		System.out.println(fa.FreqOfElearr(arr2));

	}

}
