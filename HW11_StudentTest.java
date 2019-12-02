import java.util.Scanner;
import java.io.*;
class Student{
	private String name;
	private int grade;
	private double score;
	
	Student(){}
	Student(String name, int grade, double score){
		this.name = name;
		
		if(grade>0 && grade<=6) this.grade = grade;
		else this.grade = 1;
		
		if(score>=0 && score<=4.3) this.score = score;
		else this.score = 3.0;
	}
	
	public String toString(){
		return String.format("이름: %s, 학년: %d, 학점: %.1f", this.name, this.grade, this.score);
	}
}


class StudentTest{
	public static void main(String [] args) throws Exception{
		Student [] students = new Student[3];
		
		File input = new File("학생정보.java");		
		
		if(!input.exists()){
			System.out.printf("\"%s\" 파일이 존재하지 않습니다. 확인해주세요.\n", input.getName());
			Ststem.exit(1);
		}
		
		Scanner s = new Scanner(input);
		int i=0;
		
		while(s.hasNext()){//군더더기 없이 문자열 정수 실수로만 구성되어 있으므로 아래와 같이 작성 가능
			students[i] = new Student(s.next(), s.nextInt(), s.nextDouble());
			i++;
		}
		
		s.close();//안 닫더라도 당장에 (PrintWriter 처럼)문제가 발생하지는 않지만 스캐너도 닫아 주는게 좋음.
		
		for(Student student:students){
			System.out.println(student);
		}
		
		
	}
}