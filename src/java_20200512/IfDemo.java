package java_20200512;

public class IfDemo {
	public static void main(String[] args) {
		//Run Configuration->Arguments
		int month = Integer.parseInt(args[0]);
		
		String season = null;
		if(month == 12 || month == 1 || month == 2) {
			season = "겨울";
		}else if(month == 3 || month == 4 || month == 5) {
			season = "봄";
		}else if(month == 6 || month ==7 || month == 8) {
			season = "여름";
		}else if(month == 9 || month == 10 || month == 11) {
			season = "가을";
		}else {
			season = "없는 계절";
			
		}
		System.out.println(month+"월은"+season+"입니다.");
		
		//if(12월 또는 1월 또는 2월이면) {계절은 겨울이다}
		//else if(3월 또는 4월 또는 5월일 경우) {계절은 봄이다}
		//else 문장은 항상 마지막에
	}

}
