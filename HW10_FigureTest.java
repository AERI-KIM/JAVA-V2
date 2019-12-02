class FigureTest{
	public static void main(String args []){
		EquilateralTriangle r = new EquilateralTriangle(3);	//한변의 길이가  3인 정삼각형 생성
		System.out.println(r);
		Circle c = new Circle(3);	//반지름이 3인 원 생성
		System.out.println(c);	
		Circle c1 = new Circle();//반지름이 1인 원 생성
		System.out.println(c1);	
		if(c1.equals(c)==true)System.out.println("위의 두 원은 합동입니다. ");
		else System.out.println("위의 두 원은 합동이 아닙니다. ");
		
	}	
}
class Figure{
	protected double perimeter;	//둘레길이
	protected double area;	//넓이
	Figure(){} //여기에서 디폴트 생성자는 아무 일도 하지 않음
	Figure(double perimeter, double area){
		this.perimeter = perimeter;
		this.area = area;
	}
	public String toString(){	//(Object 클래스의)toString메서드 재정의
		return String.format("이 도형은 %s이고, 둘레는 %.2f, 넓이는 %.2f입니다.\n", this.getClass().getName(), perimeter, area); //this.getClass().getName()
	}
}

class Circle extends Figure{
	protected double radius;
	Circle(){ //디폴트 생성자는 비워둬도 되지만 여기에선 반지름이 1인 원 생성하게 작성
		this(1);
	}
	Circle(double r){	//반지름을 인자로 받아 반지름, 넓이, 둘레길이 필드 초기화
		super(Math.PI*2*r, Math.PI*r*r);
		this.radius = r;
	}
	public String toString(){	//toString메서드 재정의
		return super.toString()+"또, 반지름은 "+radius+"입니다.\n";		
	} 
	public boolean equals(Object o){
		return this.radius ==((Circle)o).radius;//물체인 o를 원으로 캐스팅(형변환)
	}
}

class EquilateralTriangle extends Figure{//원과 유사.
	protected double side;
	protected double height;
	EquilateralTriangle(){ //원과 마찬가지로 디폴트 생성자는 한변의 길이가 1인 정삼각형 생성
		this(1);
	}
	EquilateralTriangle(double s){ //한변의 길이가  s인 정삼각형 생성
		super(3*s, Math.sqrt(3)/4*s*s);
		side = s;
		height = Math.sqrt(3)/2*side;
	}
	public String toString(){
		return String.format("%s이 삼각형의 한변의 길이는 %.2f이고, 높이는 %.2f입니다.\n", super.toString(),side, height);		
	} 
}


