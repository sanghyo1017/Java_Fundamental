package java_20200520;

public class SubDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s1 = new Super();
		System.out.println(s1.age);
		s1.playBadook();
		s1.work();
		
		//--------------------------------------------------------------------------------
		
		Sub s2 = new Sub();
		System.out.println(s2.height);
		s2.playGame();
		s2.work();//work는 오버라이딩 되었기 때문에 super의 work는 호출 불가
		
		//부모의 메서드
		s2.age = 25;
		System.out.println(s2.age);
		s2.playBadook();
		
		
		//---------------------------------------------------------------------------------
		
				
		Super s3 = s2;//s2가 가르키는 것을 s3도 가르킨다.
		//reference이므로 같은 것을 참조한다 (새로운s3가 가르키는 객체가  만들어지는 것이 아님)
		System.out.println(s3.age);
		s3.playBadook();
		s3.work();
		
		//Sub의 변수 호출 불가
		//s3.height = 20;
		//s3.playGame();
		
		
		
		
		
		
		

	}

}
