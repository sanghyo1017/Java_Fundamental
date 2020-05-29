package java_20200521;

public class ImplementClassDemo {
	
	public static void main(String[] args) {
		InterA i = new ImplementClass();
		//i라는 변수의 객체 ImplementClass
		//ImplementClass안의 메서드 mA mB mC
		
		i.mA();
		
		i.mB();
		
		i.mC();
		//인터페이스에 있는 변수는 변경 불가 (final이기 때문)
		//InterA.PI = 3.14;
	}

}
