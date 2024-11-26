package genericandcollection;
//Q 3 (without collection* Given an integer array nums, return an integer array counts
// * where counts[i] is the number of smaller elements to the right of nums[i].
//Example 1:
//Input: nums = [5,2,6,1]      Output: [2,1,1,0]
//Explanation:
//To the right of 5 there are 2 smaller elements (2 and 1).
//To the right of 2 there is only 1 smaller element (1).
//To the right of 6 there is 1 smaller element (1).
//To the right of 1 there is 0 smaller element.
public class QuestionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {5,2,6,1};
		int len =(arr.length);
		int[]result=new int[len];
		for(int i=0;i<len;i++) {
			int count=0;
			for(int j=i+1;j<=len-1;j++) {
				if(arr[i]>arr[j])
				count++;
			}
			result[i]=count;
		}
		System.out.print("[ ");
		for(int k=0;k<len;k++) {
			System.out.print(result[k]+" ");
		}
		System.out.print("]");
	}

}
