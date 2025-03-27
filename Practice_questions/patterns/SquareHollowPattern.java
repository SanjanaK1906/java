package interviewprep.patterns;

public class SquareHollowPattern {
	/*
	******
	*    *
	*    *
	*    *
	*    *
	******
	*/
	public void SquareHollowPattern1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||i==n || j==n){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		SquareHollowPattern s= new SquareHollowPattern();
		s.SquareHollowPattern1(6);
	}

}
