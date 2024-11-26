package java_FinalAssignment.Que1;

public class Car {
	String make;
	String model;
	int year;
	String color;
	
	Car(){
		make="unknown";
		model="base";
		year=0;
		color="unknown";
	}
	Car(String make, String model,int year,String color){
		this.make=make;
		this.model=model;
		this.year=year;
		this.color=color;
	}
	public void display() {
		System.out.println("***********car details************");
		System.out.println("make:-"+make);
		System.out.println("model:-"+model);
		System.out.println("year:-"+year);
		System.out.println("color:- "+color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car breeza = new Car("maruti suzuki","breeza",2022,"silver");
		breeza.display();
		Car nexon = new Car("tata","nexon",2023,"white");
		nexon.display();
		Car test = new Car();
		test.display();
		
	}

}
