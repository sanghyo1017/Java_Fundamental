package java_20200521;

import java_20200515.Customer;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		//String클래스는 s2를 오버라이딩
		System.out.println(s1==s2);//false
		//'=='연산자는 같은 오브젝트를 참조하면  true, 다른 오브젝트를 참조하면 false
		System.out.println(s1.contentEquals(s2));//true
		
		
		/*Customer c1 = new Customer("이상효", "제주도");
		Customer c2 = new Customer("이상효", "제주도");
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1);
		System.out.println(s1);
		*/
	
	
	}
	

}
