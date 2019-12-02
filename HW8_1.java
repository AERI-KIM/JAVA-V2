import java.util.Scanner;

class HW8_1{
	public static void main(String [] args){
		String name;
		int age;
		double grade;
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름: ");
		name = s.nextLine();
		System.out.print("나이: ");
		age = s.nextInt();
		System.out.print("학점: ");
		grade = s.nextDouble();

		

		//콘솔에서 입력받은 정보로 학생 객체 생성
		Student st = new Student(name, age, grade);

		System.out.println("학점을 4.3으로 변경합니다. ");
		st.setGrade(4.3);//학점을 4.3으로 재 설정		
		/*
			setter와 생성자가 하는 일이 비슷해 보이지만, 
			생성자는 객체 생성시에 속성을 부여하는 일을 하고, 
			setter는 생성하고 난 후 변경할 일이 생기거나 속성을 부여하고 싶을때 사용. 
			
			예시) 생성자는 이름을 처음 지어주는 것이라면, setName()이라는 setter는 개명하는 용도라고 보면 됨. 
			*/
		

		System.out.println("학생정보");
		System.out.println(st);
	}
}



class Student{
	private String name;
	private int age;
	private double grade;	

	Student(){
		this("홍길동", 20, 3.0);
	}

	Student(String name, int age, double grade){
		setName(name);//생성자에서 setter 호출 가능: setter 호출 하지 않고, this.name = name으로 작성해도 무방
		setAge(age); //나이가 유효하지 않은 값으로 들어왔을 경우 처리 가능함. 
		setGrade(grade);
	}	

	void setName(String name){
		this.name = name;
	}

	void setAge(int age){
		if(age<0||age>=200) this.age = 20; 
		else this.age = age;
	}

	void setGrade(double grade){
		if(grade<0||grade>4.3) this.grade = 3.0;
		else this.grade = grade;
	}


	String getName(){
		return name;
	}

	int getAge(){
		return age;
	}

	double getGrade(){
		return grade;
	}

	

	public String toString(){
		return String.format("이름: %s, 나이: %d, 학점: %.1f", name, age, grade);
	}

	

}