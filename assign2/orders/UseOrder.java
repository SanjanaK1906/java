package assign2.orders;
public class UseOrder{
	void display(Order o) {
		System.out.println("Customer name "+o.getName());
		System.out.println("customer number "+o.getNum());
		System.out.println("order quantity "+o.getOquan());
		System.out.println("unit cost "+ o.getUcost());
	}
	public static void main(String[] args) {
		UseOrder u1 = new UseOrder();
		ShippedOrder s1 = new ShippedOrder();
		Order o1 = new Order();
		o1.setName("sanjana");
		o1.setNum(10);
		o1.setOquan(2);
		o1.setUcost(3);
		System.out.println("********************");
		u1.display(o1);
		System.out.println("********************");
		double result1= s1.computePrice();
		System.out.println("computed price with shipping charges  is "+result1);
		System.out.println("********************");
		double result2= o1.computePrice();
		System.out.println("computed price without shipping charges  is "+result2);
		
	}

}
