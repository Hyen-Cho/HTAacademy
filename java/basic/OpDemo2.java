public class OpDemo2 {
	public static void main(String[] args) {
		// ���� + ���� -----> ����
		// ���ڿ� + ���ڿ� ----> �̾���̱�
		// ���ڿ� + ���� -----> �̾���̱�
		// ���� + ���ڿ� -----> �̾���̱�
	

		String str1 = "����Ư����";
		String str2 = " ���α� ���͵�";
		String str3 = str1 + str2;			// ����Ư���� ���α� ���͵�
		System.out.println(str3);		

		String str4 = 3 + 6 + "abc";		// 9abc
		String str5 = "abc" + 3 + 6;		// abc36
		System.out.println(str4);		
		System.out.println(str5);		
	}
}