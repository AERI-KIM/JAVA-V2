class HW8_2{
	public static void main(String [] args){
		//��ȣȸ�� 4�� ����
		Member m1 = new Member();
		Member m2 = new Member("��Ʈ��", 35);
		Member m3 = new Member("�丣", 1000);
		Member m4 = new Member("���̾��", 50);		

		//��ȣȸ�� ���� ���
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3);//.toString()���� ����
		System.out.println(m4);
		
		System.out.println("�� ��ȣȸ�� ��� ���� "+Member.getNumOfMember()+"���Դϴ�.");
	}
}



class Member{
	private String name; 
	private int age;
	static private int numOfMember;		

	Member(){
		this("ȫ�浿", 20);
	}

	Member(String name, int age){
		this.name = name;
		if(age>=0 && age<=10000) this.age = age;
		else this.age = 25;//���̰� ��ȿ���� �ʴٸ� 25���� �ʱ�ȭ
		numOfMember++;
	}
	
	public String toString(){
		return String.format("�̸�: %s, ����: %d", name, age);
	}
	
	static int getNumOfMember(){
		return numOfMember;
	}
}