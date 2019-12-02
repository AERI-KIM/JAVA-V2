class ParseInt{
	public static void main(String [] args){
		String [] strNbrs = {"9", "13", "1", "7", "4"};
		try{
			int [] nbrs = transInt(strNbrs);
			for(int n:nbrs){
				System.out.printf("%d ", n);
			}
			System.out.println();
		}catch(NumberFormatException nfe){
			System.out.println("배열 성분을 정수로 변환하는 과정에서 예외가 발생했습니다. 배열 성분을 확인해주세요. ");
		}
		System.out.println("프로그램은 비정상 종료 되지 않습니다. ");
	}
	static int [] transInt(String [] s) throws NumberFormatException{
		int [] nbrs = new int[s.length];
		
		for(int i=0; i<s.length;i++){
			nbrs[i] = Integer.parseInt(s[i]);
		}
		
		return nbrs;
	}
}