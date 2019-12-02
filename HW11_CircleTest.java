import java.util.Scanner;
import java.io.*;

class CircleTest{
	public static void main(String [] args) throws Exception{
		if(args.length<1){
			System.out.println("[Usage]java CircleTest 결과가저장될파일명");
			System.exit(1);
		}
		File f1 = new File(args[0]);
		if(f1.exists()==true){
			System.out.printf("\"%s\" 파일이 이미 존재합니다. 새로운 파일명을 입력해주세요. \n", f1.getName());
			System.exit(2);
		}
		File f2 = new File("원의 반지름과 넓이.java");
		if(f2.exists()==false){
			System.out.printf("\"%s\" 파일이 존재하지 않습니다. 확인해주세요. \n", f2.getName());
			System.exit(2);
		}
		PrintWriter pw = new PrintWriter(f1);
		Scanner s = new Scanner(f2);

		int radius;
		double area, rslt;
		int i=0;
		
		while(s.hasNext()){
			i++;
			radius = s.nextInt();
			area = s.nextDouble();
			rslt = radius*radius*3.14;
			if(rslt==area){
				pw.format("%d번째 원의 넓이는 제대로 구해졌습니다: 반지름(%d), 넓이(%.2f)\r\n", i, radius, area);
			}
			else{
				pw.format("%d번째 원의 넓이는 잘 못 구했습니다: 반지름이 %d일 경우, 넓이는 %.2f가 아니라 %.2f입니다.\r\n", i, radius, area, rslt);
			}
		}
			
		
		System.out.println("소스파일이 위치한 폴더에 결과 파일이 생성되었습니다. 확인해보세요. ");
	}
}