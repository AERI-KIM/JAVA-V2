class Person{
	void receive(Object o) throws CanNotReceiveException{
		if(o instanceof Gift){
			if(((Gift)o).getSincerity()>=8) 
				System.out.printf("[%s]: ���� �����ϴ�. ^___^\n", o.getClass().getName());
			else if(((Gift)o).getSincerity()>=3) 
				System.out.printf("[%s]: ���� �����ϴ�.\n", o.getClass().getName());
			else  
				System.out.printf("[%s]: �����ϴ�.\n", o.getClass().getName());
		}
		else 
			throw new CanNotReceiveException();
	}
}
class CanNotReceiveException extends Exception{
	CanNotReceiveException(){
		super("���� �Ұ� ����");
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
		System.out.println("["+getClass().getName()+"]: \""+m.getTitle()+"\"��(��) ����մϴ�.");
	}
}
class AISpeaker extends Gift implements Playable{
	@Override
	public void play(Music m){
		System.out.println("["+getClass().getName()+"]: \""+m.getTitle()+"\"��(��) ����մϴ�.");
	}
}
class MP3Player extends Gift implements Playable{
	@Override
	public void play(Music m){
		System.out.println("["+getClass().getName()+"]: \""+m.getTitle()+"\"��(��) ����մϴ�.");
	}
}
class Phone extends Gift implements Playable{
	@Override
	public void play(Music m){
		System.out.println("["+getClass().getName()+"]: \""+m.getTitle()+"\"��(��) ����մϴ�.");
	}
}
interface Playable{
	void play(Music m);
}
class Music{
	private String title;
	Music(){
		this("�ֱ���");
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
		Person person = new Person();//��� ����
		Music music = new Music("���÷�");//�� ����
		Playable [] players = {new Computer(), new AISpeaker(), new MP3Player(), new Phone()}; //��� ������ �÷��̾� �迭 ����
		
		
		//���÷� ���
		System.out.println("Computer, AISpeaker, MP3Player, Phone�� ���÷� ����ϱ�");
		for(Playable player: players){
			player.play(music);
		}
		
		//���� ������ ������� players �ֱ�
		System.out.println();
		System.out.println("��� �Ѹ��� Computer, AISpeaker, MP3Player, Phone �ֱ�");
		for(Playable player: players){
			try{
				person.receive(player);
			}catch(CanNotReceiveException cnre){
				//cnre.printStackTrace();
				System.out.println("["+player.getClass().getName()+"]: ������ �ƴ� ���� ���� �ʰڽ��ϴ�. ");
			}
		}
		
		
		
	}
}