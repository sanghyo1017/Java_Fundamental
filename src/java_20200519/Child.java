package java_20200519;

public class Child extends Parent {
	String chicken;
	int money;
	public void gotoSchool() {
		System.out.println("Child gotoSchool()");
	}
	
	//overriding의 작성규칙
	//1. 상속관계가 있어야함
	//2. 메서드 이름, 매개변수 타입, 개수가 같아야함
	//3. 반환형도 같아야함
	//4. 접근 한정자는 서브의 메서드가 크거나 같아야함
	public void play(String starcraft) {
		System.out.println("Child play()");
	}
	
	public void setParentMoney(int money) {
		super.money = money;
	}
	
	public int getParentMoney() {
		return super.money;
	}

}
