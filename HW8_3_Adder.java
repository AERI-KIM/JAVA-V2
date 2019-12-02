/* 원 코드: static에서 non-static 멤버 사용하기 때문에 컴파일 에러 발생 
class Adder{
	double x = 1;
	double y = 4;
	
	public static void main(String [] args){
		System.out.println(x+y);//static에서 non-static인 x, y사용 불가. 
		//따라서 아래의 두 방법 중 하나를 택해야 함 
	}
}
*/
/* 방법 1

class Adder{
	//방법 1: 두 필드를 모두 static으로 둔다. 
	static double x = 1;
	static double y = 4;
	
	public static void main(String [] args){
		System.out.println(x+y); //static에서 static인 x, y 사용 가능! 
	}
}

*/
/* 방법 2
class Adder{
	double x = 1;
	double y = 4;
	
	public static void main(String [] args){
		//방법 2: non-static인 x,y는 객체를 나서 접근한다.
		Adder a = new Adder();//Adder 클래스에서 Adder 객체 생성 가능
		System.out.println(a.x+a.y);  //static에서 non-static 멤버라도 객체를 생성한 후 접근하는 건 가능
	}
}

*/