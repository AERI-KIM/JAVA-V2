
class ParkTest{
	public static void main(String [] args){
		Vehicle [] vehicles = {new Bike(), new Bike(3, 50), new Bike(4, 1000), new Bike(), new Car(), new Car(4, 0, "����")};
		Garage g = new Garage();
		
		for(Vehicle v:vehicles){
			v.goStraight(Math.random()*50000); //�迭�� ���ҵ� ������ �Ÿ���ŭ ������Ŵ
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
		System.out.printf("���� %s�̰�, �� ����Ÿ��� %.2f�Դϴ�.\n", this.getClass().getName(), mileage);
	}
}

class Car extends Vehicle{
	private String brand;
	
	Car(int numOfWheels, double mileage, String brand){
		super(numOfWheels, mileage);
		this.brand = brand;
	}
	Car(){
		this(4, 0, "�����ڵ���");
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
			System.out.printf("%s�� ���� �����߽��ϴ�(�� %d�� ������)\n", o.getClass().getName(), numOfVehicle);
		}
		else{
			System.out.printf("%s�� ���� �Ұ��մϴ�. (�� %d�� ������)\n", o.getClass().getName(), numOfVehicle);
		}
	}
}
class Stone{}
