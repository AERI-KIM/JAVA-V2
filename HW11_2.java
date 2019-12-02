import java.util.Scanner;
import java.io.*;

class HW11_2{
	public static void main(String [] args)throws Exception{
		Student [] stds = new Student[3];
		File f= new File("학생정보.java");
		
		if(!f.exists()){
			System.out.println("학생정보 파일이 존재하지 않습니다. 확인해주세요.");
			System.exit(1);
		}
		
		Scanner s = new Scanner(f);
		int i=0;
		while(s.hasNext()==true){
			stds[i] = new Student(s.next(), s.nextInt(), s.nextDouble());
			i++;
		}
		
		for(Student ss :stds)
			System.out.println(ss);
		
	}
}

class Student{
	private String name;
	private int grade;
	private double score;

	Student(){
		this("황윤성", 1, 4.3);
	}
	
	Student(String n, int g, double s){
		name = n;
		grade = g;
		score = s;
	}
	
	public String toString(){
		return String.format("이름: %s, 학년: %d, 학점: %.1f", name, grade, score);
	}
}