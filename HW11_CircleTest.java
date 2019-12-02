import java.util.Scanner;
import java.io.*;

class CircleTest{
	public static void main(String [] args) throws Exception{
		if(args.length<1){
			System.out.println("[Usage]java CircleTest �������������ϸ�");
			System.exit(1);
		}
		File f1 = new File(args[0]);
		if(f1.exists()==true){
			System.out.printf("\"%s\" ������ �̹� �����մϴ�. ���ο� ���ϸ��� �Է����ּ���. \n", f1.getName());
			System.exit(2);
		}
		File f2 = new File("���� �������� ����.java");
		if(f2.exists()==false){
			System.out.printf("\"%s\" ������ �������� �ʽ��ϴ�. Ȯ�����ּ���. \n", f2.getName());
			System.exit(2);
		}
		PrintWriter pw = new PrintWriter(f1);
		Scanner s = new Scanner(f2);

		int radius;
		double area, rslt;
		int i=0;
		
		while(s.hasNext()){
			i++;
			radius = s.nextInt();
			area = s.nextDouble();
			rslt = radius*radius*3.14;
			if(rslt==area){
				pw.format("%d��° ���� ���̴� ����� ���������ϴ�: ������(%d), ����(%.2f)\r\n", i, radius, area);
			}
			else{
				pw.format("%d��° ���� ���̴� �� �� ���߽��ϴ�: �������� %d�� ���, ���̴� %.2f�� �ƴ϶� %.2f�Դϴ�.\r\n", i, radius, area, rslt);
			}
		}
			
		
		System.out.println("�ҽ������� ��ġ�� ������ ��� ������ �����Ǿ����ϴ�. Ȯ���غ�����. ");
	}
}