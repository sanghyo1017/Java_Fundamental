package java_20200518;

public class MemberVariableRangeDemo {
	String name;
	int age;
	double weight;
	boolean isReleased;
	
	public void methodA(String id) {
		//지역변수에는 접근 한정자를 붙일 수 없다.
		//->public int test;
		//지역변수는 초기화를 하지 않아도 상관없지만 다른 곳에서 연산하면 에러 발생
		//int a; //a는 값이 없음(0이 아니라 걍 없음)
		//int b = a+10; //a가 값이 없는 상태에서 더하면 에러가 발생함
		
		//id, a, b의 유효범위는 methodA에서만 사용가능
		
	}
	
	public static void main(String[] args) {
		MemberVariableRangeDemo m = new MemberVariableRangeDemo();
		//멤버변수는 객체를 생성하면 기본값을 갖는다.
		System.out.println(m.name);         // null
		System.out.println(m.age);          // 0
		System.out.println(m.weight);       // 0.0
		System.out.println(m.isReleased);   //false
	}

}
