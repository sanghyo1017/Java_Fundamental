package java_20200519;

public class ClassReview { 
	public static void main(String[] args) {
		
		
		//클래스 구성요소 6가지//
		
		
		//1. ♥멤버변수
		//1-1. instance변수 ; 우리가 평소에 자주 쓰는것 (int, long, double, String 등..)
		//1-2. static변수
		//1-3. final변수(대문자로 표기->상수로 인식)
		//*접근한정자(public, protected, default, private)
		
		//2. ♥메서드
		//2-1.instance메서드에서는 모든 변수 사용 가능, 모든 메서드 호출 가능
		//2-2.static메서드에서는 static변수만 사용 가능, static메서드만 호출 가능
		//*static메서드에서 instance변수와 instance메서드를 사용 및 호출하기 위해서는 객체를 생성해야한다.
		
		//3. ♥생성자(this용법)**외울것!!
		
		//4. 다형성
		//4-1. ♥오버로딩(overloading) **정의와 작성규칙 외울것!!
		//정의 ; 같은 클래스내에서 같은 이름의 메서드를 중첩하여 사용할 수 있음
		//오버로딩 작성 규칙
		//1)한 클래스 내에서
		//2)메서드의 이름이 같아야한다.
		//3)매개변수 갯수가 달라야 한다.
		//4)매개변수 갯수가 같으면 자료형이 달라야 한다.
		//5)반환형(return type)과 접근 한정자는 같아도 되고 달라도 된다.
//♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥이 위에가 완전 중요 이 세개라도 외우자 제발♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥//
		
		//5. 캡슐화(encapsulation)
		//멤버변수를 private으로 설정하고, setter메서드 getter메서드
		
		//6. Call by value & Call by reference
		
		/*
	
		 */
	}

}

	


