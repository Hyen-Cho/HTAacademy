public class StringUtilsApp {
	public static void main(String[] args) {
		
		String name1 = StringUtils.hideName("È«±æµ¿");
		System.out.println(name1);

		String name2 = StringUtils.hideName("±è±¸");
		System.out.println(name2);

		String date1 = StringUtils.getNormalDate();
		System.out.println(date1);

		String date2 = StringUtils.getDetailDate();
		System.out.println(date2);
	}
}