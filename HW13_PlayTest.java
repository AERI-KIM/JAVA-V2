//����� ����2: �ڽ�Ŭ������ ��ü���� �θ�Ŭ������ �迭�� �׷��� �� �� �ִ�. 

/*
	PlayTest: �����ڰ� �����ڵ鿡�� ������. 
	
	Conductor Ŭ���� 
	 - conduct(�����ڵ�): �Ű������� ���� �����ڵ��� ������. 
	
	Pianist Ŭ���� 
	 - play(): �ǾƳ븦 �����մϴ�. 
	Cellist Ŭ���� 
	 - play(): ÿ�θ� �����մϴ�. 
	Violinist Ŭ���� 
	 - play(): ���̿ø��� �����մϴ�. 
*/

class PlayTest{
	public static void main(String [] args){
		Conductor c =  new Conductor();
		Player [] players = {new Pianist(), new Pianist(), new Pianist(), new Cellist(), new Cellist(), new Cellist(), 
							new Cellist(), new Cellist(), new Cellist(), new Violinist(), new Violinist() , new Violinist(), new Violinist() };
		c.conduct(players);
		
		/*
		Pianist p1 = new Pianist();
		Pianist p2 = new Pianist();
		Pianist p3 = new Pianist();
		Cellist c1 = new Cellist();
		Cellist c2 = new Cellist();
		Cellist c3 = new Cellist();
		Cellist c4 = new Cellist();
		Cellist c5 = new Cellist();
		Cellist c6 = new Cellist();
		Violinist v1 = new Violinist();
		Violinist v2 = new Violinist();
		Violinist v3 = new Violinist();
		Violinist v4 = new Violinist();
		*/
	}
}

class Player{
	void play(){
		System.out.println("�����մϴ�. ");
	}
}
class Pianist extends Player{
	@Override
	void play(){
		System.out.print("�ǾƳ븦 ");
		super.play();
	}
}
class Cellist extends Player{
	@Override
	void play(){
		System.out.print("ÿ�θ� ");
		super.play();
	}
}
class Violinist extends Player{
	@Override
	void play(){
		System.out.print("���̿ø��� ");
		super.play();
	}
}
class Conductor{
	void conduct(Player [] players){
		for(int i=0; i<players.length; i++){
			players[i].play();
		}
		/*
		for(Player p:players){
			p.play();
		}*/
	}
}










