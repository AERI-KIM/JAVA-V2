class Movie implements Comparable<Movie>{
	private String title;
	private String series;
	private double grade;
	
	Movie(String title, String series, double grade){
		this.title 	= title;
		this.series	= series;
		this.grade 	= grade;
	}
	String getTitle(){
		return title;
	} 
	public boolean equals(Object o){
		if(o instanceof Movie) {
			return series.equals(((Movie)o).series);
		}
		else {
			return false;
		}
	}
	public int compareTo(Movie m){//�������� ����
		if(this.grade>m.grade) return 1;
		else if(this.grade<m.grade) return -1;
		else return 0;
	}
	public String toString(){
		return String.format("����: %s, \t�ø���: %s, \t����: %.2f", title, series, grade);
	}
}

class MovieTest{
	public static void main(String args []){
		Movie[] movies = {new Movie("�������", "�����", 9.5), new Movie("���Ǵ�Ƽ ��", "�����", 9.08), new Movie("�ټ� ���� ����", "ȣ��", 8.57), new Movie("��������� ����", "ȣ��", 9.06), new Movie("����� ����", "ȣ��", 8.41)};
		
		//equals() test: ù��° ��ȭ�� �ι�° ��ȭ �ø�� ������ ��
		System.out.printf("\"%s\"��(��) \"%s\"��(��) %s �ø����� ��ȭ�Դϴ�.\n", movies[0].getTitle(),movies[1].getTitle(), movies[0].equals(movies[1])?"����":"�ٸ�");
		
		
		//equals() test: �ι�° ��ȭ�� ����° ��ȭ �ø�� ������ ��
		System.out.printf("\"%s\"��(��) \"%s\"��(��) %s �ø����� ��ȭ�Դϴ�.\n", movies[1].getTitle(),movies[2].getTitle(), movies[1].equals(movies[2])?"����":"�ٸ�");
		
		//compareTo() test:ù��° ��ȭ�� �ι�° ��ȭ ���� �ܼ� ��	
		
		if(movies[0].compareTo(movies[1])>0) System.out.printf("\"%s\"�� ������ \"%s\"�� �������� �����ϴ�.\n", movies[0].getTitle(), movies[1].getTitle());
		else if(movies[0].compareTo(movies[1])<0) System.out.printf("\"%s\"�� ������ \"%s\"�� �������� �����ϴ�.\n", movies[1].getTitle(), movies[0].getTitle());
		else System.out.printf("\"%s\"�� ������ \"%s\"�� ������ �����ϴ�.\n", movies[0].getTitle(), movies[1].getTitle());
		
		System.out.println();
		System.out.println("��ȭ ���� ��: ");
		for(Movie m:movies){
			System.out.println(m);
		}
		
		//��ȭ ������ ���� �������� ����
		java.util.Arrays.sort(movies);
		
		System.out.println();
		System.out.println("��ȭ ������ ���� �������� ���� ��: ");
		for(Movie m:movies){
			System.out.println(m);
		}
		
	}
}
