package kr.co.jhta.app;				// ��Ű�� ����

// �ٸ� ��Ű���� �ִ� Ŭ������ import��������
// �ش� Ŭ������ ��ü���(��Ű����� + Ŭ����)�� ����ؾ��Ѵ�.
import kr.co.jhta.vo.Student;		
import kr.co.jhta.vo.Professor;
// import kr.co.jhta.vo.*;			// *: vo ��Ű�� ���������� ��������

public class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setNo(20);
		s1.setName("ȫ�浿");

		System.out.println("��ȣ : " + s1.getNo());
		System.out.println("�̸� : " + s1.getName());

		Professor p = new Professor();
		p.setName("�豳��");
		System.out.println("������ : " + p.getName());
	}
}
