public class StudentApp {
	public static void main(String[] args) {
		
		// 1. �л������� �����ϴ� Student��ü ����
		// 2. �� �л��� ���������� ��� Score��ü ����
		// 3. 1������ ������ Student��ü�� ���������� ��� �ִ� Score��ü ����(Setter ���)

		Student s1 = new Student();
		s1.setNo(10);
		s1.setName("ȫ�浿");

		Score s2 = new Score();
		s2.setKor(100);
		s2.setEng(70);
		s2.setMath(70);
		
		// Student��ü�� score �ʵ忡 Score��ü ����
		s1.setScore(s2);

		// �� ����غ���
		int ��ȣ = s1.getNo();
		String �̸� = s1.getName();

		/*
		Score ���� = s1.getScore();		// Student�� �ִ� Score��ü ��������
		int ���� = ����.getKor();
		int ���� = ����.getEng();
		int ���� = ����.getMath();
		*/
		
		// �Ǵٸ� ���
		int ���� = s1.getScore().getKor();
		int ���� = s1.getScore().getEng();
		int ���� = s1.getScore().getMath();

		System.out.println(��ȣ);
		System.out.println(�̸�);
		System.out.println(����);
		System.out.println(����);
		System.out.println(����);

	}
}
