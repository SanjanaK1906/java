package GenericandcollectionAssign;

public class Que1<T, U> {

	private T first;
    private U second;

    public Que1(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
    	Que1<String, Integer> pair = new Que1<>("Hello", 100);

        System.out.println("Initial values:");
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());

        pair.setFirst("World");
        pair.setSecond(200);

        System.out.println("\nModified values:");
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());
    }

}
