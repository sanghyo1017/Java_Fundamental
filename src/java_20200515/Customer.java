package java_20200515;
//Customer 클래스
public class Customer {
	//클래스의 멤버 변수 ->
	//1. instance 변수(개인적인 변수 - 이름,폰), 
	//2. static 변수(공통적인 변수 - 이자율), 
	//3. final 변수(절대 바꿀 수 없는 변수 - 
	//인스턴스 변수(*자료형 앞 뒤에 아무것도 안붙어있음)
	//객체가 생성될 때만 만들어지는 변수!! 당연한것
	//(ex. customer1이라는 객체가 만들어져야 customer1의 name, email등의 변수가 만들어진다)
	public String name;
	public String email;
	public String phone;
	public double balance;
	public boolean isReleased;
	public static double interestRate;
	//이자율은 객체 개인만의 것이 아닌 모든 객체가 공유하는 것이기 때문에 static변수를 사용해야함
	public static final String BANKNAME = "신한은행";
	//final 변수는 거의 대부분 static final 변수를 쓴다
	//상수는 대문자로 쓰는 것이 관례이다
	//상수는 한 번 정해지면 값을 변경할 수 없으므로 static final 변수 사용
	
	//지역변수는 기본값이 없음 (기본값이 0인것과는 다름)
}
