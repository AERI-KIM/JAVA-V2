class MemberTest{
	public static void main(String [] args){

		/* Member [] member = {new Member(), new Member("��Ʈ��", 35), new Member("�丣", 1000), new Member("���̾��", 50)}; */
		
		Member [] member = new Member[100];
		
		member[0] = new Member();
		member[1] = new Member("��Ʈ��", 35);
		member[2] = new Member("�丣", 1000);
		member[3] = new Member("���̾��", 50);		
		
		
		for(int i=0; i<member.length; i++){
			if(member[i]!=null)
				System.out.println(member[i]);
		}
		
		for(Member mem:member){
			if(mem!=null)
				System.out.println(mem);
		}
		System.out.printf("�� ��ȣȸ�� ��� ���� %d���Դϴ�.", Member.getNumOfmember());
	}
}

class Member{
	//�ʵ�
	private String name;
	private int age;
	private static int numOfmember;
	
	Member(){
		this("ȫ�浿", 20);
	}
	
	Member(String name, int age){
		this.name = name;
		if(age>=0 && age<=20000)
			this.age = age;
		else this.age =25;
		numOfmember++;
	}
	
	static int getNumOfmember(){
		return numOfmember;	
	}
	
	public String toString(){
		return String.format("�̸�: %s, ����: %d", name, age);
	}
}