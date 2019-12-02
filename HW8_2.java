class HW8_2{
	public static void main(String [] args){
		//동호회원 4명 생성
		Member m1 = new Member();
		Member m2 = new Member("앤트맨", 35);
		Member m3 = new Member("토르", 1000);
		Member m4 = new Member("아이언맨", 50);		

		//동호회원 정보 출력
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3);//.toString()생략 가능
		System.out.println(m4);
		
		System.out.println("이 동호회의 멤버 수는 "+Member.getNumOfMember()+"명입니다.");
	}
}



class Member{
	private String name; 
	private int age;
	static private int numOfMember;		

	Member(){
		this("홍길동", 20);
	}

	Member(String name, int age){
		this.name = name;
		if(age>=0 && age<=10000) this.age = age;
		else this.age = 25;//나이가 유효하지 않다면 25세로 초기화
		numOfMember++;
	}
	
	public String toString(){
		return String.format("이름: %s, 나이: %d", name, age);
	}
	
	static int getNumOfMember(){
		return numOfMember;
	}
}