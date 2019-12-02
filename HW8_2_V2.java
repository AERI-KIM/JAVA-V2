//배열 사용 버전
class HW8_2_V2{
	public static void main(String [] args){
		Member [] members = new Member[100]; //동호회원 100명 저장할수 있는 배열 생성
		//동호회원 4명 생성
		members[0] = new Member();
		members[1] = new Member("앤트맨", 35);
		members[2] = new Member("토르", 1000);
		members[3] = new Member("아이언맨", 50);		

		
		//동호회원 정보 출력
		for(int i=0; i<members.length; i++){
			if(members[i]!=null) //i번째 동호회원이 존재한다면 
				System.out.println(members[i]);//i번째 동호회원 정보 출력
		}
		/* //또는 아래도 가능
		for(Member member:members){
			if(member!=null)//동호회원이 존재한다면 
				System.out.println(member);
		}
		*/
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
		if(age>=0 && age<=100000) this.age = age;
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