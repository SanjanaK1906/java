package String_Assign;

public class Que7 {

	public static String insertChar(String input, char ch, int position) {
        if (position < 0 || position > input.length()) {
            throw new IndexOutOfBoundsException("Position out of range");
        }

        StringBuffer buffer = new StringBuffer(input);
        buffer.insert(position, ch); 

        return buffer.toString(); 
    }

    public static void main(String[] args) {
        String input = "Hello World";
        char ch = 'X';
        int position = 5;

        String result = insertChar(input, ch, position);
        System.out.println("After inserting character: " + result);
    }

}
