package assign2.orders;

public class ShippedOrder extends Order {
	final private int S_H_charge=40;
	double computePrice() {
		return ((Oquan*Ucost)+S_H_charge);
	}
}
