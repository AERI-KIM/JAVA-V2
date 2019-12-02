class Person{
	void receive(Object o) throws CanNotReceiveException{
		if(o instanceof Gift){
			if(((Gift)o).getSincerity()>=8) 
				System.out.printf("[%s]: 정말 고맙습니다. ^___^\n", o.getClass().getName());
			else if(((Gift)o).getSincerity()>=3) 
				System.out.printf("[%s]: 정말 고맙습니다.\n", o.getClass().getName());
			else  
				System.out.printf("[%s]: 고맙습니다.\n", o.getClass().getName());
		}
		else 
			throw new CanNotReceiveException();
	}
}
class CanNotReceiveException extends Exception{
	CanNotReceiveException(){
		super("수령 불가 예외");
	}
}
class Gift{
	private int sincerity;
	Gift(){
		this((int)(Math.random()*11));
	}
	Gift(int sincerity){
		if(sincerity>=0 && sincerity<=10)
			this.sincerity = sincerity;
		else 
			this.sincerity = 5;
	}
	int getSincerity(){
		return sincerity;
	}
}
class Computer implements Playable{
	@Override
	public void play(Music m){
		System.out.println("["+getClass().getName()+"]: \""+m.getTitle()+"\"를(을) 재생합니다.");
	}
}
class AISpeaker extends Gift implements Playable{
	@Override
	public void play(Music m){
		System.out.println("["+getClass().getName()+"]: \""+m.getTitle()+"\"를(을) 재생합니다.");
	}
}
class MP3Player extends Gift implements Playable{
	@Override
	public void play(Music m){
		System.out.println("["+getClass().getName()+"]: \""+m.getTitle()+"\"를(을) 재생합니다.");
	}
}
class Phone extends Gift implements Playable{
	@Override
	public void play(Music m){
		System.out.println("["+getClass().getName()+"]: \""+m.getTitle()+"\"를(을) 재생합니다.");
	}
}
interface Playable{
	void play(Music m);
}
class Music{
	private String title;
	Music(){
		this("애국가");
	}
	Music(String title){
		this.title = title;
	}
	String getTitle(){
		return title;
	}
}
class PlayReceiveTest{
	public static void main(String [] args){
		Person person = new Person();//사람 생성
		Music music = new Music("무시로");//곡 생성
		Playable [] players = {new Computer(), new AISpeaker(), new MP3Player(), new Phone()}; //재생 가능한 플래이어 배열 생성
		
		
		//무시로 재생
		System.out.println("Computer, AISpeaker, MP3Player, Phone로 무시로 재생하기");
		for(Playable player: players){
			player.play(music);
		}
		
		//위에 생성한 사람에게 players 주기
		System.out.println();
		System.out.println("사람 한명에게 Computer, AISpeaker, MP3Player, Phone 주기");
		for(Playable player: players){
			try{
				person.receive(player);
			}catch(CanNotReceiveException cnre){
				//cnre.printStackTrace();
				System.out.println("["+player.getClass().getName()+"]: 선물이 아닌 것은 받지 않겠습니다. ");
			}
		}
		
		
		
	}
}