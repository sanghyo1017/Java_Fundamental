package java_20200512;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 달력 만들기
		 * 1. 1년 1월 1일 월요일
		 * 2. 1년은 365일이고, 윤년일때는 366일
		 * 3. 윤년은 4년마다 발생하고, 그 중에 100의 배수는 제외하고, 400배수는 제외하지 않는다.
		 * 4. 2020년 5월 12일은 무슨요일 일까요?
		 * 5. (2019년까지 총일수 + 4월까지 총일수 + 12일)/7의 나머지가
		 *    1이면 월요일, 2이면 화요일, 3이면 수요일,.....
		 * 6. {(365x2019)+(1x(2019/4의몫))-(1x(2019/100)의몫)+(1x(2019/400)의몫)+31+29+31+30+12}
		 *    /7의 나머지 ->%7
		 */
		
		int year = 2020;
		int month = 5;
		int day = 12;
		//지정된 값이 아니고 내가 구해야할 값은 임의로 0
		int totalCount = 0;
		int rest = totalCount%7;
		String message = null;
		
		int preYear = year-1;
		
		//2019년 총 일 수 
		totalCount = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		//2020년 1월부터 4월까지 총 일 수
		totalCount += 31 + 29 + 31 + 31;
		
		//2020년 5월1일부터 12일까지 총 일 수
		totalCount += day;
		
		System.out.println(totalCount);
		System.out.println(rest);
		
		
		if(rest==1) {
			message = "월요일";
		}
		else if(rest==2) {
			message = "화요일";
		}
		else if(rest==3) {
			message = "수요일";
		}
		else if(rest==4) {
			message = "목요일";
		}
		else if(rest==5) {
			message = "금요일";
		}
		else if(rest==6) {
			message = "토요일";
		}
		else if(rest==0) {
			message = "일요일";
		}
			
		
		
		System.out.println(year+"년"+month+"월"+day+"일은"+message+"입니다.");
		
		
		
		
		
	}

}
