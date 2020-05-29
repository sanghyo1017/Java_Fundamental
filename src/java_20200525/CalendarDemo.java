package java_20200525;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		
		cal.setTimeInMillis(1589169024479l);
		
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day =cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		System.out.println(year+","+month+","+day);
		System.out.println(hour+","+minute+","+second+","+millisecond);
		
//♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥위에는 ㅈㄴ복잡함... 아래가 겁나 간단하고 좋음♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥//
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일 a hh:mm:ss");
		
		String date = sdf.format(cal.getTime());
		System.out.println(date);
	}

}
