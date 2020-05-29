//순서는 항상 package -> import -> class
package java_20200521;

import java.util.ArrayList;
public class WrapperDemo {
	public static void main(String[] args) {
		
		/*
		 자바1.4 이전 버전에서는 primitive data type을 collection에 저장 불가
		 즉 primitive Data type을 객체화 할 수 있는 wrapper class가 필요함 
		 다음과 같이 1을 추가할 수 없음//.list.add(1);
		 Collection에 1을 저장하기 위해서는 
		 primitive data type을 객체화 하는 Integer클래스로 변환해야함
		 */
		ArrayList list = new ArrayList();
		list.add(new Integer(1));
		
		//1. primitive data type => wrapper class( new Integer(1) )
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		
		//2. wrapper class => primitive data type( xxxValue() )
		
		int i3 = i1.intValue() + i2.intValue();
		
//******//3. String => primitive data type**************가장중요*************************//
		
		String s1 = "10";
		String s2 = "20";
		//String은 문자이므로 s1과s2를 더하면 1020이 나온다 .
		//문자10과 믄자20을 더하는 것이 아닌 숫자 10과 숫자20을 더하는 30을 출력하고 싶을 때는 아래와 같이 코딩한다.
		int i4 = Integer.parseInt(s1) + Integer.parseInt(s2);
		
		System.out.println(i4);
		
		//4. primitive data type => String
		
		String s3 = 10+"";
		String s4 = String.valueOf(10);
		
		//primitive data type이 자동으로 wrapper class로 변환하는 것을 boxing
		Integer i5 = 10;
		Integer i6 = 20;
		

		
		//wrapper class가 자동으로 primitive data type으로 변환하는 것을 unboxing
		int i7 = i5 + i6;
		
		System.out.println(i7);
		
	}

}
