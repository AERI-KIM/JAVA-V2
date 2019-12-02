import java.util.*;
import java.io.*;
class HW11_1{
	public static void main(String [] args) throws Exception{
		if(args.length==0){
			System.out.println("[Usage]java HW11_1 결과가저장될파일명");
			System.exit(1);
		}
		
		File f1 = new File("원의 반지름과 넓이.java");
		File f2 = new File(args[0]);
		
		if(!f1.exists()){
			System.out.println("원의 반지름과 넓이 파일이 존재하지 않습니다. 확인해주세요.");
			System.exit(2);
		}
		
		if(f2.exists()){
			System.out.println("결과파일이 이미 존재합ㄴ디ㅏ. 새로운 파일명을 입력해주세요.");
			System.exit(3);
		}
		
		Scanner s = new Scanner(f1);
		PrintWriter pw = new PrintWriter(f2);
		int r, i=0;
		double area;
		
		while(s.hasNext()==true){
			r = s.nextInt();
			area = s.nextDouble();
			i++;
			
			if(area==r*r*3.14)	
				System.out.printf("%d번째 원의 넓이는 제대로 구해졌습니다.: 반지름(%d), 넓이(%.2f)",i, r, area);
			else
				System.out.printf("%d번째 원의 넓이는 잘못 구했습니다.: 반지름%d일 경우 넓이는 %.2f가 아니라 %.2f 입니다.",i, r, area, r*r*3.14);
		}
	}
}