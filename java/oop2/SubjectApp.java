public class SubjectApp {
	public static void main(String[] args) {
		
		Subject s1 = new Subject(10, "전자기학", "홍길동");
		// getter 메소드 사용, 반환값이 있으니 그릇필요
		int no1 = s1.getNo();
		String name1 = s1.getName();
		String professor1 = s1.getProfessor();
		System.out.println("과목번호 -> " + no1);
		// s1.displayInfo();

		// setter 메소드 사용, 반환값이 없으니 그릇필요없음
		s1.setProfessor("김유신");

		Subject s2 = new Subject(20, "회로이론", "이순신");
		int no2 = s2.getNo();
		String name2 = s2.getName();
		String professor2 = s2.getProfessor();
		System.out.println("과목번호 -> " + no2);
		// s2.displayInfo();

	}
}
