package java_20200511;

public class identifierDemo {
	public static void main(String[] args) {
		int age = 10; // 여기에서  age를 식별자라고 함
		String name = "hello"; // 여기에서 name을 식별자라고 함
		
		//첫글자는 숫자를 사용할 수 없음.
		//String 1father = "john"; 
		
		//공백을 사용할 수 없음.
		//String mother name = "Michell";
		
		//예약어는 사용할 수 없음.
		//String void = "empty";
		
		//특수문자를 사용할 수 없음(단, $,_는 예외)
		//int @money = 1000;
		
		//자바에서 문자는 유니코드를 지원하기 때문에 세계 모든 문자를 사용할 수 있음
		String 이름 = "이상효";
		System.out.println(이름);
	}

}
