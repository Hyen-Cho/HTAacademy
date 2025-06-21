import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int studentNumbers = 0;			// 학생 수를 담을 변수
		Student[] students = null;		// 여러 명의 학생정보를 담는 배열을 생성해서 담을 변수

		for (;;) {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(" 1.학생수 입력 | 2.학생정보 입력 | 3.전체 출력 | 4.한 학생 출력 | 0.종료");
			System.out.println("--------------------------------------------------------------------------");

			System.out.print("메뉴 선택> ");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				// 학생수를 입력받는다.
				// 학생 수 만큼의 학생정보를 담는 배열을 생성해서 위에 선언한 변수에 저장한다.
				System.out.print("학생수> ");
				studentNumbers = scanner.nextInt();	
				students = new Student[studentNumbers];
			
			} else if (selectNo == 2) {
				// 학생 수만큼 학번, 이름, 국어, 영어, 수학정보를 반복해서 입력받는다.
				// Student객체를 생성해서 학생정보를 저장한다.
				// 학생정보가 저장된 Student객체를 배열에 순서대로 저장한다.

				for (int i=0; i<studentNumbers; i++) {
					System.out.print("학생번호> ");
					int sNum = scanner.nextInt();

					System.out.print("이름> ");
					String sName = scanner.next();

					System.out.print("국어 점수> ");
					int sKor = scanner.nextInt();

					System.out.print("영어 점수> ");
					int sEng = scanner.nextInt();

					System.out.print("수학 점수> ");
					int sMath = scanner.nextInt();

					Student info = new Student();
					info.number = sNum;
					info.name = sName;
					info.kor = sKor;
					info.eng = sEng;
					info.math = sMath;

					students[i] = info;

				}

			} else if (selectNo == 3) {
				// 모든 학생정보를 출력한다.
			
				for (Student x : students) {

					System.out.println(x.number + "\t" + x.name + "\t" + x.kor + "\t" + x.eng + "\t" + x.math);
				}

			} else if (selectNo == 4) {
				// 조회할 학생의 학번을 입력받는다.
				// 학생정보가 저장된 배열에서 입력된 학번에 해당하는 학생을 찾아서 출력한다.

				System.out.print("조회할 학생 번호> ");
				int num = scanner.nextInt();

				Student student = null;
				for (Student x : students) {
					if (x.number == num) {
						student = x;
						System.out.println(x.number + "\t" + x.name + "\t" + x.kor + "\t" + x.eng + "\t" + x.math);
						break;		// 반복할 필요가 없으니... 자신과 가장 가까이 있는 for문만 탈출.
						
					}
				}

				if (student != null) {
					System.out.println(student.no + "\t" + student.name);
				} else {
					System.out.println("학생정보 없음");
				}


							
			} else if (selectNo == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}