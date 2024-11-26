package classTest1.question2;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=2;
		//row size =5;
		for(int i=5 ; i>0;i--) {
			for(int j=0; j<i;j++) {
					System.out.print((char)('A'+j)+" ");
			}
			//first block
			if(i != 5) {
				for(int k=0;k<space;k++) {
					System.out.print(" ");
				}
				space+=4;
			}
			//2nd block
			if(!(i==5)){
			for(int p=i-1;p>=0;p--) {
				System.out.print((char)('A'+p)+" ");
			}}else { //for first line for not printing E character
				for(int p=i-2;p>=0;p--) {
					System.out.print((char)('A'+p)+" ");
				}
			}
			System.out.println();
		}
	}
}



