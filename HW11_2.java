import java.util.Scanner;
import java.io.*;

class HW11_2{
	public static void main(String [] args)throws Exception{
		Student [] stds = new Student[3];
		File f= new File("�л�����.java");
		
		if(!f.exists()){
			System.out.println("�л����� ������ �������� �ʽ��ϴ�. Ȯ�����ּ���.");
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
		this("Ȳ����", 1, 4.3);
	}
	
	Student(String n, int g, double s){
		name = n;
		grade = g;
		score = s;
	}
	
	public String toString(){
		return String.format("�̸�: %s, �г�: %d, ����: %.1f", name, grade, score);
	}
}