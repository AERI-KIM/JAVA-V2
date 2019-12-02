class Vehicle{
	private int numOfWheels;
	private double mileage;
	
	Vehicle(int numOfWheels, double mileage){
		this.numOfWheels = numOfWheels;
		this.mileage = mileage;
	}
	void goStraight(double dist){
		mileage += dist;
		System.out.printf("총 주행거리는 %.2f입니다.\n", mileage);
	}
}

class Car extends Vehicle{
	private String brand;
	
	Car(int numOfWheels, double mileage, String brand){
		super(numOfWheels, mileage);
		this.brand = brand;
	}
	Car(){
		this(4, 0, "현대자동차");
	}
	@Override
	void goStraight(double dist){
		System.out.print("나는 자동차이고, ");
		super.goStraight(dist);
	}
}
class Bike extends Vehicle{	
	Bike(int numOfWheels, double mileage){
		super(numOfWheels, mileage);
	}
	Bike(){
		this(2, 0);
	}
	@Override
	void goStraight(double dist){
		System.out.print("나는 자전거이고, ");
		super.goStraight(dist);
	}
}

class HW9_1{
	public static void main(String [] args){
		Bike b1 = new Bike();
		Bike b2 = new Bike(4, 500);
		
		Car c1 = new Car();
		Car c2 = new Car(6, 1000000, "벤츠");
		
		b1.goStraight(50);
		b2.goStraight(123);
		c1.goStraight(12345);
		c2.goStraight(50000);
		
		
	}
}