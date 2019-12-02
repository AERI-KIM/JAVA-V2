class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}
class InstanceOfTestSolution{
	public static void main(String [] args){
		Cat c = new Cat();
		Animal a = new Cat();
		
		//c가 고양이로 선언되었으므로(참조되고 있으므로) System.out.println(c instanceof Dog)는 컴파일 불가능
		//실행 결과는 주석 처리 참고
		System.out.println(c instanceof Animal); //true: c는 new Cat()을 통해 생성되었으므로 실제로 고양이! 고양이는 동물의 일종이기 때문에 true
		System.out.println(c instanceof Cat); //true
		//System.out.println(c instanceof Dog); //컴파일 불가
		
		
		//a가 동물로 선언되었으므로(참조되고 있으므로) 아래 모두 컴파일 가능
		System.out.println(a instanceof Animal); //true
		System.out.println(a instanceof Cat); //true
		System.out.println(a instanceof Dog); //false

		/*
		결론적으로 
		참조변수 instanceof 클래스명
		의 결과는 컴파일 불가/true/false 로 나뉠 수 있습니다. 
		
		1. 컴파일 여부는 선언된 자료형: 
				예를 들어
					Animal a = new Cat();
				의 경우에는 a의 자료형이 Animal임.
		을 보고 판단합니다. 상속관계가 있을 경우 컴파일이 되고, 상속관계가 없다면 컴파일이 되지 않습니다. 
		
		2. true/false는 어떤 생성자를 통해 생성된 객체인지를 보고 판단을 합니다. 예를 들어 
					Animal a = new Cat(); 에서 
					 - a instanceof Animal 의 결과는 a가 실제로는 고양이이고, 고양이는 동물의 일종이기 때문에 결과는 true로 나오는 것입니다. 
					 - a instanceof Cat 의 결과는 a가 실제로는 고양이이고, 고양이는 당연히 고양이의 일종이기 때문에 결과는 true입니다. 
					 - a instanceof Dog 의 결과는 a는 실제로 고양이인데, 고양이는 강아지의 일종이 아니기 때문에 결과가 false로 나오게 되는 것입니다. 
			
		
		*/			
		//혹시 이해되지 않는 부분 있으시면 heyjk90@gmail.com으로 질문 주시기 바랍니다.
		
	}
}
