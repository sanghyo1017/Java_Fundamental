package java_20200511;

public class CharacterDemo {
	public static void main(String[] args) {
		
		//유니코드 표현 =>'\u0000';
		char c1 = '\uc774';
		char c2 = '\uc0c1';
		char c3 = '\ud6a8';
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		
		//2. 아스키코드 표현
		//48-57 => 0-9
		//65-90 => A-Z
		//97-122 => a-z
		char c4 = 97;
		System.out.print(c4);
		
		//3. 문자 표현법 - 홀따옴표는 인식 가능, 역슬래시는 인식 불가능
		char c5 = '성';
		System.out.print(c5);

		
		char c6 = '"';
		char c7 = '\'';
		char c8 = '\"';
		String s1 = "\\";
		String s2 = "\"";
		String s3 = "\'";

		
		
		
				
		
		
		
		
		
		
	}

}
