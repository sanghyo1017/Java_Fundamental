package java_20200511;

public class LiteralDemo {
	public static void main(String[] args) {
		//byte 범위(-128~127) 범위를 넘어가면 overflow 발생 -> compile error
		//byte b1 = 128;
		
		int a1 = 128;//10진수 표기법
		int a2 = 076;//8진수 표기법
		int a3 = 0X123;//16진수 표기법
		int a4 = 0b1010;//2진수 표기법
		int a5 = 120;
		//int --는 내가 임의로 설정 가능
				
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		//long 리터럴은 숫자 뒤에 l 또는 L로 표기
		long l1 = 121l;
		
		//float 리터럴은 숫자 뒤에 f 또는 F로 표기
		float f1 = 123.4f;
		
		//double 리터럴은 숫자 뒤에 d 또는 D로 표기, 생략 가능
		double d1 = 123.56;
		
		//boolean 리터럴은 true 또는  false;
		boolean isExisted = false;
		
		byte b1 = 100;
		byte b2 = 100;
		byte b3 =(byte)(b1 + b2);
		
		
		

		
	}

}
