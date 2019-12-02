import java.util.*;
import java.io.*;
class HW11_1{
	public static void main(String [] args) throws Exception{
		if(args.length==0){
			System.out.println("[Usage]java HW11_1 �������������ϸ�");
			System.exit(1);
		}
		
		File f1 = new File("���� �������� ����.java");
		File f2 = new File(args[0]);
		
		if(!f1.exists()){
			System.out.println("���� �������� ���� ������ �������� �ʽ��ϴ�. Ȯ�����ּ���.");
			System.exit(2);
		}
		
		if(f2.exists()){
			System.out.println("��������� �̹� �����դ���. ���ο� ���ϸ��� �Է����ּ���.");
			System.exit(3);
		}
		
		Scanner s = new Scanner(f1);
		PrintWriter pw = new PrintWriter(f2);
		int r, i=0;
		double area;
		
		while(s.hasNext()==true){
			r = s.nextInt();
			area = s.nextDouble();
			i++;
			
			if(area==r*r*3.14)	
				System.out.printf("%d��° ���� ���̴� ����� ���������ϴ�.: ������(%d), ����(%.2f)",i, r, area);
			else
				System.out.printf("%d��° ���� ���̴� �߸� ���߽��ϴ�.: ������%d�� ��� ���̴� %.2f�� �ƴ϶� %.2f �Դϴ�.",i, r, area, r*r*3.14);
		}
	}
}