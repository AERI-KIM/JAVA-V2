
class ParkTest{
	public static void main(String [] args){
		Vehicle [] vehicles = {new Bike(), new Bike(3, 50), new Bike(4, 1000), new Bike(), new Car(), new Car(4, 0, "벤츠")};
		Garage g = new Garage();
		
		for(Vehicle v:vehicles){
			v.goStraight(Math.random()*50000); //배열의 원소들 임의의 거리만큼 직진시킴
		}
		System.out.println();
		for(Vehicle v:vehicles){
			g.park(v);
		}
		System.out.println();
		g.park(new Stone());
		g.park(new Garage());
	}
}
class Vehicle{
	private int numOfWheels;
	private double mileage;
	
	Vehicle(int numOfWheels, double mileage){
		this.numOfWheels = numOfWheels;
		this.mileage = mileage;
	}
	void goStraight(double dist){
		mileage += dist;
		System.out.printf("나는 %s이고, 총 주행거리는 %.2f입니다.\n", this.getClass().getName(), mileage);
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
}
class Bike extends Vehicle{	
	Bike(int numOfWheels, double mileage){
		super(numOfWheels, mileage);
	}
	Bike(){
		this(2, 0);
	}
}

class Garage{
	private int numOfVehicle;
	void park(Object o){
		if(o instanceof Vehicle){
			numOfVehicle++;
			System.out.printf("%s를 차고에 주차했습니다(총 %d대 주차됨)\n", o.getClass().getName(), numOfVehicle);
		}
		else{
			System.out.printf("%s는 주차 불가합니다. (총 %d대 주차됨)\n", o.getClass().getName(), numOfVehicle);
		}
	}
}
class Stone{}
