public class StudentApp {
	public static void main(String[] args) {
		
		// 1. 학생정보를 저장하는 Student객체 생성
		// 2. 그 학생의 성적정보를 담는 Score객체 생성
		// 3. 1번에서 생성된 Student객체에 성적정보를 담고 있는 Score객체 전달(Setter 사용)

		Student s1 = new Student();
		s1.setNo(10);
		s1.setName("홍길동");

		Score s2 = new Score();
		s2.setKor(100);
		s2.setEng(70);
		s2.setMath(70);
		
		// Student객체의 score 필드에 Score객체 연결
		s1.setScore(s2);

		// 값 출력해보기
		int 번호 = s1.getNo();
		String 이름 = s1.getName();

		/*
		Score 점수 = s1.getScore();		// Student에 있는 Score객체 가져오기
		int 국어 = 점수.getKor();
		int 영어 = 점수.getEng();
		int 수학 = 점수.getMath();
		*/
		
		// 또다른 방법
		int 국어 = s1.getScore().getKor();
		int 영어 = s1.getScore().getEng();
		int 수학 = s1.getScore().getMath();

		System.out.println(번호);
		System.out.println(이름);
		System.out.println(국어);
		System.out.println(영어);
		System.out.println(수학);

	}
}
