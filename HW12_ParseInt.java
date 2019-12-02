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
			System.out.println("�迭 ������ ������ ��ȯ�ϴ� �������� ���ܰ� �߻��߽��ϴ�. �迭 ������ Ȯ�����ּ���. ");
		}
		System.out.println("���α׷��� ������ ���� ���� �ʽ��ϴ�. ");
	}
	static int [] transInt(String [] s) throws NumberFormatException{
		int [] nbrs = new int[s.length];
		
		for(int i=0; i<s.length;i++){
			nbrs[i] = Integer.parseInt(s[i]);
		}
		
		return nbrs;
	}
}