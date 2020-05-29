package java_20200515;

public class CustomerDemo {
	public static void main(String[] args) {
		//클래스 객체 생성
		//Customer => 타입
		//c1 => 변수(=reference)
		//new Customer() => 객체 생성
		Customer c1 = new Customer(); // c1이라는 레퍼런스의 정보들
		c1.name = "이상효";
		c1.email = "shshsh1017@naver.com";
		c1.phone = "010-4146-1156";
		c1.balance = 1_000_000;
		c1.isReleased = false;
		
		System.out.println(c1.name);
		System.out.println(c1.email);
		System.out.println(c1.phone);
		System.out.println(c1.balance);
		System.out.println(c1.isReleased);
		
		Customer c2 = new Customer(); // c2라는 레퍼런스의 정보들
		c2.name = "손정의";
		c2.email = "son@softbank.com";
		c2.phone = "010-1234-5678";
		c2.balance = 100_000_000;
		c2.isReleased = false;

		System.out.println(c2.name);
		System.out.println(c2.email);
		System.out.println(c2.phone);
		System.out.println(c2.balance);
		System.out.println(c2.isReleased);
		
		Customer c3 = c2;
		//배열과 원리가 같음. c3가 가르키는 객체와 c2가 가르키는 객체가 같다./같은 객체를 참조한다.
		//primitive의 경우 각 각 따로 따로 할당된다.(절대 참조 불가능) 
		//하지만 reference(현재까지 배운 래퍼런스 : 배열, 클래스)의 경우 같은 객체를 참조한다.
		//reference에서는 새로운 객체를 만들기 위해서는 꼭 new를 사용해야함

		c3.name ="손마사요시";
		
		System.out.println(c2.name); //손마사요시
		
		

		
	}
	
}
