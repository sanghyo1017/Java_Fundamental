package java_20200521;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.2);
		System.out.println(d1);
		
		d1 = Math.floor(4.9);
		System.out.println(d1);
		
		long l1 = Math.round(42.5);
		System.out.println(l1);
		
		d1 = 45.67;
		//소수점 2자리에서 반올림//45.67->45.7
		//방법1. d1*10
		//방법2. 456.7을 반올림
		
		d1 = d1*10;
		l1 = Math.round(d1);
		d1 = (double)l1/10;//소수점 이하가 나오기위해 double로 캐스팅
		System.out.println(d1);
		
		int a1 = (int)Math.round(43.5);
		
		a1=Math.abs(-123);
		System.out.println(a1);
		
		Math.sqrt(3);
		System.out.println(d1);
		
		d1 = Math.pow(2, 3);
		System.out.println(d1);
		
		d1 = Math.random()*45;
		System.out.println(d1);
		
	}

}
