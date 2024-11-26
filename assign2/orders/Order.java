package assign2.orders;
public class Order {
	String cname;
	int cnum;
	double Oquan;
	double Ucost;
	void setName(String s)
	{
		cname=s;
	}
	String getName()
	{
		return cname;
	}
	void setNum(int n)
	{
		cnum=n;
	}
	int getNum()
	{
		return cnum;
	}
	void setOquan(double o)
	{
		Oquan=o;
	}
	double getOquan()
	{
		return Oquan;
	}
	void setUcost(double u)
	{
		Ucost=u;
	}
	double getUcost()
	{
		return Ucost;
	}
	
	double computePrice () {
		return Oquan*Ucost;
	}
	
	public static void main(String[] args) {
		}

}
