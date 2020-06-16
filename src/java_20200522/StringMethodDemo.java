package java_20200522;

public class StringMethodDemo {
	public static void main(String[] args) {
		String ssn = "111111-111118";
		//1. charAt(int index) : 문자열중에서 특정 index에 있는 문자를 반환
		char c = ssn.charAt(6);
		System.out.println(c);//111111-1111118
		
		
		//2. concat(String msg) : 문자의 연결
		ssn = ssn.concat("abcd"); //보편적인 방법 : ssb+"abcd"
		System.out.println(ssn);//abcd
		
		
		//3. endsWith(String msg) : msg 문자열로 끝나면 true or false
		String fileName = "msg";
		if(fileName.endsWith("doc")) {
			System.out.println("워드문서 입니다.");
		}
		else if(fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		}
		else {
			System.out.println("일반파일 입니다.");//일반파일입니다.
		}
		
		//4. startWith(String msg) : msg 문자열로 끝나면 true or false
		String url = "http://www.naver.com";
		String path = "/new/ssss.do?id=123";
		if(path.startsWith("/news")) {
			System.out.println("뉴스 페이지 입니다.");
		}else if(path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");//페이지가 존재하지 않습니다.
		}
		
		
		//5. equalsIgnoreCase(String msg) 
		// : 대소문자를 구분하지 않고 문자열을 비교하여 같으면 true, or false
		//이거도 겁나 개많이 쓰인다!!!!!!!!!!!!!!!!!!!!!!!!!!
		boolean success = fileName.equalsIgnoreCase("abcd.doc");
		System.out.println(success);//false
		
		
		//6. indexOf(String msg) : msg 문자열의 위치를 반환
		int index = ssn.indexOf("-");//111111-1111118
		System.out.println(index);//6
		
		
		//7.lastIndexOf(String msg) : msg문자열의 위치를 끝에서부터 찾는다 but 계산은 처음열부터
		//끝에서부터 센다 -> 원하는 문자열 찾음 -> 그럼 처음부터 세서 그 문자열이 몇번째인지 출력
		//개종요함 겁내 많이 쓰인다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		fileName = "abc.abc.abc.abc.doc";
		System.out.println(fileName.indexOf("."));//3
		System.out.println(fileName.lastIndexOf("."));//15
		
//*************배열의 길이 : length, 문자열의 길이 : length()***************//
		//trim() : 앞뒤 문자열의 공백 제거 -> 왜하는데? -> 공백으로 인해 오류가 날 수 있어서
		//공백으로 인해 shshsh1017의 문자열의 길이가 11이 될 수도 12가 될 수도 있다.
		String dbId = "shshsh1017".trim();
		String userId = "shshsh1017".trim();
		
		
		//8. substring -> 걍 공식이야 존나 외워 그냥.....
		//*(int first, int last) : first(포함)부터 second(포함x)사이의 문자열을 추출
		//*(int first) : first(포함)보다 큰 모든 문자열을 추출 (=끝까지 추출)
		fileName = "abc.doc";
		String first = fileName.substring(0,fileName.lastIndexOf("."));//abc
		//범위가 (0,3)이면 0부터 2번째열까지 출력한다.
		String last = fileName.substring(fileName.lastIndexOf("."));//.doc
		//끝에를 지정하지 않으면 끝까지 나옴 즉 4번째 열부터 끝 문자까지
		System.out.println(first);//abc
		System.out.println(last);//.doc
		
		
		//9. String replaceAll(String first, String second)
		//first 문자열을 second 문자열로 대체
		String html = "안녕하세요\n저는 이상효 입니다.\n잘 부탁드립니다.";//\n은 엔터
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);//안녕하세여
		
		
		String m1 = "Hello";
		//10. toUpperClass() : 대문자로 변환
		m1 = m1.toUpperCase();
		System.out.println(m1);
		//11. toLowerClass() : 소문자로 변환
		m1 = m1.toLowerCase();
		System.out.println(m1);
		
		
		//12. String.valueOf(~) ; primitive data type을 문자열로 변환
		char[] c1 = {'a','b','c'};
		String msg = String.valueOf(c1);
		
		System.out.println(msg);
		
		String[] str = ssn.split("-");
		
		String ssn1 = str[0];
		String ssn2 = str[1];
		
		System.out.println(ssn1);
		System.out.println(ssn2);
		
		String str2 = String.format("%,.2f", 123123.4567);
		
		//format()=System.out.printf()
		
		System.out.println(str2);//2342,345.57
		
		str2 = String.format("3%,.4f%n 2%,5.2f%n %,8.4f%n", 1234.4590,342345.5680,34234.5690);
		
		System.out.println(str2);//34,234.5690
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
