package java_20200603;

public class JdbcDemo2 {
	public static void main(String[] args) {
		//1. 드라이브를 로드한다.
		//Driver 객체를 메모리에 로드하여 자바앱과 마리아디비jar 연결
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
