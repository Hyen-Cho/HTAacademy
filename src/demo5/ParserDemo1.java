package demo5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParserDemo1 {

	public static void main(String[] args) throws ParseException {
				
		Date now = new Date();	// 오늘
		
		String text = "1992.10.13";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");	// 내가 바꾸고 싶은 문자열을 전달
		Date weddingDay = sdf.parse(text);		// 결혼한 날
		
		long nowTime = now.getTime();
		long weddingDayTime = weddingDay.getTime();
		System.out.println("오늘 : " + nowTime);
		System.out.println("결혼한 날 : " + weddingDayTime);
		
		long date = (nowTime - weddingDayTime)/(60*60*24*1000);		// 1분*1시간*하루*밀리초
		System.out.println("경과일 : " + date);
	}
}
