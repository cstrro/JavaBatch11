package syntax.class11;

public class Car {


	String make; 
	String model;
	String color;
	int year;
	int miles;
	void moveFoward() {
		System.out.println("Moving foward");
	}
	
	void applyBrakes() {
		System.out.println("Applying breaks");
	}
	
	public static void main(String[] args) {
		Car mio= new Car();
		mio.make= "Nissan";
		mio.model= "Altima";
		mio.color= "White";
		mio.year= 2020;
		mio.miles= 22500;
		
		System.out.println("I have a "+mio.make+" "+ mio.model+ " car" );
		System.out.println("Its a "+mio.year +" " + "with "+ mio.miles + " on it " );
		mio.moveFoward();

		
	}
}
