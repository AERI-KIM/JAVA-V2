class MemberTest{
	public static void main(String [] args){

		/* Member [] member = {new Member(), new Member("앤트맨", 35), new Member("토르", 1000), new Member("아이언맨", 50)}; */
		
		Member [] member = new Member[100];
		
		member[0] = new Member();
		member[1] = new Member("앤트맨", 35);
		member[2] = new Member("토르", 1000);
		member[3] = new Member("아이언맨", 50);		
		
		
		for(int i=0; i<member.length; i++){
			if(member[i]!=null)
				System.out.println(member[i]);
		}
		
		for(Member mem:member){
			if(mem!=null)
				System.out.println(mem);
		}
		System.out.printf("이 동호회의 멤버 수는 %d명입니다.", Member.getNumOfmember());
	}
}

class Member{
	//필드
	private String name;
	private int age;
	private static int numOfmember;
	
	Member(){
		this("홍길동", 20);
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
		return String.format("이름: %s, 나이: %d", name, age);
	}
}