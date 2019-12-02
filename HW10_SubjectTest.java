class SubjectTest{
	public static void main(String [] args){
		Subject [] subjects = {new Korean(100), new English(72), new Mathematics(), new Science()};
		Student hong = new Student();
		
		for(int i=0; i<subjects.length; i++){
			hong.report(subjects[i]);
		}
	}
}

class Student{
	void report(Subject s){
		System.out.format("%s: %d\n", s.getClass().getName(), s.getScore());
	}
}
class Subject{
	private int score;
	Subject(){
		this((int)(Math.random()*101));
	}
	Subject(int score){
		this.score = score;
	}
	int getScore(){
		return score;
	}
}
class Korean extends Subject{
	Korean(){}	
	Korean(int score){
		super(score);
	}
}
class English extends Subject{
	English(){}	
	English(int score){
		super(score);
	}
}
class Mathematics extends Subject{//수학 과목 클래스 명을 Math로 둘 경우 java.lang.Math와 충돌할 수 있으므로 클래스 명을 Mathematics로 했습니다.
	Mathematics(){}	
	Mathematics(int score){
		super(score);
	}	
}
class Science extends Subject{
	Science(){}	
	Science(int score){
		super(score);
	}
}

