/* �� �ڵ�: static���� non-static ��� ����ϱ� ������ ������ ���� �߻� 
class Adder{
	double x = 1;
	double y = 4;
	
	public static void main(String [] args){
		System.out.println(x+y);//static���� non-static�� x, y��� �Ұ�. 
		//���� �Ʒ��� �� ��� �� �ϳ��� ���ؾ� �� 
	}
}
*/
/* ��� 1

class Adder{
	//��� 1: �� �ʵ带 ��� static���� �д�. 
	static double x = 1;
	static double y = 4;
	
	public static void main(String [] args){
		System.out.println(x+y); //static���� static�� x, y ��� ����! 
	}
}

*/
/* ��� 2
class Adder{
	double x = 1;
	double y = 4;
	
	public static void main(String [] args){
		//��� 2: non-static�� x,y�� ��ü�� ���� �����Ѵ�.
		Adder a = new Adder();//Adder Ŭ�������� Adder ��ü ���� ����
		System.out.println(a.x+a.y);  //static���� non-static ����� ��ü�� ������ �� �����ϴ� �� ����
	}
}

*/