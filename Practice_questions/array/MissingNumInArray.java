package interviewprep.Array;

public class MissingNumInArray {
	public static void MissingNumInArr(int arr[]) {
		int len = arr.length+1; //length+missing num
		//sum of num= n*(n+1)/2     ->n is highest num
		int sum=(len*(len+1))/2;
		for(int i=0;i<len-1;i++) {
			sum-=arr[i];
		}
		System.out.println("Missing number is "+sum);
		}
	public static void main(String[] args) {
		int[]arr= {1,3,2,4,6};
		MissingNumInArray.MissingNumInArr(arr);
	}

}
