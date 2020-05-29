package java_20200515;

public class CustomerStaticDemo {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name = "홍길동";
		//static변수
		//1. 모든 객체가 공통으로 사용할 수 있는 변수
		//2. 레퍼런스(c1, c2)로 접근하지 않고 클래스 이름으로 접근한다.
		Customer.interestRate = 30.45;
		
		Customer c2 = new Customer();
		c2.name = "아무개";
		Customer.interestRate = 12.25;
		
		System.out.println(Customer.interestRate);//12.25
		//interestRate는 객체마다 있는게 아닌 공통적으로 있는 것이다.
		//즉 객체 내에 있는 것이 아니다.
		//처음엔 30.45였지만 12.25로 바뀌었기 때문에 12.25가 적용된다.
		
		
		
		
	}

}
