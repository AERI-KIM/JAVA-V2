import java.util.Scanner;
import java.util.InputMismatchException;

public class WorkTest{
	public static void main(String [] args){
		int numOfWork, workPerEmployee;
		
		Scanner s = new Scanner(System.in);
		System.out.print("총 업무 개수: ");
		try{
			numOfWork = s.nextInt();//InputMismatchException 발생 가능: 사용자가 한글로 업무수를 입력했을 때. 
			if(numOfWork<0) throw new NegativeWorkException();//numOfWork<0인 경우, 사용자 정의 예외 NegativeWorkException를 발생!!
			
			workPerEmployee = (int)(Math.ceil(numOfWork/10.0));
			System.out.println("한 사원의 최대 업무 수: "+workPerEmployee);
		}catch(NegativeWorkException nwe){
			System.out.println("업무수는 음수일 수 없습니다.");
		}catch(InputMismatchException ime){
			System.out.println("업무수는 아라비아 숫자로 입력해주세요. ");
		}
		System.out.println("프로그램 종료!");
	}
}

class NegativeWorkException extends Exception{
	NegativeWorkException(){
		super("업무수 음수 예외");
	}
}