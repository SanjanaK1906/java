package String_Assign;

public class Que6 {
	public static String deleteFirstChar(String i) {
		StringBuffer b=new StringBuffer(i);
		b.deleteCharAt(0);
		return b.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello World";
        String result = deleteFirstChar(input);
        System.out.println("Before deleting first character: " + input);
        System.out.println("After deleting first character: " + result);
	}

}
