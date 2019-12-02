//상속의 장점2: 자식클래스의 객체들을 부모클래스의 배열로 그룹핑 할 수 있다. 

/*
	PlayTest: 지휘자가 연주자들에게 지휘함. 
	
	Conductor 클래스 
	 - conduct(연주자들): 매개변수로 받은 연주자들을 지휘함. 
	
	Pianist 클래스 
	 - play(): 피아노를 연주합니다. 
	Cellist 클래스 
	 - play(): 첼로를 연주합니다. 
	Violinist 클래스 
	 - play(): 바이올린을 연주합니다. 
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
		System.out.println("연주합니다. ");
	}
}
class Pianist extends Player{
	@Override
	void play(){
		System.out.print("피아노를 ");
		super.play();
	}
}
class Cellist extends Player{
	@Override
	void play(){
		System.out.print("첼로를 ");
		super.play();
	}
}
class Violinist extends Player{
	@Override
	void play(){
		System.out.print("바이올린을 ");
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










