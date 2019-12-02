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
	public int compareTo(Movie m){//오름차순 정렬
		if(this.grade>m.grade) return 1;
		else if(this.grade<m.grade) return -1;
		else return 0;
	}
	public String toString(){
		return String.format("제목: %s, \t시리즈: %s, \t평점: %.2f", title, series, grade);
	}
}

class MovieTest{
	public static void main(String args []){
		Movie[] movies = {new Movie("엔드게임", "어벤져스", 9.5), new Movie("인피니티 워", "어벤져스", 9.08), new Movie("다섯 군대 전투", "호빗", 8.57), new Movie("스마우그의 폐허", "호빗", 9.06), new Movie("뜻밖의 여정", "호빗", 8.41)};
		
		//equals() test: 첫번째 영화와 두번째 영화 시리즈가 같은지 비교
		System.out.printf("\"%s\"와(과) \"%s\"는(은) %s 시리즈의 영화입니다.\n", movies[0].getTitle(),movies[1].getTitle(), movies[0].equals(movies[1])?"같은":"다른");
		
		
		//equals() test: 두번째 영화와 세번째 영화 시리즈가 같은지 비교
		System.out.printf("\"%s\"와(과) \"%s\"는(은) %s 시리즈의 영화입니다.\n", movies[1].getTitle(),movies[2].getTitle(), movies[1].equals(movies[2])?"같은":"다른");
		
		//compareTo() test:첫번째 영화와 두번째 영화 평점 단순 비교	
		
		if(movies[0].compareTo(movies[1])>0) System.out.printf("\"%s\"의 평점이 \"%s\"의 평점보다 높습니다.\n", movies[0].getTitle(), movies[1].getTitle());
		else if(movies[0].compareTo(movies[1])<0) System.out.printf("\"%s\"의 평점이 \"%s\"의 평점보다 높습니다.\n", movies[1].getTitle(), movies[0].getTitle());
		else System.out.printf("\"%s\"의 평점과 \"%s\"의 평점이 같습니다.\n", movies[0].getTitle(), movies[1].getTitle());
		
		System.out.println();
		System.out.println("영화 정렬 전: ");
		for(Movie m:movies){
			System.out.println(m);
		}
		
		//영화 평점에 따른 오름차순 정렬
		java.util.Arrays.sort(movies);
		
		System.out.println();
		System.out.println("영화 평점에 따른 오름차순 정렬 후: ");
		for(Movie m:movies){
			System.out.println(m);
		}
		
	}
}
