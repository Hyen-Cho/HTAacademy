public class SubjectApp {
	public static void main(String[] args) {
		
		Subject s1 = new Subject(10, "���ڱ���", "ȫ�浿");
		// getter �޼ҵ� ���, ��ȯ���� ������ �׸��ʿ�
		int no1 = s1.getNo();
		String name1 = s1.getName();
		String professor1 = s1.getProfessor();
		System.out.println("�����ȣ -> " + no1);
		// s1.displayInfo();

		// setter �޼ҵ� ���, ��ȯ���� ������ �׸��ʿ����
		s1.setProfessor("������");

		Subject s2 = new Subject(20, "ȸ���̷�", "�̼���");
		int no2 = s2.getNo();
		String name2 = s2.getName();
		String professor2 = s2.getProfessor();
		System.out.println("�����ȣ -> " + no2);
		// s2.displayInfo();

	}
}
