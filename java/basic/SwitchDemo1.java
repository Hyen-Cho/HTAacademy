public class SwitchDemo1 {
	public static void main(String[] args) {
		
		String grade = "�ǹ�";

		switch (grade) {
			case "���":
				System.out.println("5%�� �����˴ϴ�.");
				break;
			case "�ǹ�":
				System.out.println("3%�� �����˴ϴ�.");
				break;
			case "�����":
				System.out.println("1%�� �����˴ϴ�.");
				break;
			default:
				System.out.println("�������� �ʽ��ϴ�.");
		}
	}
}
