import java.util.Date;
import java.text.SimpleDateFormat;

public class StringUtils {

	public static final String NORMAL_DATE_FORMAT = "yyyy-MM-dd";
	public static final String DETAIL_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

	public static String getNormalDate() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(StringUtils.NORMAL_DATE_FORMAT);
		return sdf.format(now);
	}

	public static String getDetailDate() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(StringUtils.DETAIL_DATE_FORMAT);
		return sdf.format(now);
	}

	// 홍길동 ---> 홍**
	// static 메소드는 바로사용 가능.
	public static String hideName(String username) {
		StringBuilder sb = new StringBuilder();
		sb.append(username.substring(0, 1));

		for (int i=0; i<username.length()-1; i++) {
			sb.append("*");
		}
		return sb.toString();
	}
}