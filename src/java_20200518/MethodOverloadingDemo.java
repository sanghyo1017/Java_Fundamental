package java_20200518;

public class MethodOverloadingDemo {
	//MethodOverloadingDemo 클래스에서는 print 메서드를 4가지로 오버로딩
	//메서드오버로딩의 작성규칙
	//1. 같은 클래스 내에서
	//2. 매서드 이름은 같아야한다.
    //3. 매개변수 갯수가 같으면 자료형이 달라야 한다.//아래 경우는 자료형이 다른 경우
	//4. 매개변수 갯수가 달라야 한다.
	//5. 반환형과 접근 한정자는 같아도 되고 달라도 된다.
	
	public void print(String str) {
		System.out.println(str);
	}

	public void print(int i) {
		System.out.print(i);
	}
	
	public void print(double d) {
		System.out.print(d);
		
	}
	
	public void print(boolean b) {
		System.out.print(b);
		
	}
	
	public void pring(boolean b) {
		System.out.print(b);

	}
	
	public void test(int... a) { //... <- 꼭 세개 찍어야함
		for(int temp : a) {
			System.out.print(temp);
		}
		
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo m = new MethodOverloadingDemo();
		m.print("hello");
		m.print(100);
		m.print(10.34);
		m.print(true);
		m.test(1);
		m.test(1,2);
		m.test(1,2,3);
		
		System.out.printf("%d %d %s",1,2,"hello");
		
		
		
	}

}
