//�迭 ��� ����
class HW8_2_V2{
	public static void main(String [] args){
		Member [] members = new Member[100]; //��ȣȸ�� 100�� �����Ҽ� �ִ� �迭 ����
		//��ȣȸ�� 4�� ����
		members[0] = new Member();
		members[1] = new Member("��Ʈ��", 35);
		members[2] = new Member("�丣", 1000);
		members[3] = new Member("���̾��", 50);		

		
		//��ȣȸ�� ���� ���
		for(int i=0; i<members.length; i++){
			if(members[i]!=null) //i��° ��ȣȸ���� �����Ѵٸ� 
				System.out.println(members[i]);//i��° ��ȣȸ�� ���� ���
		}
		/* //�Ǵ� �Ʒ��� ����
		for(Member member:members){
			if(member!=null)//��ȣȸ���� �����Ѵٸ� 
				System.out.println(member);
		}
		*/
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
		if(age>=0 && age<=100000) this.age = age;
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