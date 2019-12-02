class Animal{
	void move(){
		System.out.format("나는 %s이고, ", getClass().getName());
	}
}
class Cat extends Animal{
	@Override
	void move(){
		super.move();
		System.out.println("달립니다.");
	}
}
class Dolphin extends Animal{
	@Override
	void move(){
		super.move();
		System.out.println("수영합니다.");
	}
}
class Dove extends Animal{
	@Override
	void move(){
		super.move();
		System.out.println("날아다닙니다.");
	}
}
class AnimalTest{
	public static void main(String [] args){
		Animal [] animals={new Cat(), new Dolphin(), new Dove()};
		for(Animal a: animals) a.move();
	}
}