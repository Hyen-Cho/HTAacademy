package kr.co.jhta.app;				// 패키지 선언

// 다른 패키지에 있는 클래스는 import구문으로
// 해당 클래스의 전체경로(패키지경로 + 클래스)를 명시해야한다.
import kr.co.jhta.vo.Student;		
import kr.co.jhta.vo.Professor;
// import kr.co.jhta.vo.*;			// *: vo 패키지 하위파일을 가져오기

public class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setNo(20);
		s1.setName("홍길동");

		System.out.println("번호 : " + s1.getNo());
		System.out.println("이름 : " + s1.getName());

		Professor p = new Professor();
		p.setName("김교수");
		System.out.println("교수명 : " + p.getName());
	}
}
