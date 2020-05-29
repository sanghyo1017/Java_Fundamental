package java_20200520;

public class Super {
	int age = 50;
	public void work() {
		System.out.println("Super work()");
	}
	
	public void playBadook() {
		System.out.println("Super playBadook()");
		
	}

}

//추상클래스 -> 객체 생성을 할 수 없다. 즉, 메모리에 올리기 위해서는 자식의 도움이 필요하다.
//Super s1 = new Super(); => 불가능
//Super s1 = Sub s2 => 가능
